package com.fangle.parking.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gentel
 * @description
 * @create 2020-01-09 10:24
 */

public class RectVo {
    /**
     * bottom : 695
     * left : 1183
     * right : 1270
     * top : 675
     */
    private Integer bottom;
    private Integer left;
    private Integer right;
    private Integer top;

    @JsonProperty(value = "bottom")
    public Integer getBottom() {
        return bottom;
    }
    @JsonProperty(value = "bottom")
    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }
    @JsonProperty(value = "left")
    public Integer getLeft() {
        return left;
    }
    @JsonProperty(value = "left")
    public void setLeft(Integer left) {
        this.left = left;
    }
    @JsonProperty(value = "right")
    public Integer getRight() {
        return right;
    }
    @JsonProperty(value = "right")
    public void setRight(Integer right) {
        this.right = right;
    }
    @JsonProperty(value = "top")
    public Integer getTop() {
        return top;
    }
    @JsonProperty(value = "top")
    public void setTop(Integer top) {
        this.top = top;
    }
}