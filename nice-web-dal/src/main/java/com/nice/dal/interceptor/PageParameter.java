package com.nice.dal.interceptor;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页参数
 *
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Data
public class PageParameter implements Serializable{

    public static final long DEFAULT_CURRENT_PAGE = 1;
    public static final long DEFAULT_PAGE_SIZE = 10;


    private long pageSize; //每页记录数
    private long currentPage; //当前页数
    private long totalCount; //总记录数

    public PageParameter() {
        this.currentPage = DEFAULT_CURRENT_PAGE;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     * 
     * @param currentPage
     * @param pageSize
     */
    public PageParameter(long currentPage, long pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
   
}
