package com.gdp.gdp.controller;

import com.gdp.gdp.CountryList;
import com.gdp.gdp.GdpApplication;
import com.gdp.gdp.exception.ResourceNotFoundException;
import com.gdp.gdp.model.GDP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;


@RestController
@RequestMapping("/data")
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @Autowired


    // localhost:2019/data/countries
    @GetMapping(value = "/countries")
    public ResponseEntity<?> getAllCountries() {
        logger.info("/data/countries accessed");

        GdpApplication.myCountryList.countryList.sort((c1, c2 ) -> c1.getName().compareToIgnoreCase(c2.getName()));

        return new ResponseEntity<>(GdpApplication.myCountryList.countryList, HttpStatus.OK);
    }

    // localhost:2019/data/maxtomin
    @GetMapping(value = "/maxtomin", produces = {"application/json"})
    public ResponseEntity<?> listMaxToMin()
    {
        logger.info("/data/maxtomin accessed");

        GdpApplication.myCountryList.countryList.sort(Comparator.comparing(GDP::getNumber).reversed());


        return new ResponseEntity<>(GdpApplication.myCountryList.countryList, HttpStatus.OK);
    }

    //localhost:2019/data/country/2
    @GetMapping(value="/country/{id}",
            produces={"application/json"})
    public ResponseEntity<?> getCountryDetail(@PathVariable long id)throws ResourceNotFoundException {
        logger.info("/data/country " + id + " accessed");


        GDP rtnCountry;
        if (GdpApplication.myCountryList.findCountry(d -> (d.getId() == id)) == null) {
            throw new ResourceNotFoundException("Country with id " + id + " not found");
        } else {
            rtnCountry = GdpApplication.myCountryList.findCountry(d -> (d.getId() == id));
        }
        return new ResponseEntity<>(rtnCountry, HttpStatus.OK);
    }

    // localhost:2019/data/median
    @GetMapping(value = "/median", produces = {"application/json"})
    public ResponseEntity<?> findMedianGDP()
    {
        logger.info("/data/median accessed");
        GdpApplication.myCountryList.countryList.sort((c1, c2) -> (int)(c1.getNumber() - c2.getNumber()));

        GDP rtnCountry = GdpApplication.myCountryList.countryList
                .get((GdpApplication.myCountryList.countryList.size() / 2) + 1);
        return new ResponseEntity<>(rtnCountry, HttpStatus.OK);
    }

    //localhost:2019/data/countryTable
   @GetMapping(value="/countrytable")
    public ModelAndView displayEmployeeTable(){
       logger.info("/data/countrytable accessed");

        ModelAndView mav= new ModelAndView();
        mav.setViewName("countries");

        mav.addObject("countryList",GdpApplication.myCountryList.countryList);
        return mav;

   }

}
