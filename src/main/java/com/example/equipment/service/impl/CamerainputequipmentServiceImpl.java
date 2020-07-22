package com.example.equipment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.example.equipment.entity.Camerainputequipment;
import com.example.equipment.mapper.CamerainputequipmentMapper;
import com.example.equipment.service.CamerainputequipmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Service
public class CamerainputequipmentServiceImpl extends ServiceImpl<CamerainputequipmentMapper, Camerainputequipment> implements CamerainputequipmentService {

    @Autowired
    CamerainputequipmentMapper Mapper;
    //查询所有摄像头
    @Override
    public List<Camerainputequipment> QueryAll() {
        return Mapper.selectList(null);
    }
    //根据name模糊查询摄像头
    @Override
    public List<Camerainputequipment> QueryByName(String name) {
        QueryWrapper<Camerainputequipment> queryWrapper =new QueryWrapper<>();
        queryWrapper.like("name",name);
        return Mapper.selectList(queryWrapper);
    }
    //根据id修改摄像头
    @Override
    public Integer UpdateById(Camerainputequipment camera) {
        return Mapper.updateById(camera);
    }
    //根据id删除摄像头
    @Override
    public Integer DeleteById(String name) {
        return Mapper.deleteById(name);
    }
    //新增摄像头
    @Override
    public Integer Insert(Camerainputequipment camera) {
        List<Camerainputequipment> list= QueryByName(camera.getName());
        if(list.size()==0) {
            return Mapper.insert(camera);
        }
        return 0;
    }
}
