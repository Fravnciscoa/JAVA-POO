public class Main {

    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(01, "hola", "xd");

        System.out.println("id:" + alu2.getId()); //get está privado
        System.out.println("nombre:" + alu2.getNombre());
        System.out.println("apellido:" + alu2.getApellido());
    }
}
