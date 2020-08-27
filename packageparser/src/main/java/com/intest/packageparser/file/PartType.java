package com.intest.packageparser.file;

/**
 * @author ：intest
 * @description：控制器类型
 * @date ：2020/8/13 15:02
 */
public enum  PartType {
        /**
         * ECU: 普通ECU
         * TBX：TBOX
         * ICC：车机
         */
        ECU("ECU"), TBX("TBX"), ICC("ICC");

        private final String value;

        private PartType(String value){
                this.value = value;
                }

        @Override
        public String toString() {
                return value;
                }
}