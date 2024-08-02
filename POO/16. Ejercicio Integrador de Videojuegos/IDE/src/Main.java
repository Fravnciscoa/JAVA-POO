import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<VideoJuego> videoJuegos = new ArrayList<VideoJuego>();

        VideoJuego videoJuego1 = new VideoJuego(01, "God hand", "PlayStation 3",1, "pelea" );
        VideoJuego videoJuego2 = new VideoJuego(02, "Mortal Kombat Shaolin Monks", "PlayStation 2",2, "pelea" );
        VideoJuego videoJuego3 = new VideoJuego(03, "Naruto", "PlayStation 2",3, "pelea" );
        VideoJuego videoJuego4 = new VideoJuego(04, "Shadow of the Colossus", "PlayStation 2", 1, "aventura");
        VideoJuego videoJuego5 = new VideoJuego(05, "Urban Reign", "PlayStation 2", 2, "pelea");

        videoJuegos.add(videoJuego1);
        videoJuegos.add(videoJuego2);
        videoJuegos.add(videoJuego3);
        videoJuegos.add(videoJuego4);
        videoJuegos.add(videoJuego5);

        for(VideoJuego i:videoJuegos){
            System.out.println("Juego: " + i.getTitulo() + " - Consola: " +  i.getConsola() + " - Cantidad de Jugadores: " + i.getCantidadJugadores());
        }

        System.out.println("---------Juego 1 con titulo y cantidad de jugadores modificado-----------");

        videoJuego1.setTitulo("God Hand 2 bkn");
        videoJuego1.setCantidadJugadores(2);
        System.out.println(videoJuego1.getTitulo());
        System.out.println(videoJuego1.getCantidadJugadores());

        System.out.println("--------------------");

        System.out.println("---------Juego 4 con titulo y cantidad de jugadores modificado-----------");
        videoJuego4.setTitulo("Shadow of the Colossus 2 bkn");
        videoJuego4.setCantidadJugadores(2);
        System.out.println(videoJuego4.getTitulo());
        System.out.println(videoJuego4.getCantidadJugadores());

        System.out.println("-----Listado juegos PS3------");
        for(VideoJuego i:videoJuegos){
            if(i.getConsola().equals("PlayStation 3")){
                System.out.println("-"+i.getTitulo());
            }
        }


    }
}