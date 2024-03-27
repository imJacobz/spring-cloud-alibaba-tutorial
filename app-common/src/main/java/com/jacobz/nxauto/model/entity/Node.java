package com.jacobz.nxauto.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName sys_node
 */
@TableName(value ="sys_node")
@Data
public class Node implements Serializable {

    @Serial
    private static final long serialVersionUID = -618388919958011449L;

    private Integer id;

    private Integer enabled;

    private Date addTime;

    private String menuName;

    private Integer menuType;

    private Integer menuOrder;

    private String url;

    private Integer parentMenu;
}