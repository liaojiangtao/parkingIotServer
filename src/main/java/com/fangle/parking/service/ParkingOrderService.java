package com.fangle.parking.service;

import com.fangle.parking.dao.ParkingOrderDao;
import com.fangle.parking.entity.ParkingOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.serial.SerialException;
import java.util.List;

/**
 * @author Gentel
 * @description 停车场订单Service
 * @create 2020-01-18 16:23
 */

@Slf4j
@Service
@Transactional(rollbackFor = SerialException.class)
public class ParkingOrderService {
    @Autowired
    private ParkingOrderDao parkingOrderDao;

    public List<ParkingOrder> findAll() {
        return parkingOrderDao.findAll();
    }

    public ParkingOrder findParkingNumberPlateByNumberPlate(String numberPlate){
        return parkingOrderDao.findParkingNumberPlateByNumberPlate(numberPlate);
    }

    public ParkingOrder save(ParkingOrder order) {
        return parkingOrderDao.save(order);
    }
}