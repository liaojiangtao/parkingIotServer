package com.fangle.parking.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 11:03
 */
public class ResponseAlarmInfoPlateBo {
    /**
     * info : ok
     * content : ...
     * is_pay : true
     */

    /**
     * 回复 ok 开闸
     */
    private String info;
    private String content;
    private String isPay;
    private Integer plateId;

    /**
     * 回复开闸端口号，若无，则默认为 0
     */
    private Integer channelNum;

    /**
     * 回复 ok 进行手动触发
     */
    private String manualTigger;

    @JsonProperty(value = "info")
    public String getInfo() {
        return info;
    }
    @JsonProperty(value = "info")
    public void setInfo(String info) {
        this.info = info;
    }
    @JsonProperty(value = "content")
    public String getContent() {
        return content;
    }
    @JsonProperty(value = "content")
    public void setContent(String content) {
        this.content = content;
    }
    @JsonProperty(value = "is_pay")
    public String getIsPay() {
        return isPay;
    }
    @JsonProperty(value = "is_pay")
    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }
    @JsonProperty(value = "plateid")
    public Integer getPlateId() {
        return plateId;
    }
    @JsonProperty(value = "plateid")
    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }
    @JsonProperty(value = "channelNum")
    public Integer getChannelNum() {
        return channelNum;
    }
    @JsonProperty(value = "channelNum")
    public void setChannelNum(Integer channelNum) {
        this.channelNum = channelNum;
    }
    @JsonProperty(value = "manualTrigger")
    public String getManualTigger() {
        return manualTigger;
    }
    @JsonProperty(value = "manualTrigger")
    public void setManualTigger(String manualTigger) {
        this.manualTigger = manualTigger;
    }
}