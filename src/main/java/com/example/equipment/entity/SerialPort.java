package com.example.equipment.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "serial_port")
public class SerialPort implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id")
    private String id;
    private String equipmentName;
    private String serialPortMark;
    private String deviceContextName;
    private String judge;
    private Long number;
    private String openStatic;
    private String areaid;
    private String standbyApplication01;
    private String standbyApplication02;
    private String standbyApplication03;
    private String standbyApplication04;

}
