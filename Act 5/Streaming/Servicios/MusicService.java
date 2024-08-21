package Servicios;

import Base.StreamingService;

public class MusicService extends StreamingService {

    public MusicService(int id, String query) {
        super(id, query);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Recommend() {
        System.out.println("Musica recomendada: ...");
        // TODO Auto-generated method stub
        super.Recommend();
    }

    @Override
    public void Search() {
        System.out.println("Buscando musica: "+query+"...");
        // TODO Auto-generated method stub
        super.Search();
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo musica "+id+"...");
        // TODO Auto-generated method stub
        super.play();
    }

}
