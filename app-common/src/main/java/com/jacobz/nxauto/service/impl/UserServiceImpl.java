package com.jacobz.nxauto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacobz.nxauto.model.entity.User;
import com.jacobz.nxauto.service.UserService;
import com.jacobz.nxauto.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




