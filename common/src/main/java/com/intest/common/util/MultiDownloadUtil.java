package com.intest.common.util;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author ：intest
 * @description：多文件打包下载工具类
 * @date ：2020/9/3 13:19
 */
public class MultiDownloadUtil {
    public static void zipd(String zipTmp, List<File> files, HttpServletResponse response){
        File zipTmpFile = new File(zipTmp);
        try{
            if(zipTmpFile.exists()){
                zipTmpFile.delete();
            }
            zipTmpFile.createNewFile();

            response.reset();
            // 创建文件输出流
            FileOutputStream fous = new FileOutputStream(zipTmpFile);
            ZipOutputStream zipOut = new ZipOutputStream(fous);
            zipFile(files, zipOut);
            zipOut.close();
            fous.close();
            downloadZip(zipTmpFile, response);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 将多文件打包成压缩包
     * @param files
     * @param outputStream
     */
    public static void zipFile(List<File> files, ZipOutputStream outputStream){
        for(File file : files){
            zipFile(file, outputStream);
        }
    }

    public static void zipFile(File inputFile, ZipOutputStream outputStream){
        try{
            if(inputFile.exists()){
                if(inputFile.isFile()){
                    FileInputStream fis = new FileInputStream(inputFile);
                    BufferedInputStream bis = new BufferedInputStream(fis, 512);
                    ZipEntry entry = new ZipEntry(inputFile.getName());
                    outputStream.putNextEntry(entry);

                    int nNumber;
                    byte[] buffer = new byte[512];
                    while ((nNumber = bis.read(buffer)) != -1){
                        outputStream.write(buffer, 0, nNumber);
                    }

                    bis.close();
                    fis.close();
                }else {
                    try{
                        File[] files = inputFile.listFiles();
                        for(File file : files){
                            zipFile(file, outputStream);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static HttpServletResponse downloadZip(File file, HttpServletResponse response){
        if(!file.exists()){
            System.out.println("待压缩文件不存在");
        }else{
            try{
                // 以流的形式下载文件
                InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
                byte[] buffer = new byte[inputStream.available()];
                inputStream.read(buffer);
                inputStream.close();
                response.reset();

                OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
                response.setContentType("application/octet-stream");
                // 如果输出的是中文名的文件，那么在此处就要用URLEncoder.encode方法进行处理
                response.setHeader("Content-Disposition", "attachment;filename=" + new String(file.getName().getBytes("GB2312")));
                outputStream.write(buffer);
                outputStream.flush();
                outputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            finally{
                try{
                    File f = new File(file.getPath());
                    f.delete();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return response;
    }
}
