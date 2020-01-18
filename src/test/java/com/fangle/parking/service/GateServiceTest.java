package com.fangle.parking.service;

import com.fangle.parking.entity.Gate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GateServiceTest {

    @Autowired
    private GateService gateService;

    @Test
    void findAll() {
        List<Gate> gates = gateService.findAll();
        Assert.notEmpty(gates, "");
    }

    @Test
    void save() {
        Gate gate = Gate.builder().mainCameraId("4028d8016fb76f62016fb76f6a610000").name("入口").type(1).build();
        Gate gateSave =  gateService.save(gate);
        Assert.notNull(gateSave, "");
    }

    @Test
    void findByMainCameraId() {
        Gate gate = gateService.findByMainCameraId("4028d8016fb76f62016fb76f6a610000");
        Assert.notNull(gate, "");
    }

    @Test
    void findByAuxiliaryCameraId() {
        Gate gate = gateService.findByAuxiliaryCameraId("4028d8016fb76f62016fb76f6a610000");
        Assert.notNull(gate, "");
    }
}