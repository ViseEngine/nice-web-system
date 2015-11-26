package com.nice.service.impl;

import com.nice.util.SvUtils;
import com.nice.validate.NiceValidator;
import com.nice.manager.ProductManager;
import com.nice.service.ProductOperService;
import com.nice.service.request.ProductAddRequest;
import com.nice.service.response.NiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 产品服务
 * <p>
 * 1、产品新增
 * </p>
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Service
@Slf4j
public class ProductOperServiceImpl implements ProductOperService {

    @Resource
    private ProductManager productManager;

    @Resource
    private NiceValidator niceValidator;

    /**
     * 产品新增
     *
     * @param request 产品新增请求对象
     * @return 结果对象
     */
    @Override
    public NiceResponse<String> addProduct(ProductAddRequest request) {
        NiceResponse<String> response = new NiceResponse<String>();
        try{
            //校验请求参数
            niceValidator.validate(request);
            String result  = productManager.addProduct(request);
            SvUtils.setSuccResult(response, result);
        } catch (Exception e){
            SvUtils.handleException(e, request, response, log);
        }
        return response;
    }
}
