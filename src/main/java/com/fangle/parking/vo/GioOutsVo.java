package com.fangle.parking.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 10:30
 */

public class GioOutsVo {

    /**
     * ionum : 1
     * ctrltype : 0
     */

    private Integer ioNum;
    private Integer ctrlType;

    @JsonProperty(value = "ionum")
    public Integer getIoNum() {
        return ioNum;
    }
    @JsonProperty(value = "ionum")
    public void setIoNum(Integer ioNum) {
        this.ioNum = ioNum;
    }
    @JsonProperty(value = "ctrltype")
    public Integer getCtrlType() {
        return ctrlType;
    }
    @JsonProperty(value = "ctrltype")
    public void setCtrlType(Integer ctrlType) {
        this.ctrlType = ctrlType;
    }
}