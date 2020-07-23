package com.example.equipment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.equipment.entity.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SerialPortMapper extends BaseMapper<SerialPort> {

    @Select("SELECT   *, (SELECT `number`  FROM `wifiinputequipment` WHERE `name`= f.`device_context_name` ) AS n FROM  `serial_port` AS f")
    public List<SerialVo> selectSeialVo();

    @Select("SELECT * FROM `outputequipment` AS o WHERE o.`areaID`= (SELECT w.`areaID` FROM `wifiinputequipment` AS w WHERE w.`name`=#{name} )  ")
    public  List<Outputequipment>  selectOutputequipmentByarea0(String name);

    @Select("SELECT  o.name  FROM `outputequipment` AS o WHERE o.`areaID`= (SELECT w.`areaID` FROM   `seriaportinputequipment` AS w WHERE w.`name`=#{name} )")
    public  List<Outputequipment>  selectOutputequipmentByarea1(String name);

    @Select("SELECT  o.name  FROM `outputequipment` AS o WHERE o.`areaID`= (SELECT w.`areaID` FROM `camerainputequipment` AS w WHERE w.`name`=#{name} )\n")
    public  List<Outputequipment>  selectOutputequipmentByarea2(String name);

}
