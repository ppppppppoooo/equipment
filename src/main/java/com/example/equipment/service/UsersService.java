package com.example.equipment.service;

import com.example.equipment.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
public interface UsersService extends IService<Users> {
    public String  login(Users users);
}
