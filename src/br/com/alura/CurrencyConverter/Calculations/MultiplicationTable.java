package br.com.alura.CurrencyConverter.Calculations;

import br.com.alura.CurrencyConverter.Interfaces.Table;

public class MultiplicationTable implements Table {

    @Override
    public void showDisplayTable(int number) {
        for (int i = 1; i <=10 ; i++) {
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result );
            }
        }
    }

