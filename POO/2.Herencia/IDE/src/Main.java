public class Main {

    public static void main(String[] args) {

        Empleado emple = new Empleado(); //clase Empleado

        emple.getId_legado(); //atributo propio
        emple.getNombre(); //atributo de Persona

        Consultor consul = new Consultor(); //clase Consultor

        consul.getNum_consultor(); //atributo propio
        consul.getNombre(); //atributo de Persona
    }
}
