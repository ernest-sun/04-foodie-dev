package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 items
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.Items")
@Data
public class Items implements Serializable {

  /**
   * 商品主键id
   */
  @ApiModelProperty(value = "商品主键id")
  private String id;

  /**
   * 商品名称 商品名称
   */
  @ApiModelProperty(value = "商品名称 商品名称")
  private String itemName;

  /**
   * 分类外键id 分类id
   */
  @ApiModelProperty(value = "分类外键id 分类id")
  private Integer catId;

  /**
   * 一级分类外键id
   */
  @ApiModelProperty(value = "一级分类外键id")
  private Integer rootCatId;

  /**
   * 累计销售 累计销售
   */
  @ApiModelProperty(value = "累计销售 累计销售")
  private Integer sellCounts;

  /**
   * 上下架状态 上下架状态,1:上架 2:下架
   */
  @ApiModelProperty(value = "上下架状态 上下架状态,1:上架 2:下架")
  private Integer onOffStatus;

  /**
   * 创建时间
   */
  @ApiModelProperty(value = "创建时间")
  private Date createdTime;

  /**
   * 更新时间
   */
  @ApiModelProperty(value = "更新时间")
  private Date updatedTime;

  /**
   * 商品内容 商品内容
   */
  @ApiModelProperty(value = "商品内容 商品内容")
  private String content;

  private static final long serialVersionUID = 1L;
}