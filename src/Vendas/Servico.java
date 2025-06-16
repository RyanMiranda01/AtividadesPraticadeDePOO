package Vendas;

public class Servico implements  Vendavel{

    @Override
    public double calcularPrecoTotal(double valor, int quantidade) {
        if(valor > 100) {
            return valor * quantidade - (valor * quantidade * 0.15);
        }else {
            return valor * quantidade - (valor * quantidade * 0.05);
        }
    }
}
