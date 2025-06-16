package Bichos;

public class Gato extends Animal{

    public void arranharMoveis(){
        System.out.println("Arranhando moveis");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
