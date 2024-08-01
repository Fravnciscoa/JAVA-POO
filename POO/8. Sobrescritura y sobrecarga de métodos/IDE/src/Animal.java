public class Animal {
    private int idAnimal;
    private String descripcion;

    public Animal() {
    }

    public Animal(int idAnimal, String descripcion) {
        this.idAnimal = idAnimal;
        this.descripcion = descripcion;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal" +nombreAnimal + " hace un sonido");
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal" +nombreAnimal + " hace un sonido de tipo" +tipoSonido);
    }
}
