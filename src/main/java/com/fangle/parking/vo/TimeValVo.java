package com.fangle.parking.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 10:26
 */

public class TimeValVo {
    /**
     * decday : 9
     * dechour : 10
     * decmin : 7
     * decmon : 1
     * decsec : 22
     * decyear : 2020
     * sec : 1578535642
     * usec : 204808
     */

    private Integer decDay;
    private Integer decHour;
    private Integer decMin;
    private Integer decMon;
    private Integer decSec;
    private Integer decYear;
    private Integer sec;
    private Integer uSec;

    @JsonProperty(value = "decday")
    public Integer getDecDay() {
        return decDay;
    }
    @JsonProperty(value = "decday")
    public void setDecDay(Integer decDay) {
        this.decDay = decDay;
    }
    @JsonProperty(value = "dechour")
    public Integer getDecHour() {
        return decHour;
    }
    @JsonProperty(value = "dechour")
    public void setDecHour(Integer decHour) {
        this.decHour = decHour;
    }
    @JsonProperty(value = "decmin")
    public Integer getDecMin() {
        return decMin;
    }
    @JsonProperty(value = "decmin")
    public void setDecMin(Integer decMin) {
        this.decMin = decMin;
    }
    @JsonProperty(value = "decmon")
    public Integer getDecMon() {
        return decMon;
    }
    @JsonProperty(value = "decmon")
    public void setDecMon(Integer decMon) {
        this.decMon = decMon;
    }
    @JsonProperty(value = "decsec")
    public Integer getDecSec() {
        return decSec;
    }
    @JsonProperty(value = "decsec")
    public void setDecSec(Integer decSec) {
        this.decSec = decSec;
    }
    @JsonProperty(value = "decyear")
    public Integer getDecYear() {
        return decYear;
    }
    @JsonProperty(value = "decyear")
    public void setDecYear(Integer decYear) {
        this.decYear = decYear;
    }
    @JsonProperty(value = "sec")
    public Integer getSec() {
        return sec;
    }
    @JsonProperty(value = "sec")
    public void setSec(Integer sec) {
        this.sec = sec;
    }
    @JsonProperty(value = "usec")
    public Integer getuSec() {
        return uSec;
    }
    @JsonProperty(value = "usec")
    public void setuSec(Integer uSec) {
        this.uSec = uSec;
    }
}