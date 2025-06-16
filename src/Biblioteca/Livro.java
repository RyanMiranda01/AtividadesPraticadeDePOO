package Biblioteca;

public class Livro extends Produtos implements Calculavel{

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.5;
    }
}

