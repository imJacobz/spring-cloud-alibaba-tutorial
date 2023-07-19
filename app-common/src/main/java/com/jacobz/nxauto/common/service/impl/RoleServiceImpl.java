package com.jacobz.nxauto.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.common.entity.Role;
import com.jacobz.nxauto.common.service.RoleService;
import com.jacobz.nxauto.common.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author jacob
* @description 针对表【sys_role】的数据库操作Service实现
* @createDate 2023-07-18 10:56:16
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




