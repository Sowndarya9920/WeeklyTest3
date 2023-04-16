package com.geekster.WeeklyTest3.sendMails;

import com.geekster.WeeklyTest3.controller.BuyerController;
import componentScan.Buyer;
import org.springframework.beans.factory.annotation.Autowired;

public class MailConstants {
    @Autowired
    static BuyerController b1;

    public static final String SENDER = "sowndaryasakthi66@gmail.com";

    // receiver email
    public static final String RECEIVERMAILADDRESS = "sowndaryasakthi66@gmail.com";

    //subject of the mail
    public static final String SUBJECT = "Testing Java mail";

    //message to be sent in the mail body
    public static final String MESSAGE = b1.buy();
}
