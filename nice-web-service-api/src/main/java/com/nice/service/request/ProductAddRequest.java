package com.nice.service.request;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 产品新增请求
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Data
@ToString(callSuper = true)
public class ProductAddRequest extends NiceRequest {

    private static final long serialVersionUID = -4759377644328659543L;

    @NotBlank(message="产品名称不能为空")
    private String productName; //产品名称
}
