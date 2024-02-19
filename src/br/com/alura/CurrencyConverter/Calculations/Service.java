package br.com.alura.CurrencyConverter.Calculations;

import br.com.alura.CurrencyConverter.Interfaces.Salable;

public class Service implements Salable {
    private String Description;
    private double pricePerHour;
    @Override
    public double calculateFinalPriceWithFeesBasedInQuantitySold(int quantity) {
        return pricePerHour * quantity;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        pricePerHour -= pricePerHour * (discountPercentage / 100);
    }
}
