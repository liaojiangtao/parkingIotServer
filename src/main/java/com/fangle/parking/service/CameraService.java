package com.fangle.parking.service;

import com.fangle.parking.dao.CameraDao;
import com.fangle.parking.entity.Camera;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.serial.SerialException;
import java.util.List;

/**
 * @author Gentel
 * @description 相机服务类
 * @create 2020-01-18 12:12
 */

@Slf4j
@Service
@Transactional(rollbackFor = SerialException.class)
public class CameraService {
    @Autowired
    private CameraDao cameraDao;

    public Camera save(Camera camera){
        return cameraDao.save(camera);
    }

    public List<Camera> findAll(){
        return cameraDao.findAll();
    }

    public boolean isExist(String ipAddr) { return cameraDao.existsByIp(); }
}