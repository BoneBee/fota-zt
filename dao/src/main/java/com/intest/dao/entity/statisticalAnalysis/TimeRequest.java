package com.intest.dao.entity.statisticalAnalysis;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TimeRequest {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date starTime;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endTime;

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
