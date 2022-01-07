package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 商品分类 category
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.Category")
@Data
public class Category implements Serializable {

  /**
   * 主键
   */
  @ApiModelProperty(value = "主键")
  private Integer id;

  /**
   * 分类名称
   */
  @ApiModelProperty(value = "分类名称")
  private String name;

  /**
   * 分类类型
   */
  @ApiModelProperty(value = "分类类型")
  private Integer type;

  /**
   * 父id
   */
  @ApiModelProperty(value = "父id")
  private Integer fatherId;

  /**
   * 图标
   */
  @ApiModelProperty(value = "图标")
  private String logo;

  /**
   * 口号
   */
  @ApiModelProperty(value = "口号")
  private String slogan;

  /**
   * 分类图
   */
  @ApiModelProperty(value = "分类图")
  private String catImage;

  /**
   * 背景颜色
   */
  @ApiModelProperty(value = "背景颜色")
  private String bgColor;

  private static final long serialVersionUID = 1L;
}