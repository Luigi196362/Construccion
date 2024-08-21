import java.util.Scanner;

import Base.StreamingService;
import Servicios.MovieService;
import Servicios.MusicService;
import Servicios.TvSeriesService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StreamingService streamingService;
        System.out.println("1.-Pelicula 2.-Musica 3.-Serie");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
            streamingService = new MovieService(1,"Prueba");
            
                break;

            case 2:
            streamingService = new MusicService(2,"Prueba");
                break;

            case 3:
            streamingService = new TvSeriesService(3,"Prueba");
                break;

            default:
            streamingService = new TvSeriesService(0,"default");
                break;
        }
        streamingService.Recommend();
        streamingService.Search();
        streamingService.play();
        

        sc.close();
    }
}
