package com.gdp.gdp.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicLong;

public class GDP {

    private static final Logger logger = LoggerFactory.getLogger(GDP.class);
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private String gdp="0";
    private long number = Long.parseLong(gdp);

  // private long gDp=new Long(gdp);


    public GDP(String name, String gdp) {

        this.id = counter.incrementAndGet();
        this.name = name;
        this.gdp = gdp;
        this.number=Long.parseLong(gdp);
       // long number = Long.parseLong(gdp);
        //this.gDp=gDp;

        logger.info("We created a country");
        logger.debug("Yes we created a country with id" + this.id);


    }

    public GDP() {
    }

    public GDP(GDP toClone)
    {
        this.id = toClone.getId();
        this.name = toClone.getName();
        this.gdp = toClone.gdp;
        this.number=toClone.number;
        //this.gDp=toClone.gDp;

    }

    public long getNumber() {

        return number;
    }

    public void setNumber(long number) {

        this.number = number;
    }

    /* public long getgDp() {
        return gDp;
    }

    public void setgDp(long gDp) {
        this.gDp = gDp;
    }*/

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGDP() {
        return gdp;
    }

    public void setGDP(String GDP) {
        this.gdp = GDP;
    }

    @Override
    public String toString() {
        return "GDP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gdp='" + gdp + '\'' +
                ", number=" + number +
                '}';
    }
}
