package Biblioteca;

public class ProdutoFisico extends Produtos implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.0;
    }
}
