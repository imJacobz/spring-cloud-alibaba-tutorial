package com.jacobz.nxauto.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.common.entity.User;
import com.jacobz.nxauto.common.service.UserService;
import com.jacobz.nxauto.common.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author jacob
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-07-18 10:56:16
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




