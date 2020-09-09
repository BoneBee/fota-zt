package com.intest.dao.entity;

import java.util.Date;

public class TaskBto {
    /**
     * null TASK_ID
     */
    private String taskId;

    /**
     * null TASKNAME
     */
    private String taskname;

    /**
     * null UPGRADETIME
     */
    private Date upgradetime;

    /**
     * null PLANSTARTTIME
     */
    private Date planstarttime;

    /**
     * null PLANENDTIME
     */
    private Date planendtime;

    /**
     * null TASKNOTE
     */
    private String tasknote;

    /**
     * 0-standard upgrade; 1-silent upgrade; 2-mandatory upgrade; TASKSTRATEGY
     */
    private Short taskstrategy;

    /**
     * STATUSCode FK_TASKSTATUSVALUE_CODE
     */
    private String fkTaskstatusvalueCode;

    /**
     * null FK_PACKAGETASK_ID
     */
    private String fkPackagetaskId;

    /**
     * null FK_CARTYPE_ID
     */
    private String fkCartypeId;

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
     * @return TASK_ID null
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param taskId null
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return TASKNAME null
     */
    public String getTaskname() {
        return taskname;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param taskname null
     */
    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return UPGRADETIME null
     */
    public Date getUpgradetime() {
        return upgradetime;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param upgradetime null
     */
    public void setUpgradetime(Date upgradetime) {
        this.upgradetime = upgradetime;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return PLANSTARTTIME null
     */
    public Date getPlanstarttime() {
        return planstarttime;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param planstarttime null
     */
    public void setPlanstarttime(Date planstarttime) {
        this.planstarttime = planstarttime;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return PLANENDTIME null
     */
    public Date getPlanendtime() {
        return planendtime;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param planendtime null
     */
    public void setPlanendtime(Date planendtime) {
        this.planendtime = planendtime;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return TASKNOTE null
     */
    public String getTasknote() {
        return tasknote;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param tasknote null
     */
    public void setTasknote(String tasknote) {
        this.tasknote = tasknote == null ? null : tasknote.trim();
    }

    /**
     * 0-standard upgrade; 1-silent upgrade; 2-mandatory upgrade;
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return TASKSTRATEGY 0-standard upgrade; 1-silent upgrade; 2-mandatory upgrade;
     */
    public Short getTaskstrategy() {
        return taskstrategy;
    }

    /**
     * 0-standard upgrade; 1-silent upgrade; 2-mandatory upgrade;
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param taskstrategy 0-standard upgrade; 1-silent upgrade; 2-mandatory upgrade;
     */
    public void setTaskstrategy(Short taskstrategy) {
        this.taskstrategy = taskstrategy;
    }

    /**
     * STATUSCode
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return FK_TASKSTATUSVALUE_CODE STATUSCode
     */
    public String getFkTaskstatusvalueCode() {
        return fkTaskstatusvalueCode;
    }

    /**
     * STATUSCode
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param fkTaskstatusvalueCode STATUSCode
     */
    public void setFkTaskstatusvalueCode(String fkTaskstatusvalueCode) {
        this.fkTaskstatusvalueCode = fkTaskstatusvalueCode == null ? null : fkTaskstatusvalueCode.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return FK_PACKAGETASK_ID null
     */
    public String getFkPackagetaskId() {
        return fkPackagetaskId;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param fkPackagetaskId null
     */
    public void setFkPackagetaskId(String fkPackagetaskId) {
        this.fkPackagetaskId = fkPackagetaskId == null ? null : fkPackagetaskId.trim();
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @return FK_CARTYPE_ID null
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * null
     * @author intest
     * @date 2020-09-04 16:32:52
     * @param fkCartypeId null
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
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