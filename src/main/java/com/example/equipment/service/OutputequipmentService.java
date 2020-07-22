package com.example.equipment.service;

import com.example.equipment.entity.Outputequipment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
public interface OutputequipmentService extends IService<Outputequipment> {

    public List<Outputequipment> queryAll();
    public List<Outputequipment> queryByName(Outputequipment o);
    public Integer insert(Outputequipment o);
    public Integer updateByName(Outputequipment o);
    public Integer deleteByName(Outputequipment o);
}
