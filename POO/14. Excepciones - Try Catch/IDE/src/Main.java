public class Main {
    public static void main(String[] args) {


        try {
            int resultado = 3 / 0;
        }
        catch(Exception e){
            System.out.println("No se puede dividir entre 0!");
        }

        int edades[] = {15,12,30,11};
        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        }
        catch(Exception e){
            System.out.println("Intentaste acceder a un índice que no existe");
        }

    }
}