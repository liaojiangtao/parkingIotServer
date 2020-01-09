package com.fangle.parking.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 10:24
 */

public class LocationVo {
    /**
     * RECT : {"bottom":695,"left":1183,"right":1270,"top":675}
     */
    private RectVo rect;

    @JsonProperty(value = "RECT")
    public RectVo getRect() {
        return rect;
    }
    @JsonProperty(value = "RECT")
    public void setRect(RectVo rect) {
        this.rect = rect;
    }
}