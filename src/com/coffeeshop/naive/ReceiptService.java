package com.coffeeshop.naive;

public interface ReceiptService {

    void printReceipt(String customerName,
                      String coffeeType,
                      double price,
                      double finalPrice);

}