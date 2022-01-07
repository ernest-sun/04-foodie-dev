package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户地址表 user_address
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.UserAddress")
@Data
public class UserAddress implements Serializable {

  /**
   * 地址主键id
   */
  @ApiModelProperty(value = "地址主键id")
  private String id;

  /**
   * 关联用户id
   */
  @ApiModelProperty(value = "关联用户id")
  private String userId;

  /**
   * 收件人姓名
   */
  @ApiModelProperty(value = "收件人姓名")
  private String receiver;

  /**
   * 收件人手机号
   */
  @ApiModelProperty(value = "收件人手机号")
  private String mobile;

  /**
   * 省份
   */
  @ApiModelProperty(value = "省份")
  private String province;

  /**
   * 城市
   */
  @ApiModelProperty(value = "城市")
  private String city;

  /**
   * 区县
   */
  @ApiModelProperty(value = "区县")
  private String district;

  /**
   * 详细地址
   */
  @ApiModelProperty(value = "详细地址")
  private String detail;

  /**
   * 扩展字段
   */
  @ApiModelProperty(value = "扩展字段")
  private String extand;

  /**
   * 是否默认地址
   */
  @ApiModelProperty(value = "是否默认地址")
  private Integer isDefault;

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