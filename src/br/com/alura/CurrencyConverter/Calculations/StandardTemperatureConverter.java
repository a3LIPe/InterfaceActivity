package br.com.alura.CurrencyConverter.Calculations;
import br.com.alura.CurrencyConverter.Interfaces.TemperatureConverter;

public class StandardTemperatureConverter implements TemperatureConverter {


    @Override
    public double CelsiusToFahrenheit(double celsiusDegree) {
        return (celsiusDegree * 9/5) + 32;
    }

    @Override
    public double FahrenheiToCelsius(double farenheitDegree) {
        return (farenheitDegree - 32) * 5/9;
    }
}
