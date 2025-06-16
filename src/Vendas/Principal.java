package Vendas;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto.calcularPrecoTotal(100, 5));

        Servico servico = new Servico();
        System.out.println(servico.calcularPrecoTotal(100, 5));


    }
}