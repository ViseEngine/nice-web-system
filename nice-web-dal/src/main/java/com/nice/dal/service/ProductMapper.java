package com.nice.dal.service;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 产品mapper
 *
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Slf4j
public class ProductMapper {

	private static Logger log = LoggerFactory.getLogger(ProductMapper.class);
	
    public static int insert(String productCode, String productName){
        log.info("productCode {} productName {}", productCode, productName);
        return 1;
    }
}
