package Bichos;

public class Cachorro extends Animal{

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
