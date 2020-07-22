package com.example.equipment.service;

import com.example.equipment.entity.Outputequipment;
import com.example.equipment.entity.Seriaportinputequipment;
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
public interface SeriaportinputequipmentService extends IService<Seriaportinputequipment> {
    public List<Seriaportinputequipment> queryAll();
    public List<Seriaportinputequipment> queryByName(Seriaportinputequipment o);
    public Integer insert(Seriaportinputequipment o);
    public Integer updateByName(Seriaportinputequipment o);
    public Integer deleteByName(Seriaportinputequipment o);

}
