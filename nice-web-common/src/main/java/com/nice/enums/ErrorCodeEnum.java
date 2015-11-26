package com.nice.enums;

import lombok.Getter;

/**
 * 错误码
 *
 * Author: liliangxing
 * Time: 2015-11-24.
 */
public enum ErrorCodeEnum {

    SUCCEED_CODE("STT20000000", "成功"),
    ERROR_PARAM("STT20880001", "请求参数校验错误"),
    ERR_UNKNOW_ERROR("STT20991001", "系统未知错误");


	@Getter
	private String errorcode;
	@Getter
	private String errordesc;

	

	ErrorCodeEnum(String errorcode, String errordesc) {
		this.errorcode = errorcode;
		this.errordesc = errordesc;
	}

	public static String getDesc(String errorCode) {
		for (ErrorCodeEnum bussErrorCode : ErrorCodeEnum.values()) {
			if (bussErrorCode.errorcode.equals(errorCode)) {
				return bussErrorCode.errordesc;
			}
		}
		return errorCode;
	}
}
