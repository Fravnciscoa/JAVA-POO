public class Alumno // creacion de clase
{
    private int id; // Atributo privado
    private String nombre; // Atributo privado
    private String apellido; // Atributo privado

    public Alumno() // Generación de constructor vacío
    {
    }

    public Alumno(int id, String nombre, String apellido) // Generación de constructor con todos los atributos
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters & Setters despues de constructores y antes de métodos.
    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre() // Metodo mostrarNombre
    {
        System.out.println("Hola, soy un alumno y q pasa");
    }

}
