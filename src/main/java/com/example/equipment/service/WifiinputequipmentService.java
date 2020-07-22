package com.example.equipment.service;

import com.example.equipment.entity.Wifiinputequipment;
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
public interface WifiinputequipmentService extends IService<Wifiinputequipment> {
    public List<Wifiinputequipment> queryAll();
    public List<Wifiinputequipment> queryByName(Wifiinputequipment o);
    public Integer insert(Wifiinputequipment o);
    public Integer updateByName(Wifiinputequipment o);
    public Integer deleteByName(Wifiinputequipment o);

}
