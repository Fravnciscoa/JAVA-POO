public class Alumno
{
    int id; // Atributo
    String nombre; // Atributo
    String apellido; // Atributo

    public Alumno() { // Generación de constructor vacío
    }

    public Alumno(String nombre, int id, String apellido) { // Generación de constructor con todos los atributos
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
    }

    // Getters & Setters despues de constructores y antes de métodos.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() // Metodo mostrarNombre
    {
        System.out.println("Hola, soy un alumno y q pasa");
    }

}
