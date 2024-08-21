import java.util.Scanner;

import Base.ContentManager;
import Content.ArticuloManager;
import Content.PodcastManager;
import Content.VideoManager;

public class Main {
    public static void main(String[] args) {
        ContentManager contentManager;
        int opcion = 0;
        String nombre = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.-Articulo, 2.-Podcast, 3.-Video");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Nombre del Articulo");
                nombre = scanner.next();

                contentManager = new ArticuloManager(nombre);

                contentManager.ArchiveContent();
                contentManager.CreateContent();
                contentManager.EditContent();
                contentManager.PublishContent();
                break;

            case 2:
                System.out.println("Nombre del Podcast");
                nombre = scanner.next();
                contentManager = new PodcastManager(nombre);

                contentManager.ArchiveContent();
                contentManager.CreateContent();
                contentManager.EditContent();
                contentManager.PublishContent();
                break;

            case 3:
                System.out.println("Nombre del Video");
                nombre = scanner.next();
                contentManager = new VideoManager(nombre);

                contentManager.ArchiveContent();
                contentManager.CreateContent();
                contentManager.EditContent();
                contentManager.PublishContent();
                break;

            default:
                break;
        }
        scanner.close();
    }

}
