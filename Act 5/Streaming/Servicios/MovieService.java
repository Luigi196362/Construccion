package Servicios;

import Base.StreamingService;

public class MovieService extends StreamingService {

    public MovieService(int id, String query) {
        super(id, query);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Recommend() {
        System.out.println("Peliculas recomendadas: ...");
        // TODO Auto-generated method stub
        super.Recommend();
    }

    @Override
    public void Search() {
        System.out.println("Buscando pelicula: "+query+"...");
        // TODO Auto-generated method stub
        super.Search();
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo pelicula "+id+"...");
        // TODO Auto-generated method stub
        super.play();
    }

    
    
}
