import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(01, "Francisco", 22));
        listaArray.add(new Persona(02, "Michelle", 23));
        listaArray.add(new Persona(03, "Alexandre", 24));
        listaArray.add(new Persona(04, "Jose", 25));

        //Lista
        System.out.println("Array de personas:-----------");
        for (Persona persona : listaArray) {
            System.out.println("Nombre en lista :" + persona.getNombre());
        }

        LinkedList<Persona> listaLinkedList = new LinkedList<Persona>();
        listaLinkedList.add(new Persona(01, "Francisco", 22));
        listaLinkedList.add(new Persona(02, "Michelle", 23));
        listaLinkedList.add(new Persona(03, "Alexandre", 24));
        listaLinkedList.add(new Persona(04, "Jose", 25));

        //Lista enlazada
        System.out.println("Linked-----------------");
        for (Persona persona : listaLinkedList) {
            System.out.println("Nombre en lista :" + persona.getNombre());
        }

        //Remove en Arraylist
        listaArray.remove(1);

        //Lista despues de remover.
        System.out.println("Array de personas luego de eliminar:---------------");
        for (Persona persona : listaArray) {
            System.out.println("Nombre en lista :" + persona.getNombre());
        }

        //Remove en LinkedList
        String nombreBorrar = "Alexandre";
        for(Persona persona2: listaLinkedList){
            if (persona2.getNombre().equals(nombreBorrar)){
                listaLinkedList.remove(persona2);
                break;
            }
        }

        //Linked list despues de borrar.
        System.out.println("Linked list despues de borrar");
        for(Persona persona: listaLinkedList){
            System.out.println("nombre en lista :" + persona.getNombre());
        }

        //Tamaño lista
        System.out.println("------Qué tamaño tienen las listas?------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinkedList.size());

        //obtener primer objeto
        System.out.println("-------Primer y último objeto solo para Linked List");
        System.out.println("Primero de LinkedList: " + listaLinkedList.getFirst().toString());
        System.out.println("último de LinkedList: " +listaLinkedList.getLast().toString());

        //borrar toda la lista.
        System.out.println("--------Borrando listas....--------");
        listaArray.clear();
        listaLinkedList.clear();

        //Comprobar si está vacía.
        System.out.println("------Está vacía esta lista?");
        System.out.println("ArrayList: " +listaArray.isEmpty());
        System.out.println("LinkedList: " +listaLinkedList.isEmpty());
    }
}