package Sobreescritura;

public class Perro extends Animal {
    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro: Guau guau");
    }
}
