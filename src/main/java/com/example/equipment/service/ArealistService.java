package com.example.equipment.service;

import com.example.equipment.entity.Arealist;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.equipment.entity.Users;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
/**
 * 区域表
 */
public interface ArealistService extends IService<Arealist> {
//查询所有区域
    public List<Arealist> QueryAll();
//根据name模糊查询区域
    public List<Arealist> QueryByName(String name);
//根据id修改区域
    public Integer UpdateById(Arealist area);
//根据id删除区域
    public Integer DeleteById(Integer id);
//新增区域
    public Integer Insert(Arealist area);
}
