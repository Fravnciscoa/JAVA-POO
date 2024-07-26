public class Empleado extends Persona { //"extends" para extraer atributos y métodos de clase Persona.
    int id_legado;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int id_legado, String cargo, Double sueldo, int id, String dni, String nombre, String apellido,
                    String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono); // "super" para añadir constructores de otra clase añadidos al actual.
        this.id_legado = id_legado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getId_legado() {
        return this.id_legado;
    }

    public void setId_legado(int id_legado) {
        this.id_legado = id_legado;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

}
