package Vendas;

public class Produto implements Vendavel{

    @Override
    public double calcularPrecoTotal(double valor, int quantidade) {
        if(valor > 100){
            return  valor * quantidade - (valor * quantidade * 0.20) ;
        }else {
            return valor * quantidade - (valor * quantidade * 0.10);
        }
    }
}
