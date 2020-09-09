package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TaskCarBto {
    /**
     * null TASKCAR_ID
     */
    private String taskcarId;

    /**
     * null FK_TASK_ID
     */
    private String fkTaskId;

    /**
     * null VIN
     */
    private String vin;

    /**
     * null FK_TASKCARSTATUSVALUE_CODE
     */
    private String fkTaskcarstatusvalueCode;

    /**
     * null PROGRESS
     */
    private BigDecimal progress;

    /**
     * formart-1400 - 14h00m UPGRADETIME
     */
    private String upgradetime;

    /**
     * null DESCRIPTION
     */
    private String description;

    /**
     * 0-delete;1-active ISDELETE
     */
    private Short isdelete;

    /**
     * null CREATEAT
     */
    private Date createat;

    /**
     * null CREATEBY
     */
    private String createby;

    /**
     * null UPDATEAT
     */
    private Date updateat;

    /**
     * null UPDATEBY
     */
    private String updateby;

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return TASKCAR_ID null
     */
    public String getTaskcarId() {
        return taskcarId;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param taskcarId null
     */
    public void setTaskcarId(String taskcarId) {
        this.taskcarId = taskcarId == null ? null : taskcarId.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return FK_TASK_ID null
     */
    public String getFkTaskId() {
        return fkTaskId;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param fkTaskId null
     */
    public void setFkTaskId(String fkTaskId) {
        this.fkTaskId = fkTaskId == null ? null : fkTaskId.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return VIN null
     */
    public String getVin() {
        return vin;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param vin null
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return FK_TASKCARSTATUSVALUE_CODE null
     */
    public String getFkTaskcarstatusvalueCode() {
        return fkTaskcarstatusvalueCode;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param fkTaskcarstatusvalueCode null
     */
    public void setFkTaskcarstatusvalueCode(String fkTaskcarstatusvalueCode) {
        this.fkTaskcarstatusvalueCode = fkTaskcarstatusvalueCode == null ? null : fkTaskcarstatusvalueCode.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return PROGRESS null
     */
    public BigDecimal getProgress() {
        return progress;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param progress null
     */
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    /**
     * formart-1400 - 14h00m
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return UPGRADETIME formart-1400 - 14h00m
     */
    public String getUpgradetime() {
        return upgradetime;
    }

    /**
     * formart-1400 - 14h00m
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param upgradetime formart-1400 - 14h00m
     */
    public void setUpgradetime(String upgradetime) {
        this.upgradetime = upgradetime == null ? null : upgradetime.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return DESCRIPTION null
     */
    public String getDescription() {
        return description;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param description null
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 0-delete;1-active
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return ISDELETE 0-delete;1-active
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 0-delete;1-active
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param isdelete 0-delete;1-active
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return CREATEAT null
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param createat null
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return CREATEBY null
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param createby null
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return UPDATEAT null
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param updateat null
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return UPDATEBY null
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param updateby null
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}