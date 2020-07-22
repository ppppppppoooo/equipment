package com.example.equipment.controller;


import com.example.equipment.entity.Outputequipment;
import com.example.equipment.service.OutputequipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping("view/generator/outputequipment")
@ResponseBody
public class OutputequipmentController {
    @Autowired
    OutputequipmentService service;
    public List<Outputequipment> queryAll(){

       return service.queryAll();
    }
    public List<Outputequipment> queryByName(Outputequipment o){return service.queryByName(o);}
    public Integer insert(Outputequipment o){return service.insert(o);}
    public Integer updateByName(Outputequipment o){return service.updateByName(o);}
    public Integer deleteByName(Outputequipment o){return service.deleteByName(o);}

}

