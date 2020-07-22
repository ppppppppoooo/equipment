package com.example.equipment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.equipment.entity.Arealist;
import com.example.equipment.mapper.ArealistMapper;
import com.example.equipment.service.ArealistService;
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
/**
 * 区域表
 */
public class ArealistServiceImpl extends ServiceImpl<ArealistMapper, Arealist> implements ArealistService {
    @Autowired
    ArealistMapper Mapper;
//查询所有区域
    @Override
    public List<Arealist> QueryAll() {
        return Mapper.selectList(null);
    }
//根据name模糊查询区域
    @Override
    public List<Arealist> QueryByName(String name) {
        QueryWrapper<Arealist> queryWrapper =new QueryWrapper<>();
        queryWrapper.like("areaName",name);
        return Mapper.selectList(queryWrapper);
    }
//根据id修改区域
    @Override
    public Integer UpdateById(Arealist area) {
        return Mapper.updateById(area);
    }
//根据id删除区域
    @Override
    public Integer DeleteById(Integer id) {
        return Mapper.deleteById(id);
    }
//新增区域
    @Override
    public Integer Insert(Arealist area) {
        return Mapper.insert(area);
    }
}
