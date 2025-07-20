package com.cognizant.account.model;

public class Loan {
    private String number;
    private String type;
    private long loan;
    private long emi;
    private int tenure;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLoan() {
        return loan;
    }

    public void setLoan(long loan) {
        this.loan = loan;
    }

    public long getEmi() {
        return emi;
    }

    public void setEmi(long emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", loan=" + loan +
                ", emi=" + emi +
                ", tenure=" + tenure +
                '}';
    }
}

