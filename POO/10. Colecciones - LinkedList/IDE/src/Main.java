import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona(01, "Francisco", 22));
        lista.add(new Persona(02, "Michelle", 23));
        lista.add(new Persona(03, "Daniel", 24));
        lista.add(new Persona(04, "Juan", 25));

        //Añadir al principio de la lista.
        lista.addFirst(new Persona(05, "Carlos", 26));
        lista.add(0, new Persona(06, "Juan", 27));
        |
        System.out.println("------FOREACH------");
        for (Persona persona:lista){
            System.out.println("Nombre :" +persona.getNombre());
        }

    }
}