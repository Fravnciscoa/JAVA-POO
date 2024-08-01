package Sobreescritura;

public class Gato extends Animal{


    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato: Miau miau");
    }
}
