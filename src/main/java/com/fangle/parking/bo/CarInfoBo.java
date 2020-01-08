package com.fangle.parking.bo;

import lombok.Data;

/**
 * @author Gentel
 * @description 设备信息Bo
 * @create 2020-01-08 20:10
 */

@Data
public class CarInfoBo {
    AlarmInfoBo AlarmInfoPlate; //json 无 是 推送结果为车牌识别结果
    String serialno; //string 无 是 设备序列号，设备唯一
    Integer channel; //int[0, 100] 是 默认通道号（预留）
    String deviceName; //string 无 是 设备名称
    String ipaddr; //string 无 是 设备 ip 地址
    ResultBo result; // json 无 是 实际数据
    PlateResultBo PlateResult; //json 无 是 车牌识别结果信息
    String license; //string 无 是 车牌号字符串，如 “ 京 AAAAAA”
    Integer colorValue; //int[0, 32] 是 （预留）
    Integer colorType; // int [0, 5] 是 车牌颜色 0 ：未知、 1 ：蓝色、 2 ：黄色、 3 ：白色、 4 ：黑色、 5 ：绿色
    /**
     * int[0, 19]
     * 是
     * 车牌类型 0 ：未知车牌 : 、 1 ：蓝牌小汽车、 2 ： : 黑牌小汽车、3 ：单排黄牌、 4 ：双排黄牌、 5 ：警车车牌、 6 ：武警车牌、
     * 7 ：个性化车牌、 8 ：单排军车牌、 9 ：双排军车牌、 10 ：使馆车牌、 11 ：香港进出中国大陆车牌、 12 ：农用车牌、 13 ：教练车牌、
     * 14 ：澳门进出中国大陆车牌、 15 ：双层武警车牌、 16 ：武警总队车牌、 17 ：双层武警总队车牌、18 ：民航车牌、 19 ：新能源车牌
     */
    Integer type;
}