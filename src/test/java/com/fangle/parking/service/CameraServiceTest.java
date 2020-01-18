package com.fangle.parking.service;

import com.fangle.parking.entity.Camera;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

@SpringBootTest
class CameraServiceTest {

    @Autowired
    private CameraService cameraService;

    @Test
    void save() {
        Camera camera = Camera.builder().ip("192.168.6.250").rstpPort(8557L).password("admin").user("admin").createTime(new Date()).build();
        Camera cameraSave = cameraService.save(camera);
        Assert.notNull(cameraSave, "");
    }

    @Test
    void findAll() {
        List<Camera> cameras = cameraService.findAll();
        Assert.notEmpty(cameras, "");
    }
}