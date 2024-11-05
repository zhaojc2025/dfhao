package com.dfhao.admin.user;

import com.dfhao.common.mybatis.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CommonServiceImpl<UserMapper, User> implements IUserService {

}
