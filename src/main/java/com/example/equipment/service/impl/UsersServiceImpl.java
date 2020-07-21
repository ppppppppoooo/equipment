package com.example.equipment.service.impl;

import com.example.equipment.entity.Users;
import com.example.equipment.mapper.UsersMapper;
import com.example.equipment.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Autowired
    UsersMapper mapper;
    @Autowired
     RedisTemplate<String, Object> redisTemplate;
    @Override
    public String login(Users users) {
        Users u = mapper.selectById(users);
        if (u!=null){
            String token = UUID.randomUUID() + "";
            //存入redis
            redisTemplate.opsForValue().set(token, u, 30L, TimeUnit.MINUTES);
            return   token;
        }
        return  "";
    }
}
