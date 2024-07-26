public class Clase2 {
    public static void main(String[] args) {

        Clase1 objeto1 = new Clase1();

        // objeto1.edad = -5 Se encapsulará los valores para que no cualquiera pueda
        // ingresar edad erroneas.
        objeto1.setEdad(10);
        System.out.println("La edad es:" + objeto1.getEdad());
    }
}
