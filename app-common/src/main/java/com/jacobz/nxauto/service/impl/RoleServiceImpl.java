package com.jacobz.nxauto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.model.entity.Role;
import com.jacobz.nxauto.service.RoleService;
import com.jacobz.nxauto.mapper.RoleMapper;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




