package com.hospital.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页响应体
 *
 * @author DeZhe
 * @date 2020/4/7 - 16:05
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 7096709208757886864L;

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 带有分页的结果集
     */
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

}
