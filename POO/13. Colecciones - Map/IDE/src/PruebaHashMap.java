import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
    public static void main(String[] args) {

        Map<Integer, String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1523, "Yo el pik");
        mapaEmpleados.put(1524, "Yo el pix");
        mapaEmpleados.put(1525, "Cock");

        boolean estaono = mapaEmpleados.containsValue("Juan Pablo");
        if (estaono == true) {
            System.out.println("El empleado se ha encontrado");
        } else {
            System.out.println("El empleado no se ha encontrado");
        }

        estaono = mapaEmpleados.containsValue("Cock");

        if (estaono == true) {
            System.out.println("El empleado se ha encontrado");
        } else {
            System.out.println("El empleado no se ha encontrado");
        }

        boolean estaLlave = mapaEmpleados.containsKey(1523);
        if (estaLlave == true) {
            System.out.println("El valor buscado se ha encontrado");
        } else {
            System.out.println("El valor buscado no se ha encontrado");
        }

        System.out.println(mapaEmpleados.keySet());
        System.out.println(mapaEmpleados.values());

        String nombre = mapaEmpleados.get(1525);
        System.out.println("El nombre del empleado es: " + nombre);

        nombre = mapaEmpleados.get(1334);
        System.out.println("El nombre del empleado es: " + nombre);

        mapaEmpleados.remove(1523);
    }
}