package com.nice.util;

import com.nice.enums.ErrorCodeEnum;
import com.nice.exception.NiceServiceException;
import com.nice.service.response.NiceResponse;

/**
 * Author: liliangxing
 * Time: 2015/11/24
 */
public class NiceResponseUtil {



    public static <T> void setMsgByErrorEnum(NiceResponse<T> response, ErrorCodeEnum errorEnum){
        response.setErrorCode(errorEnum.getErrorcode());
        response.setErrorMsg(errorEnum.getErrordesc());
    }

    public static <T> void setMsgByException(NiceResponse<T> response, NiceServiceException e){
        response.setErrorCode(e.getErrCode());
        response.setErrorMsg(e.getErrReason());
    }


}
