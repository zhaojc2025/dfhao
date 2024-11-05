package com.dfhao.admin.user;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_t")
public class User {
    @TableId
    private Long id;

    private String name;

    private String pwd;

    private String userCode;
}
