package com.dfhao.common.mybatis;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Schema(name = "PageVo", description = "分页结果")
public class PageVo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(name = "current", description = "当前页")
    private long current;

    @Schema(name = "total", description = "总条数")
    private long total;

    @Schema(name = "rows", description = "查询结果")
    private List<T> rows;

    public PageVo() {
    }

    public PageVo(long current, long total, List<T> rows) {
        this.total = total;
        this.current = current;
        this.rows = rows;
    }
}
