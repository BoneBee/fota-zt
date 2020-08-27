package com.intest.packageparser.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.RandomAccessFileInStream;

/**
 * 压缩文件工具包
 */
public class ZipTools {
    private static Logger logger = Logger.getLogger(ZipTools.class.getCanonicalName());

    /**
     * @param file 文件全路径
     * @param extractPath 解压后文件存放路径 - 支持压缩格式：7Z, ZIP, TAR, RAR, LZMA, ISO, GZIP, BZIP2, CPIO, Z, ARJ, LZH, CAB, CHM, NSIS, DEB, RPM, UDF, WIM
     */
    public void extract(String file, String extractPath) throws SevenZipException, IOException {
        IInArchive inArchive = null;
        RandomAccessFile randomAccessFile = null;

        try{
            randomAccessFile = new RandomAccessFile(new File(file), "r");
            inArchive = SevenZip.openInArchive(null, new RandomAccessFileInStream(randomAccessFile));
            inArchive.extract(null, false, new ExtractCallback(inArchive, extractPath));
        } finally {
            if(inArchive != null){
                inArchive.close();
            }
            if(randomAccessFile != null){
                randomAccessFile.close();
            }
        }
    }

    private class ExtractCallback implements IArchiveExtractCallback {
        private final IInArchive inArchive;

        private final String extractPath;

        public ExtractCallback(IInArchive inArchive, String extractPath) {
            this.inArchive = inArchive;
            if (!extractPath.endsWith("/") && !extractPath.endsWith("\\")) {
                extractPath += File.separator;
            }
            this.extractPath = extractPath;
        }

        @Override
        public void setTotal(long total) throws SevenZipException {
            // TODO Auto-generated method stub

        }

        @Override
        public void setCompleted(long complete) throws SevenZipException {
            // TODO Auto-generated method stub

        }

        @Override
        public ISequentialOutStream getStream(int index, ExtractAskMode extractAskMode) throws SevenZipException {
            return new ISequentialOutStream() {

                @Override
                public int write(byte[] data) throws SevenZipException {
                    String filePath = inArchive.getStringProperty(index, PropID.PATH);
                    FileOutputStream fos = null;
                    try {
                        File path = new File(extractPath + filePath);

                        if(!path.getParentFile().exists()){
                            path.getParentFile().mkdirs();
                        }

                        if(!path.exists()){
                            path.createNewFile();
                        }
                        fos = new FileOutputStream(path, true);
                        fos.write(data);
                    } catch (IOException e) {
                        logger.log(null, "IOException while extracting " + filePath);
                    } finally{
                        try {
                            if(fos != null){
                                fos.flush();
                                fos.close();
                            }
                        } catch (IOException e) {
                            logger.log(null, "Could not close FileOutputStream", e);
                        }
                    }
                    return data.length;
                }

            };
        }

        @Override
        public void prepareOperation(ExtractAskMode extractAskMode) throws SevenZipException {
            // TODO Auto-generated method stub

        }

        @Override
        public void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
            // TODO Auto-generated method stub

        }

    }
}

