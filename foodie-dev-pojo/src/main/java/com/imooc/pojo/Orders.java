package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单表; orders
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.Orders")
@Data
public class Orders implements Serializable {

  /**
   * 订单主键;同时也是订单编号
   */
  @ApiModelProperty(value = "订单主键;同时也是订单编号")
  private String id;

  /**
   * 用户id
   */
  @ApiModelProperty(value = "用户id")
  private String userId;

  /**
   * 收货人快照
   */
  @ApiModelProperty(value = "收货人快照")
  private String receiverName;

  /**
   * 收货人手机号快照
   */
  @ApiModelProperty(value = "收货人手机号快照")
  private String receiverMobile;

  /**
   * 收货地址快照
   */
  @ApiModelProperty(value = "收货地址快照")
  private String receiverAddress;

  /**
   * 订单总价格
   */
  @ApiModelProperty(value = "订单总价格")
  private Integer totalAmount;

  /**
   * 实际支付总价格
   */
  @ApiModelProperty(value = "实际支付总价格")
  private Integer realPayAmount;

  /**
   * 邮费;默认可以为零，代表包邮
   */
  @ApiModelProperty(value = "邮费;默认可以为零，代表包邮")
  private Integer postAmount;

  /**
   * 支付方式
   */
  @ApiModelProperty(value = "支付方式")
  private Integer payMethod;

  /**
   * 买家留言
   */
  @ApiModelProperty(value = "买家留言")
  private String leftMsg;

  /**
   * 扩展字段
   */
  @ApiModelProperty(value = "扩展字段")
  private String extand;

  /**
   * 买家是否评价;1：已评价，0：未评价
   */
  @ApiModelProperty(value = "买家是否评价;1：已评价，0：未评价")
  private Integer isComment;

  /**
   * 逻辑删除状态;1: 删除 0:未删除
   */
  @ApiModelProperty(value = "逻辑删除状态;1: 删除 0:未删除")
  private Integer isDelete;

  /**
   * 创建时间（成交时间）
   */
  @ApiModelProperty(value = "创建时间（成交时间）")
  private Date createdTime;

  /**
   * 更新时间
   */
  @ApiModelProperty(value = "更新时间")
  private Date updatedTime;

  private static final long serialVersionUID = 1L;
}