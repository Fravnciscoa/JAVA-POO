public class Main{

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(); // objeto sin atributos de Alumno
        Alumno alumno2 = new Alumno(); // objeto con todos los atributos de Alumno

        System.out.println("La id del alumno 2 es: " + alumno2.getId()); // Mostrar id
        System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre()); // Mostrar nombre
        System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido()); // Mostrar apellido

        alumno1.setId(01); // Asignar id
        alumno1.setNombre("abdeceta"); // Asignar nombre
        alumno1.setApellido("zywuoux"); // Asignar apellido

        System.out.println("---------------");
        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());

        alumno2.setId(35); // Reasignar id
        System.out.println("---------------");

        System.out.println("La id del alumno 2 es: " + alumno2.getId()); // Mostrar id
        System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre()); // Mostrar nombre
        System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());

    }
}