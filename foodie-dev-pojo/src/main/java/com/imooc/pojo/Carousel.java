package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 轮播图 carousel
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.Carousel")
@Data
public class Carousel implements Serializable {

  /**
   * 主键
   */
  @ApiModelProperty(value = "主键")
  private String id;

  /**
   * 图片 图片地址
   */
  @ApiModelProperty(value = "图片 图片地址")
  private String imageUrl;

  /**
   * 背景色
   */
  @ApiModelProperty(value = "背景色")
  private String backgroundColor;

  /**
   * 商品id 商品id
   */
  @ApiModelProperty(value = "商品id 商品id")
  private String itemId;

  /**
   * 商品分类id 商品分类id
   */
  @ApiModelProperty(value = "商品分类id 商品分类id")
  private String catId;

  /**
   * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
   */
  @ApiModelProperty(value = "轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
  private Integer type;

  /**
   * 轮播图展示顺序
   */
  @ApiModelProperty(value = "轮播图展示顺序")
  private Integer sort;

  /**
   * 是否展示
   */
  @ApiModelProperty(value = "是否展示")
  private Integer isShow;

  /**
   * 创建时间 创建时间
   */
  @ApiModelProperty(value = "创建时间 创建时间")
  private Date createTime;

  /**
   * 更新时间 更新
   */
  @ApiModelProperty(value = "更新时间 更新")
  private Date updateTime;

  private static final long serialVersionUID = 1L;
}