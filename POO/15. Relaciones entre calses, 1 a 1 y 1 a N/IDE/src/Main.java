import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Auto1aN aut = new Auto1aN();
        aut.setId(1L);
        aut.setMarca("Toyota");
        aut.setModelo("bacan");

        List<Propietario> propietarios = new ArrayList<Propietario>();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();
        prop1.setId(35L);
        prop1.setNombre("Pancho");
        prop1.setApellido("das");

        prop2.setId(13L);
        prop2.setNombre("Bob");
        prop2.setApellido("asd");

        prop3.setId(10L);
        prop3.setNombre("Jose");
        prop3.setApellido("asd");

        propietarios.add(prop1);
        propietarios.add(prop2);
        propietarios.add(prop3);

        aut.setListaPropietarios(propietarios);

        System.out.println("El auto " +aut.getMarca() + " " + aut.getModelo() +  " tiene como propietario a " + aut.getListaPropietarios().toString());
    }
}