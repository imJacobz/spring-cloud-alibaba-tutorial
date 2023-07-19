package com.jacobz.nxauto.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName app_customer
 */
@TableName(value ="app_customer")
@Data
public class Customer implements Serializable {

    @Serial
    private static final long serialVersionUID = -4941046704760756862L;

    private Integer id;

    private Date addTime;

    private Date updateTime;

    private Integer status;

    private String customerName;

    private String address;

    private String city;
}