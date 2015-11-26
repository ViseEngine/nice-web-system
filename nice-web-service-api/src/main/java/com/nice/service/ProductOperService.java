package com.nice.service;

import com.nice.service.request.ProductAddRequest;
import com.nice.service.response.NiceResponse;

/**
 * 产品服务
 * <p>
 * 1、产品新增
 * </p>
 * Author: liliangxing
 * Time: 2015-11-24.
 */
public interface ProductOperService {

    /**
     * 产品新增
     *
     * @param request 产品新增请求对象
     * @return 结果对象
     */
    NiceResponse<String> addProduct(ProductAddRequest request);

}
