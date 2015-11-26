package com.nice.exception;

import com.nice.enums.ErrorCodeEnum;
import lombok.Getter;


/**
 * 自定义异常
 *
 * Author: liliangxing
 * Time: 2015-11-24.
 */
public class NiceServiceException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	private String errCode = "";

	@Getter
	private String errReason = "";

	public NiceServiceException(String errCode, String errReason) {
		super("[" + errCode + "]" + errReason);
		this.errCode = errCode;
		this.errReason =errReason;
	}

	public NiceServiceException(ErrorCodeEnum errorCodeEnum) {
		super("[" + errorCodeEnum.getErrorcode() + "]" + errorCodeEnum.getErrordesc());
		this.errCode = errorCodeEnum.getErrorcode();
		this.errReason =errorCodeEnum.getErrordesc();
	}

	public NiceServiceException(String msg) {
		super(msg);
	}}
