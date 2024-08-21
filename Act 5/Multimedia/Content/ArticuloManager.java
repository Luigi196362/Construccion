package Content;

import Base.ContentManager;

public class ArticuloManager extends ContentManager {

    public ArticuloManager(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ArchiveContent() {
        // TODO Auto-generated method stub
        System.out.println("Archivar Articulo "+ this.nombre);
        super.ArchiveContent();
    }

    @Override
    public void CreateContent() {
        System.out.println("Crear Articulo "+ this.nombre);
        // TODO Auto-generated method stub
        super.CreateContent();
    }

    @Override
    public void EditContent() {
        System.out.println("Edit Articulo "+ this.nombre);
        // TODO Auto-generated method stub
        super.EditContent();
    }

    @Override
    public void PublishContent() {
        System.out.println("Publish Articulo "+ this.nombre);
        // TODO Auto-generated method stub
        super.PublishContent();
    }
    
}
