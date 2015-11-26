package com.nice.service.impl.password;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.io.IOException;

/**
 * Author: liliangxing
 * Time: 2015-11-25.
 */
public class JasyptDecryptEncrypt {
    /**
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //密钥
        String key = "d073c52a75a56dfe37402c3cedd9b4f7";
        StandardPBEStringEncryptor encrypter = new StandardPBEStringEncryptor();
        encrypter.setPassword(key);
        String encryptUserName = encrypter.encrypt("bpep_stt"); //用户名加密
        System.out.println("加密后的用户名:\n"+encryptUserName);
        String encryptPassword = encrypter.encrypt("stt2014"); //密码加密
        System.out.println("加密后的密码:\n"+encryptPassword);
        String orgiUserName = encrypter.decrypt(encryptUserName);
        System.out.println("解密后的用户名:"+orgiUserName);
        String orgiPassword = encrypter.decrypt(encryptPassword);
        System.out.println("解密后的密码:"+orgiPassword);
    }


}
