public class Main {

    public static void main(String[] args) {

        Persona vector [] = new Persona [5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        //vector[4] "Hola"; No se pueden guardar variables de distinto tipo, todas las demás clases son tipo Persona dado el extend
        Persona person1 = new Persona();
        Consultor consul1 = new Consultor();

        person1 = consul1; // Un padre puede ser su hijo
        consul1 = person1; // Un hijo no puede ser su padre.

    }
}
