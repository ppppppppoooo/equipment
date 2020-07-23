package com.example.equipment.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SerialVo {

    private String id;
    private String equipmentName;
    private String serialPortMark;
    private String deviceContextName;
    private String judge;
    private Long number;
    private String openStatic;
    private String areaid;
    private Long n;
    private String standbyApplication01;
    private String standbyApplication02;
    private String standbyApplication03;
    private String standbyApplication04;

}
