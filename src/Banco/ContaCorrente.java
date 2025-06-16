package Banco;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 29.90;

    public void cobrarTarifaMensal() {
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.printf("Tarifa mensal de R$ %.2f cobrada com sucesso.%n", tarifaMensal);
        } else {
            System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
        }
    }
}
