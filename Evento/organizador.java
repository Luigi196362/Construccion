import java.util.Scanner;

import Eventos.Boda.Boda;
import Eventos.Concierto.Concierto;
import Eventos.Conferencia.Conferencia;

public class organizador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("1-Boda, 2.-Concierto, 3.-Conferencia");
        opcion=scanner.nextInt();

        switch (opcion) {
            case 1:
                Boda boda = new Boda("Boda", 1);
                boda.organizar_boda();
                break;

            case 2:
                Concierto concierto = new Concierto("Concierto", 2);
                concierto.organizar_concierto();
                break;

            case 3:
                Conferencia conferencia = new Conferencia("Conferencia", 3);
                conferencia.organizar_conferencia();
                break;

            default:
                break;
        }
        scanner.close();
    }
}
