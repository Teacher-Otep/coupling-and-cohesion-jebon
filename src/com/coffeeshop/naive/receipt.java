package com.coffeeshop.naive;

public class receipt implements ReceiptService {

    @Override
    public void printReceipt(String customerName,
                             String coffeeType,
                             double price,
                             double finalPrice) {

        double tax = finalPrice - price;

        System.out.println("\n===== COFFEE SHOP RECEIPT =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Beverage: " + coffeeType);
        System.out.println("Price: PHP " + price);
        System.out.println("VAT (12%): PHP " + tax);
        System.out.println("Total Amount: PHP " + finalPrice);
        System.out.println("================================");
    }
}