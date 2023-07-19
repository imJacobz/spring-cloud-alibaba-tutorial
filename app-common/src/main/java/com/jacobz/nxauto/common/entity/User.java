package com.jacobz.nxauto.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @TableName sys_user
 */
@TableName(value = "sys_user")
@Data
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -2639523615630583325L;

    private Integer id;

    private Date addTime;

    private Date updateTime;

    private Integer status;

    private String username;

    private String password;

    private String email;

    private String cellPhone;

    private String avatar;

    private String github;

    private Integer roleId;

    @TableField(exist = false)
    private List<Role> roles;
}