package Veiculo;

public class Carro {
    private String modelo;
    private int precoAno1;
    private int precoAno2;
    private int precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(int precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public int getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(int precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public int getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(int precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public void calcularMaiorEMenorPreco(){
        double menor = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        double maior = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        System.out.println("Esse é o maior preco: " + maior );
        System.out.println("Esse é o menor preco: " + menor );
    }

    public void fichaTecnica(){
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Valor ano 1: " + getPrecoAno1());
        System.out.println("Valor ano 2: " + getPrecoAno2());
        System.out.println("Valor ano 3: " + getPrecoAno3());
    }
}
