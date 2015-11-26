package com.nice.service.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Author: liliangxing
 * Time: 2014/9/18.
 */
@Data
public class PageSumResult<T, S> implements Serializable {

    private static final long serialVersionUID = 7836564397344813716L;

    private List<T> resultList;

    private S sumInfo;
}
