package com.geekster.WeeklyTest3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ComponentScan"})
public class CustomConfiguration {

    @Bean("Fix Your Gadgets")
    public Seller getSeller1() {
        return new Seller("Fix Your Gadgets");
    }

    @Bean("Divine Energy Tech")
    public Seller getSeller2() {
        return new Seller("Divine Energy Tech");
    }
}
