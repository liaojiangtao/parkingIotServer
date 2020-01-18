package com.fangle.parking.service;

import com.fangle.parking.entity.ParkingOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ParkingOrderServiceTest {

    @Autowired
    private ParkingOrderService parkingOrderService;

    @Test
    void findAll() {
        List<ParkingOrder> orders = parkingOrderService.findAll();
        Assert.notEmpty(orders, "");
    }

    @Test
    void findParkingNumberPlateByNumberPlate() {
        ParkingOrder order = parkingOrderService.findParkingNumberPlateByNumberPlate("粤A12345");
        Assert.notNull(order,"");
    }

    @Test
    void save() {
        ParkingOrder order = ParkingOrder.builder().orderCode("123456").numberPlate("粤A12345").arriveTime(new Date())
                .arriveGateId("12345679897854").arriveGateName("入口1").arriveType(1).status(1).build();
        ParkingOrder orderSave = parkingOrderService.save(order);
        Assert.notNull(orderSave,"");
    }
}