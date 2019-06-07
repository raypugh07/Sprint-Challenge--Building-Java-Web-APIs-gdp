package com.gdp.gdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class GdpApplication {

    public static CountryList myCountryList;


    public static void main(String[] args) {

        myCountryList = new CountryList();

        ApplicationContext ctx=  SpringApplication.run(GdpApplication.class, args);

        DispatcherServlet dispatcherServlet=(DispatcherServlet)ctx.getBean("dispatcherServlet") ;
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
    }

}
