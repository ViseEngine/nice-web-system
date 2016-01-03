package com.nice.service.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 公共请求
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Data
public class CommonRequest implements Serializable{

    private static final long serialVersionUID = -449603975016674678L;

    /**
     * 发起流水号
     */
    private String initiationID;

	public String getInitiationID() {
		return initiationID;
	}

	public void setInitiationID(String initiationID) {
		this.initiationID = initiationID;
	}
}
