package com.coffeeshop.naive;

public class TaxComputation implements TaxService {

    @Override
    public double computeTax(double price) {

        System.out.println("[System] Calculating final totals...");

        double localTax = 0.20;
        double taxAmount = price * localTax;

        return price + taxAmount;
    }
}