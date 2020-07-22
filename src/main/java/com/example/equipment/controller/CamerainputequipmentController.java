package com.example.equipment.controller;


import com.example.equipment.entity.Arealist;
import com.example.equipment.entity.Camerainputequipment;
import com.example.equipment.service.CamerainputequipmentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Controller
@RequestMapping("view/generator/camerainputequipment")
@ResponseBody
public class CamerainputequipmentController {

    @Autowired
    CamerainputequipmentService service;

//  查询所有摄像头
    @GetMapping("/QueryAll")
    public Object QueryAll(){
        return service.QueryAll();
    }

//  根据name模糊查询摄像头
    @PostMapping("/QueryByName")
    public Object QueryByName(@Param("name") String name){
        return service.QueryByName(name);
    }

//  根据id修改摄像头
    @PostMapping("/UpdateById")
    public Object UpdateById(Camerainputequipment camera){
        return service.UpdateById(camera);
    }

//  根据id删除摄像头
    @PostMapping("/DeleteById")
    public Object DeleteById(String  name){
        return service.DeleteById(name);
    }

//  新增摄像头
    @PostMapping("/Insert")
    public Object Insert(Camerainputequipment camera){
        return service.Insert(camera);
    }

}

