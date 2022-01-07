package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 订单商品关联表 order_items
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.OrderItems")
@Data
public class OrderItems implements Serializable {

  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id")
  private String id;

  /**
   * 归属订单id
   */
  @ApiModelProperty(value = "归属订单id")
  private String orderId;

  /**
   * 商品id
   */
  @ApiModelProperty(value = "商品id")
  private String itemId;

  /**
   * 商品图片
   */
  @ApiModelProperty(value = "商品图片")
  private String itemImg;

  /**
   * 商品名称
   */
  @ApiModelProperty(value = "商品名称")
  private String itemName;

  /**
   * 规格id
   */
  @ApiModelProperty(value = "规格id")
  private String itemSpecId;

  /**
   * 规格名称
   */
  @ApiModelProperty(value = "规格名称")
  private String itemSpecName;

  /**
   * 成交价格
   */
  @ApiModelProperty(value = "成交价格")
  private Integer price;

  /**
   * 购买数量
   */
  @ApiModelProperty(value = "购买数量")
  private Integer buyCounts;

  private static final long serialVersionUID = 1L;
}