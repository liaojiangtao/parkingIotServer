package com.fangle.parking.entity;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Gentel
 * @description 相机信息
 * @create 2020-01-09 11:56
 */

@Data
public class CameraInfo {
    private String deviceName;
    private String ipAddr;
    private String port;
    private String userName;
    private String passWord;
    private String serialNo;
    private String channelNum;
}