package com.nice.util;


import com.nice.dal.interceptor.PageParameter;

/**
 * Author: liliangxing
 * Time: 2015/11/24
 */
public class PsUtils {
    /**
     * 生成分页参数对象
     * @param currentPage
     * @param pageSize
     * @return
     */
    public static PageParameter getPageParameter(long currentPage, long pageSize){
        PageParameter page = new PageParameter();
        if (currentPage != 0){
            page.setCurrentPage(currentPage);
        }
        if (pageSize !=0 ){
            page.setPageSize(pageSize);
        }
        return page;
    }

}
