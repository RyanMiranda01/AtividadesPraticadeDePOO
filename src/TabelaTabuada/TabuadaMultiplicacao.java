package TabelaTabuada;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
         for (int i = 0; i <= 10; i++) {
             double tabuada = i * numero;
             System.out.println(numero  + " x " + i + " = " + tabuada);
        }
    }
}
