package com.jacobz.nxauto.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName app_shop
 */
@TableName(value ="app_shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop implements Serializable {

    @Serial
    private static final long serialVersionUID = 2077668741671479915L;

    private Integer id;

    private Date addTime;

    private Date updateTime;

    private Integer status;

    private String name;

    private String city;
}