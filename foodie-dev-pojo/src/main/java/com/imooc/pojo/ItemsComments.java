package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价表 items_comments
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.ItemsComments")
@Data
public class ItemsComments implements Serializable {

  /**
   * id主键
   */
  @ApiModelProperty(value = "id主键")
  private String id;

  /**
   * 用户id 用户名须脱敏
   */
  @ApiModelProperty(value = "用户id 用户名须脱敏")
  private String userId;

  /**
   * 商品id
   */
  @ApiModelProperty(value = "商品id")
  private String itemId;

  /**
   * 商品名称
   */
  @ApiModelProperty(value = "商品名称")
  private String itemName;

  /**
   * 商品规格id 可为空
   */
  @ApiModelProperty(value = "商品规格id 可为空")
  private String itemSpecId;

  /**
   * 规格名称 可为空
   */
  @ApiModelProperty(value = "规格名称 可为空")
  private String sepcName;

  /**
   * 评价等级 1：好评 2：中评 3：差评
   */
  @ApiModelProperty(value = "评价等级 1：好评 2：中评 3：差评")
  private Integer commentLevel;

  /**
   * 评价内容
   */
  @ApiModelProperty(value = "评价内容")
  private String content;

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