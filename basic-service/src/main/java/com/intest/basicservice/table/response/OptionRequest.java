package com.intest.basicservice.table.response;

import java.util.List;

public class OptionRequest {
    private String columnId;
    private String optionId;
    private short Kind;
    private short dataType;
    private int maxLength;
    private int minLength;
    private int maxNum;
    private int minNum;
    private String regularText;
    private String dateFormat;
    private String queryFields;
    private List<ListFilter> listOfFilter;

    private short dataSourceKind;
    private List valueRange;
    private String fieldText;

    public OptionRequest(){

    }

    public OptionRequest(String columnId, String optionId, short kind, short dataType, int maxLength, int minLength, int maxNum, int minNum, String regularText, String dateFormat, String queryFields, List<ListFilter> listOfFilter, short dataSourceKind, List valueRange, String fieldText) {
        this.columnId = columnId;
        this.optionId = optionId;
        Kind = kind;
        this.dataType = dataType;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.maxNum = maxNum;
        this.minNum = minNum;
        this.regularText = regularText;
        this.dateFormat = dateFormat;
        this.queryFields = queryFields;
        this.listOfFilter = listOfFilter;
        this.dataSourceKind = dataSourceKind;
        this.valueRange = valueRange;
        this.fieldText = fieldText;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public short getKind() {
        return Kind;
    }

    public void setKind(short kind) {
        Kind = kind;
    }

    public short getDataType() {
        return dataType;
    }

    public void setDataType(short dataType) {
        this.dataType = dataType;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public String getRegularText() {
        return regularText;
    }

    public void setRegularText(String regularText) {
        this.regularText = regularText;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(String queryFields) {
        this.queryFields = queryFields;
    }

    public List<ListFilter> getListOfFilter() {
        return listOfFilter;
    }

    public void setListOfFilter(List<ListFilter> listOfFilter) {
        this.listOfFilter = listOfFilter;
    }


    public short getDataSourceKind() {
        return dataSourceKind;
    }

    public void setDataSourceKind(short dataSourceKind) {
        this.dataSourceKind = dataSourceKind;
    }

    public List getValueRange() {
        return valueRange;
    }

    public void setValueRange(List valueRange) {
        this.valueRange = valueRange;
    }

    public String getFieldText() {
        return fieldText;
    }

    public void setFieldText(String fieldText) {
        this.fieldText = fieldText;
    }

    public static class ListFilter {
        private String value;
        private String text;

        public ListFilter() {
        }

        public ListFilter(String value, String text) {
            this.value = value;
            this.text = text;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

}
