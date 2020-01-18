package com.fangle.parking.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 12:05
 */
@NoArgsConstructor
@Data
public class SerialDataBaseBo {

    /**
     * cserialChannel : 0
     * cdata : ...
     * cdataLen : 123
     */

    private int cSerialChannel;
    private String cData;
    private int cDataLen;

    @JsonProperty(value = "serialChannel")
    public int getcSerialChannel() {
        return cSerialChannel;
    }
    @JsonProperty(value = "serialChannel")
    public void setcSerialChannel(int cSerialChannel) {
        this.cSerialChannel = cSerialChannel;
    }
    @JsonProperty(value = "data")
    public String getcData() {
        return cData;
    }
    @JsonProperty(value = "data")
    public void setcData(String cData) {
        this.cData = cData;
    }
    @JsonProperty(value = "dataLen")
    public int getcDataLen() {
        return cDataLen;
    }
    @JsonProperty(value = "dataLen")
    public void setcDataLen(int cDataLen) {
        this.cDataLen = cDataLen;
    }
}