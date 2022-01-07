package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表 users
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.Users")
@Data
public class Users implements Serializable {

  /**
   * 主键id 用户id
   */
  @ApiModelProperty(value = "主键id 用户id")
  private String id;

  /**
   * 用户名 用户名
   */
  @ApiModelProperty(value = "用户名 用户名")
  private String username;

  /**
   * 密码 密码
   */
  @ApiModelProperty(value = "密码 密码")
  private String password;

  /**
   * 昵称 昵称
   */
  @ApiModelProperty(value = "昵称 昵称")
  private String nickname;

  /**
   * 真实姓名
   */
  @ApiModelProperty(value = "真实姓名")
  private String realname;

  /**
   * 头像
   */
  @ApiModelProperty(value = "头像")
  private String face;

  /**
   * 手机号 手机号
   */
  @ApiModelProperty(value = "手机号 手机号")
  private String mobile;

  /**
   * 邮箱地址 邮箱地址
   */
  @ApiModelProperty(value = "邮箱地址 邮箱地址")
  private String email;

  /**
   * 性别 性别 1:男  0:女  2:保密
   */
  @ApiModelProperty(value = "性别 性别 1:男  0:女  2:保密")
  private Integer sex;

  /**
   * 生日 生日
   */
  @ApiModelProperty(value = "生日 生日")
  private Date birthday;

  /**
   * 创建时间 创建时间
   */
  @ApiModelProperty(value = "创建时间 创建时间")
  private Date createdTime;

  /**
   * 更新时间 更新时间
   */
  @ApiModelProperty(value = "更新时间 更新时间")
  private Date updatedTime;

  private static final long serialVersionUID = 1L;
}