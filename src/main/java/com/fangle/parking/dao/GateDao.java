package com.fangle.parking.dao;

import com.fangle.parking.entity.Gate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gentel
 * @description 出入口DAO
 * @create 2020-01-18 12:07
 */

public interface GateDao extends JpaRepository<Gate, String> {

    /**
     * 通过主相机查找出入口
     * @param cameraId
     * @return
     */
    Gate findGateByMainCameraId(String cameraId);

    /**
     * 通过辅相机查找出入口
     * @param cameraId
     * @return
     */
    Gate findGateByAuxiliaryCameraId(String cameraId);
}
