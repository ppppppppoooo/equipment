package com.example.equipment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.equipment.entity.Seriaportinputequipment;
import com.example.equipment.entity.Wifiinputequipment;
import com.example.equipment.mapper.WifiinputequipmentMapper;
import com.example.equipment.service.WifiinputequipmentService;
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
public class WifiinputequipmentServiceImpl extends ServiceImpl<WifiinputequipmentMapper, Wifiinputequipment> implements WifiinputequipmentService {

    @Autowired
    WifiinputequipmentMapper mapper;
    @Override
    public List<Wifiinputequipment> queryAll() {
        return mapper.selectList(null);
    }

    @Override
    public List<Wifiinputequipment> queryByName(Wifiinputequipment o) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("name",o.getName());
        return mapper.selectList(queryWrapper);
    }

    @Override
    public Integer insert(Wifiinputequipment o) {
        return mapper.insert(o);
    }

    @Override
    public Integer updateByName(Wifiinputequipment o) {
        return mapper.updateById(o);
    }

    @Override
    public Integer deleteByName(Wifiinputequipment o) {
        return mapper.deleteById(o);
    }

}
