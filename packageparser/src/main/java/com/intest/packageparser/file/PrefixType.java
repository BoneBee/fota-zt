package com.intest.packageparser.file;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/13 15:01
 */
public enum PrefixType{
    ONE(1, "1-"), TWO(2, "2-"), THREE(3, "3-"), NINE(9, "9-");

    public final int key;
    private final String value;

    private PrefixType(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}