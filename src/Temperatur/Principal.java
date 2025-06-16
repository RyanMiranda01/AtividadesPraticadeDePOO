package Temperatur;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao tempo = new ConversorTemperaturaPadrao();
        Scanner eskani = new Scanner(System.in);
        System.out.println("Fale a temperatura para converter em Fahrenheit:");
        double valor1 = eskani.nextDouble();
        System.out.println("Fale a temperatura para converter em Celsius:");
        double valor2 = eskani.nextDouble();

        tempo.celsiusParaFahrenheit(valor1);

        tempo.fahrenheitParaCelsius(valor2);


    }
}
