package com.sso.mapper;

import com.sso.domain.UserPojo;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public UserPojo queryByUserName(@Param("userName") String userName);
}

