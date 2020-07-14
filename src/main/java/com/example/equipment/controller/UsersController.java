package com.example.equipment.controller;


<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
=======
import com.example.equipment.entity.Users;
import com.example.equipment.service.UsersService;
import com.example.equipment.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
>>>>>>> 7cfb106... init

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Controller
@RequestMapping("/generator/users")
<<<<<<< HEAD
public class UsersController {
=======
@ResponseBody
public class UsersController {
    @Autowired
    UsersServiceImpl service;
    @PostMapping("/userid")
    public  String    login (@RequestBody Users users){
       return  service.login(users);
    }
>>>>>>> 7cfb106... init

}

