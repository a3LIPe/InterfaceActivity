package br.com.alura.CurrencyConverter.Calculations;

import br.com.alura.CurrencyConverter.Interfaces.Salable;

public class Product implements Salable {
    private String name;
    private double unitPrice;


    @Override
    public double calculateFinalPriceWithFeesBasedInQuantitySold(int quantity) {
        return unitPrice * quantity;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        unitPrice -= unitPrice * (discountPercentage / 100.0);
    }
}

