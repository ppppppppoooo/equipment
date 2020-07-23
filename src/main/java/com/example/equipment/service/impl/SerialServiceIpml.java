package com.example.equipment.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.equipment.entity.AutoContllter;
import com.example.equipment.entity.Outputequipment;
import com.example.equipment.entity.SerialPort;
import com.example.equipment.entity.SerialVo;
import com.example.equipment.mapper.AutoConllterMapper;
import com.example.equipment.mapper.SerialPortMapper;
import com.example.equipment.service.SeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerialServiceIpml extends ServiceImpl<SerialPortMapper, SerialPort> implements SeralService {
    @Autowired
    SerialPortMapper mapper;

    @Override
    public void checked() {
        List<SerialVo> list = mapper.selectSeialVo();
        for (SerialVo s : list) {
            System.err.println(s.getNumber());
            System.err.println(s.getN());
            System.err.println(s.getNumber() > s.getN());
            if (s.getJudge().equals("0") && s.getNumber() > s.getN()) {
                if (s.getOpenStatic().equals("1")) {
                    continue;
                }
                s.setOpenStatic("1");
                saveAuto(s);
            } else if (s.getJudge().equals("1") && s.getNumber() < s.getN()) {
                if (s.getOpenStatic().equals("1")) {
                    continue;
                }
                s.setOpenStatic("1");
                saveAuto(s);
            } else if (s.getJudge().equals("2") && s.getNumber() == s.getN()) {
                if (s.getOpenStatic().equals("1")) {
                    continue;
                }
                s.setOpenStatic("1");
                saveAuto(s);
            } else {
                s.setOpenStatic("0");
            }
            mapper.updateById(extract(s));
        }
    }

    @Autowired
    AutoConllterMapper autoConllterMapper;

    public void saveAuto(SerialVo serialVo) {
        String inputName = serialVo.getDeviceContextName();
        String pd = serialVo.getSerialPortMark();
        System.err.println(pd);
        System.err.println(inputName);
        List<Outputequipment> list;
        if (pd.equals("0")) {
            list = mapper.selectOutputequipmentByarea0(inputName);
        } else if (pd.equals("1")) {
            list = mapper.selectOutputequipmentByarea1(inputName);
        } else {
            list = mapper.selectOutputequipmentByarea2(inputName);
        }
        System.err.println(JSON.toJSONString(list));
        for (Outputequipment outputequipment : list) {
            AutoContllter autoContllter = new AutoContllter();
            autoContllter.setOutputequipmentIp(outputequipment.getName());
            autoContllter.setSerialportid(serialVo.getId());
            autoConllterMapper.insert(autoContllter);
            continue;
        }
    }

    public SerialPort extract(SerialVo s) {
        SerialPort serialPort = new SerialPort();
        serialPort.setAreaid(s.getAreaid());
        serialPort.setDeviceContextName(s.getDeviceContextName());
        serialPort.setEquipmentName(s.getEquipmentName());
        serialPort.setId(s.getId());
        serialPort.setJudge(s.getJudge());
        serialPort.setNumber(s.getNumber());
        serialPort.setOpenStatic(s.getOpenStatic());
        System.err.println(s.getOpenStatic());
        serialPort.setSerialPortMark(s.getSerialPortMark());
        serialPort.setStandbyApplication01(s.getStandbyApplication01());
        serialPort.setStandbyApplication02(s.getStandbyApplication02());
        serialPort.setStandbyApplication03(s.getStandbyApplication03());
        serialPort.setStandbyApplication03(s.getStandbyApplication03());
        serialPort.setStandbyApplication04(s.getStandbyApplication04());
        return serialPort;
    }
}
