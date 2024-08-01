import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(01, "Francisco", 22));
        lista.add(new Persona(02, "Michelle", 23));
        lista.add(new Persona(03, "Alexandre", 24));
        lista.add(new Persona(04, "Juan", 25));

        //Recorrer por índice.
        System.out.println("--------FOR---------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba : " + lista.get(i).getNombre());
        }

        //Recorrer elemento por elemento.
        System.out.println("--------FOREACH---------");
        for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }

    }
}