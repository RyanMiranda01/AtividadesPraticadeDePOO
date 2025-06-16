package CalculoRetangulo;

public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();
        double perimetro = calculo.calcularPerimetro(5, 4);
        double area = calculo.calcularArea(5, 4);

        System.out.println("O valor da Area é: " + area);
        System.out.println("O valor do perímetro é: " + perimetro);


    }
}
