package com.fangle.parking.service;

import com.alibaba.fastjson.JSON;
import com.fangle.parking.bo.ResponseAlarmInfoPlateBo;
import com.fangle.parking.bo.VzCameraResponseBo;
import com.fangle.parking.vo.TriggerResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Gentel
 * @description 停车服务
 * @create 2020-01-09 12:25
 */

@Slf4j
@Service
public class ParkingService {

    /**
     * 心跳处理
     * @param deviceName
     * @param ipAddr
     * @param port
     * @param userName
     * @param passWord
     * @param serialNo
     * @param channelNum
     * @return
     */
    public VzCameraResponseBo handleHeartBeat(String deviceName, String ipAddr, String port, String userName, String passWord, String serialNo, String channelNum) {
        VzCameraResponseBo response = new VzCameraResponseBo();
        ResponseAlarmInfoPlateBo responseAlarmInfoPlate = new ResponseAlarmInfoPlateBo();
        responseAlarmInfoPlate.setContent("...");
        response.setResponseAlarmInfoPlate(responseAlarmInfoPlate);
        return response;
    }

    /**
     * 相机识别处理
     * @param vo
     * @return
     */
    public VzCameraResponseBo handleCarInfo(TriggerResultVo vo) {
        VzCameraResponseBo bo = new VzCameraResponseBo();
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
}