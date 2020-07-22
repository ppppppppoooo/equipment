package com.example.equipment.controller;


import com.example.equipment.entity.Arealist;
import com.example.equipment.service.ArealistService;
import com.example.equipment.service.impl.ArealistServiceImpl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Controller
@RequestMapping("view/generator/arealist")
@ResponseBody
/**
 * 区域表
 */
public class ArealistController {
    @Autowired
    ArealistService service;
//  查询所有区域
    @GetMapping("/QueryAll")
    public Object QueryAll(){
            return service.QueryAll();
    }

//  根据name模糊查询区域
    @PostMapping("/QueryByName")
    public Object QueryByName(@Param("name") String name){
        return service.QueryByName(name);
    }

//  根据id修改区域
    @PostMapping("/UpdateById")
    public Object UpdateById(Arealist area){
        return service.UpdateById(area);
    }

//  根据id删除区域
    @PostMapping("/DeleteById")
    public Object DeleteById(Integer id){
        return service.DeleteById(id);
    }

//  新增区域
    @PostMapping("/Insert")
    public Object Insert(Arealist area){
        return service.Insert(area);
    }

}

