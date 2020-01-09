package com.fangle.parking.controller;

import com.alibaba.fastjson.JSON;
import com.fangle.parking.bo.PlateResultBo;
import com.fangle.parking.bo.ResponseAlarmInfoPlateBo;
import com.fangle.parking.vo.PlateResultVo;
import com.fangle.parking.vo.TriggerResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author Gentel
 * @description 相机Controller
 * @create 2019-12-22 17:50
 */
@Slf4j
@RestController
@RequestMapping(value = "/fangle")
public class CameraMessageController {
    @PostMapping(value = "/api/heartbeat")
    @ResponseBody
    public String heartbeat(@RequestParam(value = "device_name") String deviceName,
                            @RequestParam(value = "ipaddr") String ipAddr,
                            @RequestParam(value = "port") String port,
                            @RequestParam(value = "user_name") String userName,
                            @RequestParam(value = "pass_wd") String passWord,
                            @RequestParam(value = "serialno") String serialNo,
                            @RequestParam(value = "channel_num") String channelNum) {

        log.info("heart beat==>[deviceName]:[{}] [ipAddr]:[{}] [port]:[{}] [userName]:[{}] [passWord]:[{}] " +
                "[serialNo]:[{}] [channelNum]:[{}]", deviceName,ipAddr, port,userName,passWord,serialNo,channelNum);
        return "success";
    }

    @PostMapping(value = "/api/carInfo")
    @ResponseBody
    public PlateResultBo carInfo(@RequestBody TriggerResultVo vo){

        PlateResultBo bo = new PlateResultBo();
//        // 把接收到车牌结果保存到txt文件中
//        WriteTxt("d:\\plate_result.txt", lineStr);

        log.info("****************");
        log.info(JSON.toJSONString(vo));
        log.info("****************");

        ResponseAlarmInfoPlateBo responseAlarmInfoPlate = new ResponseAlarmInfoPlateBo();
        responseAlarmInfoPlate.setContent("...");
        responseAlarmInfoPlate.setInfo("ok");
        responseAlarmInfoPlate.setIsPay("true");
        bo.setResponseAlarmInfoPlate(responseAlarmInfoPlate);

        return bo;
    }

    protected void WriteTxt( String path, String txt)
    {
        try
        {
            FileWriter f = new FileWriter(path);
            BufferedWriter bw=new BufferedWriter(f);
            bw.write(txt);
            bw.close();
        }
        catch(Exception e)
        {
        }
    }
}