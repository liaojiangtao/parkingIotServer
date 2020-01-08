package com.fangle.parking.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Gentel
 * @description 相机Controller
 * @create 2019-12-22 17:50
 */
@RestController
@RequestMapping(value = "/fangle")
public class CameraMessageController {
    @PostMapping(value = "/api/heartbeat")
    @ResponseBody
    public String heartbeat(HttpServletRequest request){
        MultipartHttpServletRequest params = ((MultipartHttpServletRequest)request);
        String deviceName = params.getParameter("device_name");
        String ipAddr = params.getParameter("ipaddr");
        String port = params.getParameter("port");
        String userName = params.getParameter("user_name");
        String passWord = params.getParameter("pass_wd");
        String serialNo = params.getParameter("serialno");
        String channelNum = params.getParameter("channel_num");
        return "success";
    }

    @PostMapping(value = "/api/carInfo")
    @ResponseBody
    public String carInfo(HttpServletRequest request){

    }
}