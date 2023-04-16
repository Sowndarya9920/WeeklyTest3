package com.geekster.WeeklyTest3.controller;

import com.geekster.WeeklyTest3.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

    @Autowired
    @Qualifier("Fix Your Gadgets")
    Seller p1;

    @GetMapping("/seller")
    public Seller getProducts()
    {
        return p1;
    }
}
