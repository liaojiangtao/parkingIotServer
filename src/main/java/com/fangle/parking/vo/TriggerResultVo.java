package com.fangle.parking.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description 车牌识别结果
 * @create 2020-01-09 10:58
 */
public class TriggerResultVo {
    private AlarmInfoPlateVo alarmInfoPlate;

    @JsonProperty(value = "AlarmInfoPlate")
    public AlarmInfoPlateVo getAlarmInfoPlate() {
        return alarmInfoPlate;
    }

    @JsonProperty(value = "AlarmInfoPlate")
    public void setAlarmInfoPlate(AlarmInfoPlateVo alarmInfoPlate) {
        this.alarmInfoPlate = alarmInfoPlate;
    }
}