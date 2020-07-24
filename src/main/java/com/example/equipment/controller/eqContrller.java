package com.example.equipment.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@CrossOrigin
@Controller
public class eqContrller {
    @PostMapping("/eq")
    public void s(Object o) {
        System.err.println(JSON.toJSONString(o));
    }

}
