package com.example.equipment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "automaticcontrolequipment")
public class AutoContllter {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    private String serialportid;
    @TableField(value = "outputequipmentIp")
    private String outputequipmentIp;
    @TableField(value = "standbyApplication01")
    private String standbyApplication01;
    @TableField(value = "standbyApplication02")
    private String standbyApplication02;
    @TableField(value = "standbyApplication03")
    private String standbyApplication03;
    @TableField(value = "standbyApplication04")
    private String standbyApplication04;
}
