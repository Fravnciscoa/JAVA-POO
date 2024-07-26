public class Consultor extends Persona { //"extends" para extraer atributos y métodos de clase Persona.
    String nombre_consulta;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String nombre_consulta, int num_consultor, int id, String dni, String nombre, String apellido,
                     String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono); // "super" para añadir constructores de otra clase añadidos al actual.
        this.nombre_consulta = nombre_consulta;
        this.num_consultor = num_consultor;

    }

    public String getNombre_consulta() {
        return this.nombre_consulta;
    }

    public void setNombre_consulta(String nombre_consulta) {
        this.nombre_consulta = nombre_consulta;
    }

    public int getNum_consultor() {
        return this.num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

}
