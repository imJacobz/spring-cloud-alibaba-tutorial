package com.jacobz.nxauto.common.mapper;

import com.jacobz.nxauto.common.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author jacob
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2023-07-18 10:56:16
* @Entity com.jacobz.nxauto.common.entity.User
*/
public interface UserMapper extends BaseMapper<User> {

    User selectByUsernameOrEmail(@Param("name") String name);
}




