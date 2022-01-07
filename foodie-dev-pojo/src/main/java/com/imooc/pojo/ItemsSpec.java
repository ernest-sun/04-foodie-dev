package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 items_spec
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.ItemsSpec")
@Data
public class ItemsSpec implements Serializable {

  /**
   * 商品规格id
   */
  @ApiModelProperty(value = "商品规格id")
  private String id;

  /**
   * 商品外键id
   */
  @ApiModelProperty(value = "商品外键id")
  private String itemId;

  /**
   * 规格名称
   */
  @ApiModelProperty(value = "规格名称")
  private String name;

  /**
   * 库存
   */
  @ApiModelProperty(value = "库存")
  private Integer stock;

  /**
   * 折扣力度
   */
  @ApiModelProperty(value = "折扣力度")
  private BigDecimal discounts;

  /**
   * 优惠价
   */
  @ApiModelProperty(value = "优惠价")
  private Integer priceDiscount;

  /**
   * 原价
   */
  @ApiModelProperty(value = "原价")
  private Integer priceNormal;

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

  private static final long serialVersionUID = 1L;
}