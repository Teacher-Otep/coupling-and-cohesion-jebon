package com.coffeeshop.naive;

import java.io.FileWriter;
import java.io.IOException;

public class storage implements StorageService {

    @Override
    public void saveOrder(String customerName,
                          String coffeeType,
                          double finalPrice) {

        System.out.println("[System] Saving transaction logs...");

        try (FileWriter writer = new FileWriter("orders_log.txt", true)) {

            writer.write(
                    "Customer: " + customerName +
                    " | Item: " + coffeeType +
                    " | Total: " + finalPrice + "\n");

            System.out.println("[Database] Log successfully saved.");

        } catch (IOException e) {

            System.out.println("Error saving order: " + e.getMessage());

        }
    }
}
