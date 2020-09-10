package com.intest.common.util;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/**
 * @author ：intest
 * @description：MD5计算工具
 * @date ：2020/9/10 10:12
 */
public class Md5CaculateUtil {
    /**
     * 获取一个文件的MD5值(可处理大文件)
     * @param file
     * @return
     */
    public static String getMD5(File file){
        FileInputStream fileInputStream = null;
        try{
            MessageDigest MD5 = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1){
                MD5.update(buffer, 0, length);
            }
            return new String(Hex.encodeHex(MD5.digest()));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取一个字符串的MD5值
     * @param target
     * @return
     */
    public static String MD5(String target){
        return DigestUtils.md5Hex(target);
    }
}
