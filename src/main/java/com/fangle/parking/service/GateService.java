package com.fangle.parking.service;

import com.fangle.parking.dao.GateDao;
import com.fangle.parking.entity.Gate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.serial.SerialException;
import java.util.List;

/**
 * @author Gentel
 * @description 出入口Service
 * @create 2020-01-18 15:10
 */

@Slf4j
@Service
@Transactional(rollbackFor = SerialException.class)
public class GateService {
    @Autowired
    private GateDao gateDao;

    public List<Gate> findAll(){
        return gateDao.findAll();
    }

    public Gate save(Gate gate){
        return gateDao.save(gate);
    }

    public Gate findByMainCameraId(String cameraId){
        return gateDao.findGateByMainCameraId(cameraId);
    }

    public Gate findByAuxiliaryCameraId(String cameraId){
        return gateDao.findGateByAuxiliaryCameraId(cameraId);
    }
}