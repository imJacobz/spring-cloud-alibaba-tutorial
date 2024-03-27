package com.jacobz.nxauto.mapper;

import com.jacobz.nxauto.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    User selectByUsernameOrEmail(@Param("name") String name);
}




