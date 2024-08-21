package Content;

import Base.ContentManager;

public class VideoManager extends ContentManager{

    public VideoManager(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ArchiveContent() {
        // TODO Auto-generated method stub
        System.out.println("Archivar Video "+ this.nombre);
        super.ArchiveContent();
    }

    @Override
    public void CreateContent() {
        // TODO Auto-generated method stub
        System.out.println("Crear Video "+ this.nombre);
        super.CreateContent();
    }

    @Override
    public void EditContent() {
        // TODO Auto-generated method stub
        System.out.println("Editar Video "+ this.nombre);
        super.EditContent();
    }

    @Override
    public void PublishContent() {
        // TODO Auto-generated method stub
        System.out.println("Publicar Video "+ this.nombre);
        super.PublishContent();
    }
    
}
