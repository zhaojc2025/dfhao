package com.dfhao.admin.user;

import com.dfhao.common.mybatis.CommonVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "UserVo", description = "用户信息")
public class UserVo extends CommonVo {
    @Schema(name = "id", description = "主键")
    private Long id;

    @Schema(name = "name", description = "用户名")
    private String name;

    @Schema(name = "age", description = "年龄")
    private Integer age;

    @Schema(name = "email", description = "邮箱")
    private String email;
}
