package com.fangle.parking.vo;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 10:27
 */

public class TimeStampVo {
    /**
     * Timeval : {"decday":9,"dechour":10,"decmin":7,"decmon":1,"decsec":22,"decyear":2020,"sec":1578535642,"usec":204808}
     */
    private TimeValVo timeVal;

    @JsonProperty(value = "Timeval")
    public TimeValVo getTimeVal() {
        return timeVal;
    }

    @JsonProperty(value = "Timeval")
    public void setTimeVal(TimeValVo timeVal) {
        this.timeVal = timeVal;
    }
}