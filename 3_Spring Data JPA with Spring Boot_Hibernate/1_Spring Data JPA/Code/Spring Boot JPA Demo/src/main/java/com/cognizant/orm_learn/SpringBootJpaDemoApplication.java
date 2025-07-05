package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJpaDemoApplication {
    private static CountryService countryService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootJpaDemoApplication.class);

    private static void testGetAllCountries() {
        LOGGER.info("Start testGetAllCountries()");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("Countries = {}", countries);
        LOGGER.info("End testGetAllCountries()");
    }


    public static void main(String[] args) {
        LOGGER.info("main was called");
        ApplicationContext context = SpringApplication.run(SpringBootJpaDemoApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testGetAllCountries();
    }

}



