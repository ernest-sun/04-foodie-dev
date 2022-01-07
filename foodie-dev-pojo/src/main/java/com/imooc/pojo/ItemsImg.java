package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品图片 items_img
 *
 * @author 光影
 * @date 2022-01-07 09:18:05
 */
@ApiModel(value = "com.shadow.model.ItemsImg")
@Data
public class ItemsImg implements Serializable {

  /**
   * 图片主键
   */
  @ApiModelProperty(value = "图片主键")
  private String id;

  /**
   * 商品外键id 商品外键id
   */
  @ApiModelProperty(value = "商品外键id 商品外键id")
  private String itemId;

  /**
   * 图片地址 图片地址
   */
  @ApiModelProperty(value = "图片地址 图片地址")
  private String url;

  /**
   * 顺序 图片顺序，从小到大
   */
  @ApiModelProperty(value = "顺序 图片顺序，从小到大")
  private Integer sort;

  /**
   * 是否主图 是否主图，1：是，0：否
   */
  @ApiModelProperty(value = "是否主图 是否主图，1：是，0：否")
  private Integer isMain;

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