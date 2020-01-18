package com.fangle.parking.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description 截图
 * @create 2020-01-09 12:14
 */
public class TriggerImageBo {
    private Integer port;
    private String snapImageRelativeUrl;
    private String snapImageAbsolutelyUrl;

    @JsonProperty(value = "port")
    public Integer getPort() {
        return port;
    }
    @JsonProperty(value = "port")
    public void setPort(Integer port) {
        this.port = port;
    }
    @JsonProperty(value = "snapImageRelativeUrl")
    public String getSnapImageRelativeUrl() {
        return snapImageRelativeUrl;
    }
    @JsonProperty(value = "snapImageRelativeUrl")
    public void setSnapImageRelativeUrl(String snapImageRelativeUrl) {
        this.snapImageRelativeUrl = snapImageRelativeUrl;
    }
    @JsonProperty(value = "snapImageAbsolutelyUrl")
    public String getSnapImageAbsolutelyUrl() {
        return snapImageAbsolutelyUrl;
    }
    @JsonProperty(value = "snapImageAbsolutelyUrl")
    public void setSnapImageAbsolutelyUrl(String snapImageAbsolutelyUrl) {
        this.snapImageAbsolutelyUrl = snapImageAbsolutelyUrl;
    }
}