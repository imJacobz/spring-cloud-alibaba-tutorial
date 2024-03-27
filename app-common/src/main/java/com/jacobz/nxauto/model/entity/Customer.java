package com.jacobz.nxauto.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * app_customer
 */
@TableName(value ="app_customer")
@Data
public class Customer implements Serializable {

    @Serial
    private static final long serialVersionUID = -4941046704760756862L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @JsonFormat(pattern = "MMM/dd/yyyy HH:mm:ss")
    private Date addTime;

    @JsonFormat(pattern = "MMM/dd/yyyy HH:mm:ss")
    private Date updateTime;

    private Integer status;

    private String customerName;

    private String address;

    private String city;
}