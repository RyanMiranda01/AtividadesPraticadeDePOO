package Veiculo;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro ferrari = new ModeloCarro();
        ferrari.setModelo("Puro Sangue");
        ferrari.setPrecoAno1(1500000);
        ferrari.setPrecoAno2(1700000);
        ferrari.setPrecoAno3(2500000);

        ferrari.fichaTecnica();
        ferrari.calcularMaiorEMenorPreco();
    }

}
