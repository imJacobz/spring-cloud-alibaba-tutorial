package com.jacobz.nxauto.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @TableName sys_role
 */
@TableName(value = "sys_role")
@Data
public class Role implements Serializable {

    @Serial
    private static final long serialVersionUID = -1951294170458837012L;
    private Integer id;
    private Date addTime;
    private Integer enabled;
    private String roleName;
    private String roleDescription;
}