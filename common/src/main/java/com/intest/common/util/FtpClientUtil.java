package com.intest.common.util;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;

/**
 * @author ：intest
 * @description：FTP工具类
 * @date ：2020/9/8 15:10
 */
public class FtpClientUtil {
    /**
     * ftp服务器地址
     */
    private static String FTP_ADDRESS = "ftp.intestcar.com";
    /**
     * 端口号
     */
    private static int FTP_PORT = 65021;
    /**
     * 用户名
     */
    private static String FTP_USERNAME = "zt";
    /**
     * 密码
     */
    private static String FTP_PASSWORD = "zt20200828";
    /**
     * 相对路径
     */
    private static String FTP_BASEPATH = "";

    /**
     * 连接FTP
     * @return
     * @throws IOException
     */
    private static FTPClient connect() throws IOException {
        int reply;
        FTPClient ftp = new FTPClient();
        ftp.setControlEncoding("UTF-8");
        ftp.connect(FTP_ADDRESS, FTP_PORT);
        ftp.login(FTP_USERNAME, FTP_PASSWORD);
        reply = ftp.getReplyCode();
        System.out.println("登录ftp服务器返回状态码为：" + reply);
        if(!FTPReply.isPositiveCompletion(reply)){
            ftp.disconnect();
            throw new RuntimeException("登录ftp服务器返回状态码为：" + reply);
        }
        return ftp;
    }

    /**
     * 断开FTP连接
     * @param ftp
     */
    public static void disconnect(FTPClient ftp){
        if(ftp != null && ftp.isConnected()){
            try{
                ftp.disconnect();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

    /**
     * 根据路径获取文件集合
     * @param path
     * @return
     * @throws Exception
     */
    public static FTPFile[] listFile(String path) throws Exception {
        FTPClient ftp = null;
        try{
            ftp = connect();
            FTPFile[] fileList = ftp.listFiles(path);
            ftp.logout();
            return fileList;
        }finally {
            disconnect(ftp);
        }
    }

    /**
     * 上传文件
     * @param remoteFileName
     * @param input
     * @throws Exception
     */
    public static void uploadFile(String remoteFileName, InputStream input) throws Exception {
        FTPClient ftp = null;
        try{
            ftp = connect();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            // 设置为被动模式
            ftp.enterLocalPassiveMode();
            ftp.makeDirectory(FTP_BASEPATH);
            ftp.changeWorkingDirectory("pkfile/");
            // originFilePath就是上传文件的文件名，建议使用生成的唯一命名，中文命名最好做转码
            boolean a = ftp.storeFile(remoteFileName, input);
            System.out.println("要上传的原始文件名为：" + remoteFileName + ", 上传结果：" + a);
            input.close();
            ftp.logout();
        }finally {
            disconnect(ftp);
        }
    }

    /**
     * 删除文件
     * @param fileName
     * @throws Exception
     */
    public static void deleteFile(String fileName) throws Exception {
        FTPClient ftp = null;
        try{
            ftp = connect();
            // 切换FTP目录
            ftp.changeWorkingDirectory(FTP_BASEPATH);
            ftp.dele(fileName);
            ftp.logout();
        }finally {
            disconnect(ftp);
        }
    }

    /**
     * 文件下载
     * @param fileName
     * @param localPath
     * @throws Exception
     */
    public static void downloadFile(String fileName, String localPath) throws Exception {
        FTPClient ftp = null;
        try{
            ftp = connect();
            ftp.enterLocalPassiveMode();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            // 切换FTP目录
            ftp.changeWorkingDirectory("pktest/packagedone/");
            // 此处为demo方法，正常应该到数据库中查询fileName
            FTPFile[] ftpFiles = ftp.listFiles();
            for (FTPFile file : ftpFiles){
                if(fileName.equalsIgnoreCase(file.getName())){
                    File localFile = new File(localPath + File.separator + file.getName());
                    OutputStream os = new FileOutputStream(localFile);
                    ftp.retrieveFile(file.getName(), os);
                    os.close();
                }
            }
            ftp.logout();
            System.out.println("文件下载完成！！！");
        }finally {
            disconnect(ftp);
        }
    }
}
