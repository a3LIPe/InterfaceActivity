package br.com.alura.CurrencyConverter.Interfaces;

public interface Salable {
    //double calculateFinalPriceWithFeesBasedInQuantitySold(int quantity);
    double calculateFinalPriceWithFeesBasedInQuantitySold(int quantity);
    void applyDiscount(double discountPercentage);
}
