package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * stu
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.Stu")
@Data
public class Stu implements Serializable {

  /**
   *
   */
  @ApiModelProperty(value = "")
  private Integer id;

  /**
   *
   */
  @ApiModelProperty(value = "")
  private String name;

  /**
   *
   */
  @ApiModelProperty(value = "")
  private Integer age;

  private static final long serialVersionUID = 1L;
}