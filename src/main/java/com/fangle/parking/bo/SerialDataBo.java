package com.fangle.parking.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Gentel
 * @description 回复串口数据
 * @create 2020-01-09 12:05
 */
public class SerialDataBo {
    private List<SerialDataBaseBo> serialDatas;

    @JsonProperty(value = "serialData")
    public List<SerialDataBaseBo> getSerialDatas() {
        return serialDatas;
    }
    @JsonProperty(value = "serialData")
    public void setSerialDatas(List<SerialDataBaseBo> serialDatas) {
        this.serialDatas = serialDatas;
    }
}