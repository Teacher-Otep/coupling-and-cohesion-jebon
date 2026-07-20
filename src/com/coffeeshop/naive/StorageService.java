package com.coffeeshop.naive;

public interface StorageService {

    void saveOrder(String customerName,
                   String coffeeType,
                   double finalPrice);

}
