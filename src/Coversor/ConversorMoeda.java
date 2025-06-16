package Coversor;

public class ConversorMoeda implements  ConversaoFinanceira{
    private double real= 5.54;
    @Override
    public double converterDolarParaReal(double dolar) {
        double convertido = dolar * real;
        System.out.println("O valor " + dolar + " dolares convertido em real é: " + convertido);
        return convertido;
    }
}
