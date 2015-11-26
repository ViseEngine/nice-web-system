package com.nice.dal.service;

import lombok.extern.slf4j.Slf4j;

/**
 * 产品mapper
 *
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Slf4j
public class ProductMapper {

    public static int insert(String productCode, String productName){
        log.info("productCode {} productName {}", productCode, productName);
        return 1;
    }
}
