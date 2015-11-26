package com.nice.service.impl.oracle;

import com.nice.service.impl.BaseOracleDBUnitTest;
import com.nice.service.impl.TestConstant;
import com.nice.enums.ErrorCodeEnum;
import com.nice.service.ProductOperService;
import com.nice.service.request.ProductAddRequest;
import com.nice.service.response.NiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 产品服务测试
 * Author: liliangxing
 * Time: 2015-11-25.
 */
@Slf4j
public class ProductOperServiceImplOracleTest extends BaseOracleDBUnitTest {

    @Resource
    private ProductOperService productOperService;


    @Test
    public void testAddProduct() throws Exception {
        ProductAddRequest request = new ProductAddRequest();
        request.setProductName("罗技");
        request.setInitiationID(TestConstant.InitiationID);
        NiceResponse<String> response = productOperService.addProduct(request);
        assertEquals(ErrorCodeEnum.SUCCEED_CODE.getErrorcode(), response.getErrorCode());
        assertEquals(ErrorCodeEnum.SUCCEED_CODE.getErrordesc(), response.getErrorMsg());
        System.out.println(response);
    }

}
