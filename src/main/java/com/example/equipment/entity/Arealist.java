package com.example.equipment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
public class Arealist implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "areaID", type = IdType.AUTO)
      private Integer areaID;

    @TableField("areaName")
    private String areaName;

    @TableField("areaPicture")
    private String areaPicture;

    @TableField("areaQuickMark")
    private String areaQuickMark;

    @TableField("standbyApplication01")
    private String standbyApplication01;

    @TableField("standbyApplication02")
    private String standbyApplication02;

    @TableField("standbyApplication03")
    private String standbyApplication03;

    @TableField("standbyApplication04")
    private String standbyApplication04;


}
