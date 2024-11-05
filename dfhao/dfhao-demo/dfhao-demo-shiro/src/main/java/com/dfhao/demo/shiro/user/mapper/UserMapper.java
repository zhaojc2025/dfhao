package com.dfhao.demo.shiro.user.mapper;

import com.dfhao.demo.shiro.user.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User queryUserByUserName(String userName);
}
