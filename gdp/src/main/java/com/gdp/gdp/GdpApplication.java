package com.gdp.gdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class GdpApplication {

    public static CountryList myCountryList;


    public static void main(String[] args) {

        myCountryList = new CountryList();

        SpringApplication.run(GdpApplication.class, args);
    }

}
