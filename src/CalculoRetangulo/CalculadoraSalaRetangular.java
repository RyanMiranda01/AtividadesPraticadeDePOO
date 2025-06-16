package CalculoRetangulo;

public class CalculadoraSalaRetangular implements  CalculoGeometrico{

    @Override
    public double calcularArea(double valor1, double valor2) {
        return valor1 * valor2;

    }

    @Override
    public double calcularPerimetro(double valor1, double valor2) {
        return (valor1 + valor2) * 2;
    }
}
