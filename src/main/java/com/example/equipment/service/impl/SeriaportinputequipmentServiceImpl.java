package com.example.equipment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.equipment.entity.Seriaportinputequipment;
import com.example.equipment.mapper.SeriaportinputequipmentMapper;
import com.example.equipment.service.SeriaportinputequipmentService;
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
public class SeriaportinputequipmentServiceImpl extends ServiceImpl<SeriaportinputequipmentMapper, Seriaportinputequipment> implements SeriaportinputequipmentService {
    @Autowired
    SeriaportinputequipmentMapper mapper;

    @Override
    public List<Seriaportinputequipment> queryAll() {
        return mapper.selectList(null);
    }

    @Override
    public List<Seriaportinputequipment> queryByName(Seriaportinputequipment o) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("name",o.getName());
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Integer insert(Seriaportinputequipment o) {
        return mapper.insert(o);
    }

    @Override
    public Integer updateByName(Seriaportinputequipment o) {
        return mapper.updateById(o);
    }

    @Override
    public Integer deleteByName(Seriaportinputequipment o) {
        return mapper.deleteById(o);
    }
}
