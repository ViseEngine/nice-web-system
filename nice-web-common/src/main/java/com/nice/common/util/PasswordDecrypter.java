package com.nice.common.util;

import lombok.extern.slf4j.Slf4j;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nice.enums.ErrorCodeEnum;
import com.nice.exception.NiceServiceException;

@Slf4j
public class PasswordDecrypter {
	
	private static Logger log = LoggerFactory.getLogger(PasswordDecrypter.class);

	private StandardPBEStringEncryptor encrypter;
	private String key;

	public PasswordDecrypter(String key) {
		this.key = key;
	}
	public String decrypt(String encryptedString) throws NiceServiceException {
		try {
			this.encrypter = new StandardPBEStringEncryptor();
			encrypter.setPassword(this.key);
			String decrypted = this.encrypter.decrypt(encryptedString);
			return decrypted;
		} catch (Exception e) {
			log.error(
			        "[CRITICAL ERROR] Error enountered during decryption - check decryption algorithm & key match that used for encryption",
			        e);
            throw new NiceServiceException(ErrorCodeEnum.ERR_UNKNOW_ERROR);
		}
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
