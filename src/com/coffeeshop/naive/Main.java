package com.coffeeshop.naive;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Starting Naive Coffee Shop System ===");

        String customerName = "Apito pogi";
        String coffeeType = "kopiko redhorse flavor";
        double price = 150.00;

        TaxService taxService = new TaxComputation(); 
        ReceiptService receiptService = new receipt();
        StorageService storageService = new storage();

        double finalPrice = taxService.computeTax(price);

        receiptService.printReceipt(customerName, coffeeType, price, finalPrice);

        storageService.saveOrder(customerName, coffeeType, finalPrice);

        System.out.println("\n=== Order Processing Complete ===");
    }
}