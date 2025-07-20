package com.cognizant.account.controller;

import com.cognizant.account.model.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoanController.class);

    @GetMapping("/loans/{number}")
    public Loan getLoan(@PathVariable String number) {
        LOGGER.info("getLoan called with account number: {}", number);

        Loan loan = new Loan();
        loan.setNumber("H124980AB");
        loan.setType("car");
        loan.setLoan(50000);
        loan.setEmi(5000);
        loan.setTenure(12);
        return loan;
    }
}
