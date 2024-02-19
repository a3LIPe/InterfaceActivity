package br.com.alura.CurrencyConverter.Calculations;

import br.com.alura.CurrencyConverter.Interfaces.GeometricCalculation;

public class RetangularRoomCalculator implements GeometricCalculation {

    @Override
    public void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("The area of the retangular room is A= " + area + "cm².");
        System.out.println("\n");
    }

    @Override
    public void calculatePerimeter(double length, double width) {
        double perimeter = (length + width) * 2;
        System.out.println("The perimeter of the retangular room is P= " + perimeter + "cm².");
        System.out.println("\n");
    }
}
