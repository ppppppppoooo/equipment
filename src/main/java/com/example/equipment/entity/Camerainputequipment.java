package com.example.equipment.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Camerainputequipment implements Serializable {

    private static final long serialVersionUID=1L;
      @TableId("name")
      private String name;

    @TableField("equipmentMarkIP")
    private String equipmentMarkIP;

    private String account;

    private String password;

    private String state;

    @TableField("areaID")
    private Integer areaID;

    @TableField("standbyApplication01")
    private String standbyApplication01;

    @TableField("standbyApplication02")
    private String standbyApplication02;

    @TableField("standbyApplication03")
    private String standbyApplication03;

    @TableField("standbyApplication04")
    private String standbyApplication04;


}
