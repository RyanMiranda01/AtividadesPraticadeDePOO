package Banco;

public class ContaBancaria {
    protected double saldo;


    public void depositar(double valorColocado){
        saldo += valorColocado;
    }



    public void sacar(double saque){

        if(saldo > saque){
             saldo -= saque;
            System.out.println("Saque Feito com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void consultarSaldo(){
        System.out.println("Valor do seu saldo é: " + saldo);
    }
}
