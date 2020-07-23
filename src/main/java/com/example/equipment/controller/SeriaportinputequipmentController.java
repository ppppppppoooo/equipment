package com.example.equipment.controller;


import com.example.equipment.entity.Outputequipment;
import com.example.equipment.entity.Seriaportinputequipment;
import com.example.equipment.service.OutputequipmentService;
import com.example.equipment.service.SeriaportinputequipmentService;
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
@RequestMapping("/generator/seriaportinputequipment")
public class SeriaportinputequipmentController {
    @Autowired
    SeriaportinputequipmentService service;
    public List<Seriaportinputequipment> queryAll(){

        return service.queryAll();
    }
    public List<Seriaportinputequipment> queryByName(Seriaportinputequipment o){return service.queryByName(o);}
    public Integer insert(Seriaportinputequipment o){return service.insert(o);}
    public Integer updateByName(Seriaportinputequipment o){return service.updateByName(o);}
    public Integer deleteByName(Seriaportinputequipment o){return service.deleteByName(o);}

}

