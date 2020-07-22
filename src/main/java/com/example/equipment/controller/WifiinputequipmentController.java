package com.example.equipment.controller;


import com.example.equipment.entity.Seriaportinputequipment;
import com.example.equipment.entity.Wifiinputequipment;
import com.example.equipment.service.SeriaportinputequipmentService;
import com.example.equipment.service.WifiinputequipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Controller
@RequestMapping("/generator/wifiinputequipment")
public class WifiinputequipmentController {
    @Autowired
    WifiinputequipmentService service;
    public List<Wifiinputequipment> queryAll(){

        return service.queryAll();
    }
    public List<Wifiinputequipment> queryByName(Wifiinputequipment o){return service.queryByName(o);}
    public Integer insert(Wifiinputequipment o){return service.insert(o);}
    public Integer updateByName(Wifiinputequipment o){return service.updateByName(o);}
    public Integer deleteByName(Wifiinputequipment o){return service.deleteByName(o);}

}

