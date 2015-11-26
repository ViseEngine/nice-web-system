package com.nice.common.util;

import java.math.BigDecimal;

/**
 * 分元单位转换
 *
 * Author: liliangxing
 * Time: 2015-11-24.
 */
public class MoneyConvUtil {
    /**
     * 单位转换:分转元
     * @param money
     * @return
     */
    public static BigDecimal divide2(String money) {
        BigDecimal bigMoney = new BigDecimal(money);
        BigDecimal feedRate = new BigDecimal("100");
        bigMoney = bigMoney.divide(feedRate).setScale(2);
        return bigMoney;
    }

    /**
     * 单位转换:元转分
     * @param money
     * @return
     */
    public static String multiply(BigDecimal money) {
        BigDecimal feedRate = new BigDecimal(100);
        String returnMoney =money.multiply(feedRate).setScale(0).toString();
        return returnMoney;
    }

}
