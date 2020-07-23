package com.example.equipment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.equipment.entity.SerialPort;

public interface SeralService extends IService<SerialPort> {
    public void checked();
}
