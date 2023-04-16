package com.geekster.WeeklyTest3;

import com.geekster.WeeklyTest3.sendMails.HandleMail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeeklyTest3Application {


	public static void main(String[] args) {

		SpringApplication.run(WeeklyTest3Application.class, args);

		System.out.println("This application is supposed to send mails");

		HandleMail mailer = new HandleMail();
		mailer.sendMail();
	}

}
