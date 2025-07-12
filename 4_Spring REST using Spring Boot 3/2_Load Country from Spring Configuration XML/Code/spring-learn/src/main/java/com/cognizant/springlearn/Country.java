package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
    private String code;
    private String name;

    Country() {
        LOGGER.info("Created Country");
    }

    public String getCode() {
        LOGGER.info("getCode called");
        return code;
    }

    public void setCode(String code) {
        LOGGER.info("setCode({}) called", code);
        this.code = code;
    }

    public String getName() {
        LOGGER.info("getName called");
        return name;
    }

    public void setName(String name) {
        LOGGER.info("setName({}) called", name);
        this.name = name;
    }

    @Override
    public String toString() {
        LOGGER.info("toString called");
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
