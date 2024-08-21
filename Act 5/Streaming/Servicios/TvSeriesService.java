package Servicios;

import Base.StreamingService;

public class TvSeriesService extends StreamingService{

    public TvSeriesService(int id, String query) {
        super(id, query);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Recommend() {
        System.out.println("Serie recomendada: ...");
        // TODO Auto-generated method stub
        super.Recommend();
    }

    @Override
    public void Search() {
        System.out.println("Buscando serie: "+query+"...");
        // TODO Auto-generated method stub
        super.Search();
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo serie "+id+"...");
        // TODO Auto-generated method stub
        super.play();
    }

    
    
}
