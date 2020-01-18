package com.fangle.parking.bo;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description 车牌识别结果回复
 * @create 2020-01-09 11:02
 */

public class VzCameraResponseBo {

    /**
     * Response_AlarmInfoPlate : {"info":"ok","content":"...","is_pay":"true"}
     */

    private ResponseAlarmInfoPlateBo responseAlarmInfoPlate;

    @JsonProperty(value = "Response_AlarmInfoPlate")
    public ResponseAlarmInfoPlateBo getResponseAlarmInfoPlate() {
        return responseAlarmInfoPlate;
    }

    @JsonProperty(value = "Response_AlarmInfoPlate")
    public void setResponseAlarmInfoPlate(ResponseAlarmInfoPlateBo responseAlarmInfoPlate) {
        this.responseAlarmInfoPlate = responseAlarmInfoPlate;
    }
}