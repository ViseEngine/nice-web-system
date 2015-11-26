package com.nice.service.response;

import com.google.common.base.Objects;

import java.io.Serializable;

/**
 * 公共响应
 * Author: liliangxing
 * Time: 2015-11-24.
 */
public class CommonResponse<T>  implements Serializable {

    private static final long serialVersionUID = -3214885479484534221L;

    private T result;  //获取调用返回值

    private String errorCode; //获取错误码

    private String errorMsg;

    public CommonResponse() {
    }

    public CommonResponse(T result) {
        this.result = result;
    }

    public CommonResponse(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonResponse response = (CommonResponse) o;
        if (!errorCode.equals(response.errorCode)) return false;
        if (!errorMsg.equals(response.errorMsg)) return false;
        if (!result.equals(response.result)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result1 = 1;
        result1 = 31 * result1 + result.hashCode();
        result1 = 31 * result1 + errorCode.hashCode();
        result1 = 31 * result1 + errorMsg.hashCode();
        return result1;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("result", result)
                .add("errorCode", errorCode)
                .add("errorMsg", errorMsg)
                .omitNullValues()
                .toString();
    }
}
