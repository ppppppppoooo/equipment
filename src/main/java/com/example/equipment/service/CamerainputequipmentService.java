package com.example.equipment.service;


import com.example.equipment.entity.Camerainputequipment;
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
public interface CamerainputequipmentService extends IService<Camerainputequipment> {
    //查询所有摄像头
    public List<Camerainputequipment> QueryAll();
    //根据name模糊查询摄像头
    public List<Camerainputequipment> QueryByName(String name);
    //根据id修改摄像头
    public Integer UpdateById(Camerainputequipment camera);
    //根据id删除摄像头
    public Integer DeleteById(String name);
    //新增摄像头
    public Integer Insert(Camerainputequipment camera);
}
