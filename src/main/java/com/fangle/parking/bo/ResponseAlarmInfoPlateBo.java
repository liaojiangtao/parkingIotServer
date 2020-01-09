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

    private String info;
    private String content;
    private String isPay;

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
}