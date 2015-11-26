package com.nice.util;

import com.nice.enums.ErrorCodeEnum;
import com.nice.exception.NiceServiceException;
import com.nice.service.request.CommonRequest;
import com.nice.service.response.NiceResponse;
import org.slf4j.Logger;

/**
 * Author: liliangxing
 * Time: 2014/6/13.
 */
public class SvUtils {

    /**
     * 处理异常
     * @param e
     * @param response
     * @param log
     */
    public static void handleException(Exception e, CommonRequest request, NiceResponse<?> response, Logger log){
        log.error("[{}]",request.getInitiationID(),e.getMessage(), e);
        if (e instanceof NiceServiceException) {
            NiceResponseUtil.setMsgByException(response, (NiceServiceException) e);
        }else {
            NiceResponseUtil.setMsgByErrorEnum(response, ErrorCodeEnum.ERR_UNKNOW_ERROR);
        }
    }

    public static<T> void setSuccResult(NiceResponse<T> errResponse, T result){
        errResponse.setErrorCode(ErrorCodeEnum.SUCCEED_CODE.getErrorcode());
        errResponse.setErrorMsg(ErrorCodeEnum.SUCCEED_CODE.getErrordesc());
        errResponse.setResult(result);
    }



}
