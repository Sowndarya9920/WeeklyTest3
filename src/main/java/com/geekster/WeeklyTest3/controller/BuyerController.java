package com.geekster.WeeklyTest3.controller;

import com.geekster.WeeklyTest3.sendMails.MailConstants;
import componentScan.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {

    @Autowired
    Buyer b1;


    @GetMapping("/buyer")
    public String buy()
    {
        return b1.buy();
    }
}
