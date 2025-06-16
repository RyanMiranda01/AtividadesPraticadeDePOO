package Temperatur;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(Double temperatura) {
        System.out.println("A temperatura em Fahrenheit é: " + ((temperatura * 9/5) + 32));
    }

    @Override
    public void fahrenheitParaCelsius(Double temperatura) {
        System.out.println("A temperatura em Celsius é: " + ((temperatura - 32) * 5/9));
    }
}
