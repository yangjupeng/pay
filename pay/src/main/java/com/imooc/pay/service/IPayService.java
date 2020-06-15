package com.imooc.pay.service;

import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

public interface IPayService {
    /**
     * 发起创建支付
     */
    PayResponse create(String orderId, BigDecimal amount);
}
