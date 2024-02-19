package br.com.alura.CurrencyConverter.Calculations;

import br.com.alura.CurrencyConverter.Interfaces.FinancialConversion;

public class CurrencyConverter implements FinancialConversion {
    @Override
    public void convertDollarToReal(double dollarValue) {
        double dollarExchangeRate = 4.92;
        double realValue = dollarValue * dollarExchangeRate;
        System.out.println("The price of the Dollar for Real is R$" + realValue);
        System.out.println("\n");
    }
}


