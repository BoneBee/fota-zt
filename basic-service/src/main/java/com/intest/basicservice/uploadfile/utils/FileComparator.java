package com.intest.basicservice.uploadfile.utils;

import java.io.File;
import java.util.Comparator;

/**
 * @author zhanghui
 * @create 2020-08-10 15:31
 */
public class FileComparator implements Comparator<File> {

    @Override
    public int compare(File o1, File o2) {
        int fileIndex1 = Integer.valueOf(o1.getName());
        int fileIndex2 = Integer.valueOf(o2.getName());
        return Integer.compare(fileIndex1, fileIndex2);
    }
}
