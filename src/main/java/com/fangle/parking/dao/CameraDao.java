package com.fangle.parking.dao;

import com.fangle.parking.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gentel
 * @description 相机DAO
 * @create 2020-01-18 12:07
 */
public interface CameraDao extends JpaRepository<Camera, String> {
    /**
     * 通过IP查找相机
     * @param ip
     * @return
     */
    public Camera findByIp(String ip);

    boolean existsByIp();
}