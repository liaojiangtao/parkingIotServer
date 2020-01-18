package com.fangle.parking.dao;

import com.fangle.parking.entity.ParkingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Gentel
 * @description 停车场订单DAO
 * @create 2020-01-18 12:07
 */

public interface ParkingOrderDao extends JpaRepository<ParkingOrder, String> {

    @Query(value = "select * from tb_parking_order where number_plate = ?1 and status = 1", nativeQuery = true)
    ParkingOrder findParkingNumberPlateByNumberPlate(String numberPlate);
}
