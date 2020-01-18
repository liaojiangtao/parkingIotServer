package com.fangle.parking.controller;

import com.fangle.parking.bo.VzCameraResponseBo;
import com.fangle.parking.service.ParkingService;
import com.fangle.parking.vo.TriggerResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;

/**
 * @author Gentel
 * @description 相机Controller
 * @create 2019-12-22 17:50
 */

@RestController
@RequestMapping(value = "/fangle")
public class CameraMessageController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping(value = "/api/heartbeat")
    @ResponseBody
    public VzCameraResponseBo heartbeat(@RequestParam(value = "device_name") String deviceName,
                            @RequestParam(value = "ipaddr") String ipAddr,
                            @RequestParam(value = "port") String port,
                            @RequestParam(value = "user_name") String userName,
                            @RequestParam(value = "pass_wd") String passWord,
                            @RequestParam(value = "serialno") String serialNo,
                            @RequestParam(value = "channel_num") String channelNum) {
        VzCameraResponseBo bo;
        bo = parkingService.handleHeartBeat(deviceName, ipAddr, port, userName, passWord, serialNo, channelNum);
        return bo;
    }

    @PostMapping(value = "/api/carInfo")
    @ResponseBody
    public VzCameraResponseBo carInfo(@RequestBody TriggerResultVo vo) {

        VzCameraResponseBo bo;
        bo = parkingService.handleCarInfo(vo);

        return bo;
    }
}