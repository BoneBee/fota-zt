package com.intest.packageparser.file;

//import com.alibaba.fastjson.JSON;
import com.intest.common.result.ResultT;
import com.intest.dao.entity.*;
import com.intest.packageservice.service.LargePackageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * 包解析类
 * @author intest
 */
public class FileParser {
    private static Logger logger = LoggerFactory.getLogger(FileParser.class);
    /**
     * 错误信息集合
     */
    private static List<String> errors;
    /**
     * 解析结果实体实例
     */
    public static LargeZipResult largeZipResult;
    /**
     * 标定版本号正则表达式
     * Cxxxxxx
     */
    private static Pattern pattern = Pattern.compile("(C\\d{6})");
    /**
     * 零件包名称正则表达式
     * 不含标定
     */
    private static Pattern packagePattern = Pattern.compile("([A-Z]{3}E\\d{8}S\\d{6}[A-Za-z0-9-]*)");
    /**
     * 零件包名称正则表达式
     * 含标定
     */
    private static Pattern calibrationPattern = Pattern.compile("([A-Z]{3}E\\d{8}S\\d{6}C\\d{6}[A-Za-z0-9-]*)");

    /**
     * 解析原始包文件
     * @param carTypeId: 车型编号
     */
    public static void parseFile(LargePackageService largePackageService, String fileId, String carTypeId) {
        FileInfo fi = largePackageService.getFileById(fileId);
        String filePath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "packageFile" + File.separator + fi.getServerSidePath();
        String newPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "uploadFile" + File.separator + "temp";
        File f = new File(filePath);
        ZipFile zipFile = null;
        if (f.isFile()) {
            try {
                new ZipTools().extract(filePath, newPath);
                zipFile = new ZipFile(filePath);
                largeZipResult = new LargeZipResult();
                errors = new ArrayList<>();
                largeZipResult.setLargeZipId(UUID.randomUUID().toString());
                largeZipResult.setFileId(fileId);
                String largeZipName = zipFile.getName().substring(zipFile.getName().lastIndexOf(File.separator) + 1);
                largeZipResult.setLargeZipName(largeZipName);
                largeZipResult.setCarTypeId(carTypeId);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                if(!entries.hasMoreElements()){
                    String message = "解压【" + largeZipName + "】后的文件夹不能为空，必须至少有一个零件包";
                    errors.add(message);
                    largeZipResult.setSuccess(false);
                }
                List<ZipResult> zipResults = new ArrayList<>();

                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();
                    String fileName = entry.getName().substring(0, entry.getName().length() - 4);
                    checkFileName(largePackageService, fileName);
                    String suffix = entry.getName().substring(entry.getName().length() - 3);
                    ZipResult zipResult = new ZipResult();
                    zipResult.setFileId(UUID.randomUUID().toString());
                    zipResult.setZipId(UUID.randomUUID().toString());
                    zipResult.setZipName(fileName);
                    String partsType = fileName.substring(0, 3);
                    String partsId = largePackageService.getPartsId(partsType, carTypeId);
                    zipResult.setPartId(partsId);
                    if(StringUtils.isEmpty(partsId)){
                        String message = "零件【" + partsType + "】不存在";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }

                    zipResult.setPartType(partsType);
                    zipResult.setPartCode(fileName.substring(3, 12));
                    zipResult.setTargetVersion(fileName.substring(12, 19));
                    zipResult.setCarType(fileName.substring(19));

                    if(fileName.length() > 26){
                        Matcher m = pattern.matcher(fileName.substring(19, 26));
                        if(m.matches()){
                            zipResult.setTargetVersion(fileName.substring(12, 26));
                            zipResult.setCarType(fileName.substring(26));
                        }
                    }

                    int calibration = largePackageService.checkPartType(partsType, carTypeId);
                    if(calibration == 0 && zipResult.getTargetVersion().length() == 14){
                        String message = "零件【" + partsType + "】不能含标定";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                    if(calibration == 1 && zipResult.getTargetVersion().length() == 7){
                        String message = "零件【" + partsType + "】必须含标定";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }

                    zipResult.setSuffix(suffix);
                    zipResult.setZipSize(entry.getSize());
                    new ZipTools().extract(newPath + File.separator + entry.getName(), newPath + File.separator + fileName);

                    initFileList(zipResult);
                    checkFileExists(newPath, fileName, zipResult);
                    checkChildrenFileName(zipResult);
                    readConfigFile(newPath + File.separator + fileName, zipResult);

                    zipResults.add(zipResult);
                }
                largeZipResult.setErrors(errors);
                largeZipResult.setZipResults(zipResults);
            } catch (IOException e) {
                e.printStackTrace();
                largeZipResult.setSuccess(false);
            } finally {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                        deleteUncompressFiles(newPath);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 删除解压之后的目录
     * @param filePath 文件路径
     */
    private static void deleteUncompressFiles(String filePath){
        File file = new File(filePath);
        for(File item : file.listFiles()){
            if(item.isDirectory()){
                for(File subItem : item.listFiles()){
                    subItem.delete();
                }
            }
            item.delete();
        }
        file.delete();
    }

    /**
     * 检查该车型下是否存在该控制器
      * @param partType 控制器
     * @param carTypeId 车型ID
     * @return
     */
    private boolean checkPartType(String partType, String carTypeId){ return true; }

    /**
     * 获取并设置控制器是否标定
     * @param partType 控制器
     * @param carTypeId 车型ID
     * @param result 控制器结果实体
     */
    private void setCalibration(String partType, String carTypeId, ZipResult result){}

    /**
     * 检查控制器包名称是否符合规范
     * @param fileName
     * @return
     */
    private static void checkFileName(LargePackageService largePackageService, String fileName){
        Matcher m = packagePattern.matcher(fileName);
        Matcher am = calibrationPattern.matcher(fileName);
        if(!m.matches() && !am.matches()){
            String message = "零件包【" + fileName + "】名称不正确，正确格式：控制器（三位大写英文字母）+零件号（大写字母A-Z和数据0-9组成，9个字符长度）+软版本（含标定：S开头+三位数字的主软件版本+三位数字次软件版本+C开头+三位数字的主软件版本+三位数字次软件版本；不含标定：S开头+三位数字的主软件版本+三位数字次软件版本）";
            errors.add(message);
            largeZipResult.setSuccess(false);
        }
        //return "零件包【" + fileName + "】名称不正确，正确格式：控制器（三位大写英文字母）+零件号（大写字母A-Z和数据0-9组成，9个字符长度）+软版本（含标定：S开头+三位数字的主软件版本+三位数字次软件版本+C开头+三位数字的主软件版本+三位数字次软件版本；不含标定：S开头+三位数字的主软件版本+三位数字次软件版本）";

        /*String message = "";
        String partType = fileName.substring(0, 3);
        String fixedValue = "【" + fileName + "】中的";
        if (!partType.matches("^[A-Z]{3}$")) {
            message = fileName + "控制器类型不匹配";
            errors.add(message);
            largeZipResult.setSuccess(false);
        }
        String partCode = fileName.substring(3, 12);
        if (!partCode.matches("^E[0-9]{8}$")) {
            message = fileName + "控制器号不匹配";
            errors.add(message);
            largeZipResult.setSuccess(false);
        }
        String version = fileName.substring(12, 19);
        String other = fileName.length() > 26 ? fileName.substring(12, 26) : "";
        if (!version.matches("^S[0-9]{6}$") && !other.matches("^S[0-9]{6}C[0-9]{6}$")) {
            message = fileName + "软件版本号不匹配";
            errors.add(message);
            largeZipResult.setSuccess(false);
        }
        return message;*/
    }

    /**
     * 校验控制器包里的必须文件是否都存在
     * @param rootPath 控制器包路径
     * @param fileName 控制器包名称
     * @return
     */
    // boolean isEmbedded
    private static String checkFileExists(String rootPath, String fileName, ZipResult result){
        String message = "";
        List<String> prefixes = new ArrayList<>();
        String partType = fileName.substring(0, 3);
        File dir = new File(rootPath + File.separator + fileName);
        File[] files = dir.listFiles();
        for(File file : files) {
            if(file.isDirectory()){
                message = fileName + "零件包【" + fileName + "】中不能包含文件夹";
                errors.add(message);
                largeZipResult.setSuccess(false);
            } else {
                prefixes.add(file.getName().substring(0, 2));
            }
        }
        setFileResult(files, result);
        fileName = "【" + fileName + ".zip】中";
        if(PartType.ICC.name().equals(partType) || PartType.TBX.name().equals(partType)){
            if(!prefixes.contains(PrefixType.TWO.toString())){
                message = fileName + "缺少2-文件";
                errors.add(message);
                largeZipResult.setSuccess(false);
            }
            else if(!prefixes.contains(PrefixType.THREE.toString())){
                message = fileName + "缺少3-文件";
                errors.add(message);
                largeZipResult.setSuccess(false);
            }
        }
        else {
            if(!prefixes.contains(PrefixType.ONE.toString())){
                message = fileName + "缺少1-文件";
                errors.add(message);
                largeZipResult.setSuccess(false);
            }
            else if(!prefixes.contains(PrefixType.TWO.toString())){
                message = fileName + "缺少2-文件";
                errors.add(message);
                largeZipResult.setSuccess(false);
            }
            else if(!prefixes.contains(PrefixType.THREE.toString())){
                message = fileName + "缺少3-文件";
                errors.add(message);
                largeZipResult.setSuccess(false);
            }
            else if(!prefixes.contains(PrefixType.NINE.toString())){
                message = fileName + "缺少9-文件";
                errors.add(message);
                largeZipResult.setSuccess(false);
            }
        }
        return message;
    }

    /**
     * 给 FileResult 赋值
     * @param files 控制器包中的所有文件(数组)
     * @param result ZipResult
     */
    private static void setFileResult(File[] files, ZipResult result){
        List<FileResult> fileResults = result.getFiles();
        for(File file : files){
            String fileName = file.getName();
            String key = fileName.split("-")[0];
            FileResult fileResult = fileResults.get(Integer.valueOf(key) -1);
            fileResult.setFileId(UUID.randomUUID().toString());
            if(fileResult == null){
                continue;
            }
            fileResult.setFileName(fileName);
            String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
            fileResult.setSuffix(suffix);
            fileResult.setFileSize(file.length());
            fileResult.setFileExist(true);
            String versionOrderNum = "0";
            fileResult.setSoftwareOrderNum(versionOrderNum);
            if("2".equals(key)){
                versionOrderNum = fileName.substring(21, 24);
                fileResult.setSoftwareOrderNum(versionOrderNum);
            }
            if("7".equals(key)){
                versionOrderNum = fileName.substring(21, 24);
                fileResult.setSoftwareOrderNum(versionOrderNum);
            }
            if(result.getTargetVersion().length() == 7){
                fileResult.setSoftwareOrderNum("0");
            }
        }
    }

    /**
     * 检查控制器文件名称是否符合规范
     * @param result ZipResult
     * @return
     */
    private static String checkChildrenFileName(ZipResult result){
        String message = "";
        for(FileResult item : result.getFiles()){
            if(item.isFileExist()){
                String key = item.getKey();
                String fileName = item.getFileName();
                String fixedValue = "零件包【" + result.getZipName() + "】中的文件【" + fileName + "】名称错误";
                if("1".equals(key)){
                    String partType = fileName.substring(2, 5);
                    if(!partType.equals(result.getPartType())){
                        message = "【" + fileName + "】文件的零件名称与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                }
                else if("2".equals(key)){
                    String partType = fileName.split("-")[1].substring(0, 3);
                    String partCode = fileName.split("-")[1].substring(3, 12);
                    String version = fileName.split("-")[1].substring(12, 19);
                    if(!partType.equals(result.getPartType())){
                        message = "【" + fileName + "】文件的零件名称与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                    if(!partCode.equals(result.getPartCode())){
                        message = "【" + fileName + "】文件的零件号与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                    if(!result.getTargetVersion().contains(version)){
                        message = "【" + fileName + "】文件的软件版本与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                }
                else if("7".equals(key)){
                    if(result.getCalibration() == 0){
                        continue;
                    }
                    String partType = fileName.split("-")[1].substring(0, 3);
                    String partCode = fileName.split("-")[1].substring(3, 12);
                    String version = fileName.split("-")[1].substring(12, 19);
                    if(!partType.equals(result.getPartType())){
                        message = "【" + fileName + "】文件的零件名称与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                    if(!partCode.equals(result.getPartCode())){
                        message = "【" + fileName + "】文件的零件号与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                    if(!result.getTargetVersion().contains(version)){
                        message = "【" + fileName + "】文件的软件版本与【" + result.getZipName() + "】不一致";
                        errors.add(message);
                        largeZipResult.setSuccess(false);
                    }
                }
            }
        }
        return message;
    }

    /**
     * 初始化文件集合
     * @param result ZipResult
     */
    private static void initFileList(ZipResult result){
        List<FileResult> files = new ArrayList<>();
        if(result.getFiles() != null && result.getFiles().size() > 0){
            result.setFiles(null);
        }
        String partType = result.getPartType();
        // 非嵌入式ECU
        if(partType.equals(PartType.TBX.name()) || partType.equals(PartType.ICC.name())){
            files.add(new FileResult("1","s19|hex",false,"1-驱动文件"));
            files.add(new FileResult("2","s19|hex",true,"2-应用程序文件"));
            files.add(new FileResult("3","xml",true,"3-config"));
            files.add(new FileResult("4","txt",false,"4-刷写流程文件"));
            files.add(new FileResult("5","dll",false,"5-CRC校验算法文件"));
            files.add(new FileResult("6","dll",false,"6-安全算法文件"));
            files.add(new FileResult("7","s19|hex",false,"7-标定文件"));
            files.add(new FileResult("8","txt",false,"8-零件软件版本及刷写说明"));
            files.add(new FileResult("9","bin|so",false,"9-安全算法文件"));
        }else{ // 嵌入式ECU
            files.add(new FileResult("1","s19|hex",true,"1-驱动文件"));
            files.add(new FileResult("2","s19|hex",true,"2-应用程序文件"));
            files.add(new FileResult("3","xml",true,"3-config"));
            files.add(new FileResult("4","txt",false,"4-刷写流程文件"));
            files.add(new FileResult("5","dll",false,"5-CRC校验算法文件"));
            files.add(new FileResult("6","dll",false,"6-安全算法文件"));
            files.add(new FileResult("7","s19|hex",false,"7-标定文件"));
            files.add(new FileResult("8","txt",false,"8-零件软件版本及刷写说明"));
            files.add(new FileResult("9","bin|so",true,"9-安全算法文件"));
            files.add(new FileResult("10","",false,"10-整车低压引导安全算法"));
            files.add(new FileResult("11","dll",false,"11-压缩算法文件"));
            files.add(new FileResult("12","",false,"12-签名文件"));
        }
        result.setFiles(files);
    }

    /**
     * 读取3-配置文件
     * @param filePath 控制器包解压后的路径
     * @param result ZipResult
     */
    private static void readConfigFile(String filePath, ZipResult result){
        String fileName = result.getFiles().get(2).getFileName();
        filePath = filePath + File.separator + fileName;
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File(filePath);
            if(!file.exists()){
                //errors.add("3-配置文件不存在");
                //largeZipResult.setSuccess(false);
                return;
            }
            Document doc = builder.parse(new File(filePath));

            // 网段名称
            String segmentName = doc.getElementsByTagName("p2").item(0).getFirstChild().getNodeValue().trim();
            result.setSegmentName(segmentName);
            // 物理ID
            String physicalId = doc.getElementsByTagName("physReqId").item(0).getFirstChild().getNodeValue().trim();
            result.setPhysicalId(physicalId);
            // 功能ID
            String functionId = doc.getElementsByTagName("funcReqId").item(0).getFirstChild().getNodeValue().trim();
            result.setFunctionalId(functionId);
            // 响应ID
            String responseId = doc.getElementsByTagName("responceId").item(0).getFirstChild().getNodeValue().trim();
            result.setResponseId(responseId);
        } catch (Exception e){
            e.printStackTrace();
            errors.add("读取3-配置文件失败");
            largeZipResult.setSuccess(false);
        }
    }

    /**
     * 将成功解析的结果保存到数据库
     *
     */
    public static void saveToDb(LargePackageService largePackageService, ResultT result) {
        try{
            if(!largeZipResult.isSuccess()){
                result.setSuccess(-1);
                //result.("原始包解析后存在错误信息，无法保存");
                return;
            }
            LargePackage largePackage = new LargePackage();
            largePackage.setPackageId(largeZipResult.getLargeZipId());
            largePackage.setFileId(largeZipResult.getFileId());
            largePackage.setCarTypeId(largeZipResult.getCarTypeId());
            largePackage.setRemark("");
            largePackage.setCreateBy(UUID.randomUUID().toString());
            largePackageService.saveLargeZipInfo(largePackage);

            for(ZipResult zipResult : largeZipResult.getZipResults()){
                saveZipInfo(largePackageService, zipResult);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setSuccess(-1);
        }
    }

    /**
     * 保存原始包信息
     */
    private static void saveLargeZipInfo(){

    }

    /**
     * 保存控制器包信息
     */
    private static void saveZipInfo(LargePackageService largePackageService, ZipResult zipResult){
        PartsPackage partsPackage = new PartsPackage();
        partsPackage.setPartsPackageId(zipResult.getZipId());
        partsPackage.setPackageId(largeZipResult.getLargeZipId());
        partsPackage.setPartsId(zipResult.getPartId());
        partsPackage.setFileId(zipResult.getFileId());
        partsPackage.setSoftwareVersion(zipResult.getTargetVersion());
        partsPackage.setHardwareVersion(zipResult.getTargetVersion());
        partsPackage.setPartNumber(zipResult.getPartCode());
        partsPackage.setSendId(zipResult.getResponseId());
        partsPackage.setReceiveId(zipResult.getPhysicalId());
        partsPackage.setPartsAssemblyNumber(zipResult.getCarType());
        partsPackage.setMd5("###########");
        partsPackage.setProjectCode("N60AB");
        partsPackage.setCreateBy(UUID.randomUUID().toString());
        largePackageService.saveZipInfo(partsPackage);
        saveFileInfo(largePackageService, zipResult);
        savePartsPackageDetails(largePackageService, zipResult);

        for(FileResult fileResult : zipResult.getFiles()){
            saveFileInfo(largePackageService, fileResult);
        }
    }

    /**
     * 保存控制器包详细信息
     */
    private static void savePartsPackageDetails(LargePackageService largePackageService, ZipResult zipResult){
        for(FileResult fileResult : zipResult.getFiles()){
            if(!fileResult.isFileExist()){
                continue;
            }
            PartsPackageDetail partsPackageDetail = new PartsPackageDetail();
            partsPackageDetail.setPartsPackageDetailId(UUID.randomUUID().toString());
            partsPackageDetail.setPartsPackageId(zipResult.getZipId());
            partsPackageDetail.setFileId(fileResult.getFileId());
            partsPackageDetail.setFileType(Integer.parseInt(fileResult.getKey()));
            String softwareOrderNum = fileResult.getSoftwareOrderNum().replace('A', ' ').replace('C', ' ').trim();
            partsPackageDetail.setSoftwareNumber(Integer.parseInt(softwareOrderNum));
            partsPackageDetail.setCreateBy(UUID.randomUUID().toString());

            largePackageService.savePartsPackageDetail(partsPackageDetail);
        }
    }

    /**
     * 保存控制器包文件信息
     */
    private static void saveFileInfo(LargePackageService largePackageService, ZipResult zipResult){
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileId(zipResult.getFileId());
        fileInfo.setOriginalName(zipResult.getZipName());
        fileInfo.setSuffix(zipResult.getSuffix());
        fileInfo.setFileSize(zipResult.getZipSize());
        fileInfo.setMd5("********");
        fileInfo.setValueListKey("EcuPackage");
        fileInfo.setServerSidePath("package");
        fileInfo.setUploadingUser(UUID.randomUUID().toString());
        fileInfo.setNote("");
        fileInfo.setCreateBy(UUID.randomUUID().toString());
        largePackageService.saveFileInfo(fileInfo);
    }

    /**
     * 保存控制器包1-到12-文件信息
     */
    private static void saveFileInfo(LargePackageService largePackageService, FileResult fileResult){
        if(fileResult.isFileExist()){
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFileId(fileResult.getFileId());
            fileInfo.setOriginalName(fileResult.getFileName());
            fileInfo.setSuffix(fileResult.getSuffix());
            fileInfo.setFileSize(fileResult.getFileSize());
            fileInfo.setMd5("********");
            fileInfo.setValueListKey("EcuPackage");
            fileInfo.setServerSidePath("package");
            fileInfo.setUploadingUser(UUID.randomUUID().toString());
            fileInfo.setNote("");
            fileInfo.setCreateBy(UUID.randomUUID().toString());
            largePackageService.saveFileInfo(fileInfo);
        }
    }

    /**
     * 保存控制器详细信息
     */
    private static void savePartDetailInfo(){

    }

    public static void main(String[] args) {
        String str1 = "peejacky";
        String str2 = str1;
        System.out.println(str1 == str2);
        str1 = "peejacky";
        System.out.println(str1 == str2);
        System.out.println(str2);
        long startTime = System.currentTimeMillis();
        logger.info("开始解析");
        System.out.println(Integer.parseInt("01"));
        if(StringUtils.isEmpty(null)){
            System.out.println("空");
        }
        Matcher m = packagePattern.matcher("BMSE00101444S005010C0050N60AB");
        Matcher am = calibrationPattern.matcher("BMSE00101444S005010C0050N60AB");
        if(!m.matches() && !am.matches()){
            System.out.println(Integer.parseInt("什么鬼"));
        }
        String filePath = "C:\\Users\\Peejacky2018\\Desktop\\包测试\\N60AB.zip";
        String newPath = "C:\\Users\\Peejacky2018\\Desktop\\tmp";
        //parseFile(filePath, newPath, "", "53D4C2C5-1BD6-4512-B116-6EA854D1EEE6");
        logger.info("结束解析");
        //logger.info(JSON.toJSONString(largeZipResult));
        long endTime = System.currentTimeMillis();
        logger.info(String.format("解析耗时：%dms", (endTime - startTime)));

        /*File file = new File("\\\\10.10.20.100\\fota3\\test.txt");
        try {
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
