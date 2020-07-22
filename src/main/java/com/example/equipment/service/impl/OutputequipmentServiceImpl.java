package com.example.equipment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.equipment.entity.Outputequipment;
import com.example.equipment.mapper.OutputequipmentMapper;
import com.example.equipment.service.OutputequipmentService;
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
public class OutputequipmentServiceImpl extends ServiceImpl<OutputequipmentMapper, Outputequipment> implements OutputequipmentService {

    @Autowired
    OutputequipmentMapper mapper;
    //查询所有输出设备
    @Override
    public List<Outputequipment> queryAll() {
        return mapper.selectList(null);
    }

    //根据设备名查询输出设备
    @Override
    public List<Outputequipment> queryByName(Outputequipment o) {
        QueryWrapper<Outputequipment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",o.getName());
        return mapper.selectList(queryWrapper);
    }

    //新增输出设备
    @Override
    public Integer insert(Outputequipment o) {
        return mapper.insert(o);
    }

    //根据设备名修改输出设备
    @Override
    public Integer updateByName(Outputequipment o) {
        return mapper.updateById(o);
    }

    //根据设备名删除输出设备
    @Override
    public Integer deleteByName(Outputequipment o) {
        return mapper.deleteById(o.getName());
    }
}
