import br.com.alura.CurrencyConverter.Calculations.CurrencyConverter;
import br.com.alura.CurrencyConverter.Calculations.MultiplicationTable;
import br.com.alura.CurrencyConverter.Calculations.RetangularRoomCalculator;
import br.com.alura.CurrencyConverter.Calculations.StandardTemperatureConverter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter convert = new CurrencyConverter();
        convert.convertDollarToReal(30);


        RetangularRoomCalculator calculate = new RetangularRoomCalculator();
        calculate.calculateArea(12.50,7.50);
        calculate.calculatePerimeter(12.50, 7.50);


        MultiplicationTable multiplication = new MultiplicationTable();
        multiplication.showDisplayTable(2);
        multiplication.showDisplayTable(4);

        StandardTemperatureConverter convert1 = new StandardTemperatureConverter();
        convert1.CelsiusToFahrenheit(15);
        convert1.FahrenheiToCelsius(150);


      }
    }
