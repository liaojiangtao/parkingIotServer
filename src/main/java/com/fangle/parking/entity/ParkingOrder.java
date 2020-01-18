package com.fangle.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Gentel
 * @description 停车场订单
 * @create 2020-01-18 16:19
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_parking_order")
@EntityListeners(AuditingEntityListener.class)
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ParkingOrder {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String orderCode;
    private String numberPlate;
    private Date arriveTime;
    private String arriveGateId;
    private String arriveGateName;
    private Integer arriveType;
    private Date leaveTime;
    private String leaveGateId;
    private String leaveGateName;
    private Integer leaveType;
    private String tollId;
    private String tollName;
    private Long totalFee;
    private Long payFee;
    private Integer status;

    @LastModifiedDate
    private Date updateTime;

    @CreatedDate
    private Date createTime;
}