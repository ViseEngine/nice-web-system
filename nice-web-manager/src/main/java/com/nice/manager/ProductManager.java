package com.nice.manager;

import com.nice.dal.service.ProductMapper;
import com.nice.service.request.ProductAddRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Random;

/**
 * 产品mapper
 * <p>
 * 1、产品新增
 * </p>
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Component
@Slf4j
public class ProductManager {

    /**
     * 产品新增
     *
     * @param request  产品新增请求参数
     * @return 结果对象
     */
    public String addProduct(ProductAddRequest request){
        String productCode = Calendar.getInstance().get(Calendar.YEAR) + new Random().nextInt(10)+"";
        ProductMapper.insert(productCode, request.getProductName());
        return productCode;
    }
}
