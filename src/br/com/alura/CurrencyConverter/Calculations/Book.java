package br.com.alura.CurrencyConverter.Calculations;

import br.com.alura.CurrencyConverter.Interfaces.Calculable;

public class Book extends Product implements Calculable {
    private String author;

    @Override
    public double calculateFinalPrice() {
        double price = 30.99;
        return price * 0.015;
    }
}
