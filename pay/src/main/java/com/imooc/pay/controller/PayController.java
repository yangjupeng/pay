package com.imooc.pay.controller;

import com.imooc.pay.service.impl.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pay")
public class PayController {
    @Autowired
    private PayService payService;
    @RequestMapping("create")
    public ModelAndView create(@RequestParam("orderId") String orderId, @RequestParam("amount") BigDecimal amount){
        PayResponse response = payService.create(orderId, amount);
        Map<String,String> map=new HashMap<>();
        map.put("codeUrl",response.getCodeUrl());
        return new ModelAndView("create",map);
    }
}
