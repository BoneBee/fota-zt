package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ColumnOptionBto {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.COLUMNOPTION_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String columnoptionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.FK_OPTION_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String fkOptionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.FK_COLUMN_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String fkColumnId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.INTDEX
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private BigDecimal intdex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.ISDELETE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private BigDecimal isdelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.CREATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private Date createat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.CREATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.UPDATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private Date updateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_COLUMNOPTION.UPDATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String updateby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.COLUMNOPTION_ID
     *
     * @return the value of F_COLUMNOPTION.COLUMNOPTION_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getColumnoptionId() {
        return columnoptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.COLUMNOPTION_ID
     *
     * @param columnoptionId the value for F_COLUMNOPTION.COLUMNOPTION_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setColumnoptionId(String columnoptionId) {
        this.columnoptionId = columnoptionId == null ? null : columnoptionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.FK_OPTION_ID
     *
     * @return the value of F_COLUMNOPTION.FK_OPTION_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getFkOptionId() {
        return fkOptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.FK_OPTION_ID
     *
     * @param fkOptionId the value for F_COLUMNOPTION.FK_OPTION_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setFkOptionId(String fkOptionId) {
        this.fkOptionId = fkOptionId == null ? null : fkOptionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.FK_COLUMN_ID
     *
     * @return the value of F_COLUMNOPTION.FK_COLUMN_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getFkColumnId() {
        return fkColumnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.FK_COLUMN_ID
     *
     * @param fkColumnId the value for F_COLUMNOPTION.FK_COLUMN_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setFkColumnId(String fkColumnId) {
        this.fkColumnId = fkColumnId == null ? null : fkColumnId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.INTDEX
     *
     * @return the value of F_COLUMNOPTION.INTDEX
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public BigDecimal getIntdex() {
        return intdex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.INTDEX
     *
     * @param intdex the value for F_COLUMNOPTION.INTDEX
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setIntdex(BigDecimal intdex) {
        this.intdex = intdex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.ISDELETE
     *
     * @return the value of F_COLUMNOPTION.ISDELETE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public BigDecimal getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.ISDELETE
     *
     * @param isdelete the value for F_COLUMNOPTION.ISDELETE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setIsdelete(BigDecimal isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.CREATEAT
     *
     * @return the value of F_COLUMNOPTION.CREATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.CREATEAT
     *
     * @param createat the value for F_COLUMNOPTION.CREATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.CREATEBY
     *
     * @return the value of F_COLUMNOPTION.CREATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.CREATEBY
     *
     * @param createby the value for F_COLUMNOPTION.CREATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.UPDATEAT
     *
     * @return the value of F_COLUMNOPTION.UPDATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.UPDATEAT
     *
     * @param updateat the value for F_COLUMNOPTION.UPDATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_COLUMNOPTION.UPDATEBY
     *
     * @return the value of F_COLUMNOPTION.UPDATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_COLUMNOPTION.UPDATEBY
     *
     * @param updateby the value for F_COLUMNOPTION.UPDATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}