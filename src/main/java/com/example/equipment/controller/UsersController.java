package com.example.equipment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.example.equipment.entity.Users;
import com.example.equipment.service.UsersService;
import com.example.equipment.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Controller
@RequestMapping("/generator/users")
@ResponseBody
public class UsersController {


    @Autowired
    UsersServiceImpl service;

    @PostMapping("/userid")
    public String login(@RequestBody Users users) {
        return service.login(users);
    }

}

