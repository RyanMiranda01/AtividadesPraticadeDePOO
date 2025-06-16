package Banco;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria operacao = new ContaBancaria ();
        operacao.depositar(1000);
        operacao.sacar(500);
        operacao.consultarSaldo();

        ContaCorrente operacao2 = new ContaCorrente();
        operacao2.depositar(1000);
        operacao2.cobrarTarifaMensal();
        operacao2.consultarSaldo();
        operacao2.sacar(500);
        operacao2.consultarSaldo();

    }

}
