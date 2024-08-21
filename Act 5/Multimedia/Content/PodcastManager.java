package Content;

import Base.ContentManager;

public class PodcastManager extends ContentManager{
    
    public PodcastManager(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ArchiveContent() {
        // TODO Auto-generated method stub
        System.out.println("Archivar Podcast "+ this.nombre);
        super.ArchiveContent();
    }

    @Override
    public void CreateContent() {
        // TODO Auto-generated method stub
        System.out.println("Crear Podcast "+ this.nombre);
        super.CreateContent();
    }

    @Override
    public void EditContent() {
        // TODO Auto-generated method stub
        System.out.println("Editar Podcast "+ this.nombre);
        super.EditContent();
    }

    @Override
    public void PublishContent() {
        // TODO Auto-generated method stub
        System.out.println("Publicar Podcast "+ this.nombre);
        super.PublishContent();
    }
    
}
