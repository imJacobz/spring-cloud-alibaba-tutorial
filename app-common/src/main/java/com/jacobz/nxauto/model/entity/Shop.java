package com.jacobz.nxauto.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName app_shop
 */
@TableName(value = "app_shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop implements Serializable {

    @Serial
    private static final long serialVersionUID = 2077668741671479915L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @JsonFormat(pattern = "MMM/dd/yyyy HH:mm:ss")
    private Date addTime;

    @JsonFormat(pattern = "MMM/dd/yyyy HH:mm:ss")
    private Date updateTime;

    private Integer status;

    private String name;

    private String city;
}