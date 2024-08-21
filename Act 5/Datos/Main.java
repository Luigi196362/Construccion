import java.util.Scanner;

import Base.DataReporte;
import Reportes.FinancialReporter;

public class Main {
    public static void main(String[] args) {
        String Dataset ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("1.-Financial  2.-HRReporter  3.- SalesReporter");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
            Dataset ="Financiero" ;
            DataReporte ReporteFinanciero = new FinancialReporter(Dataset);
            ReporteFinanciero.Generate();
                break;

            case 2:
            Dataset = "Recursos Humanos";
            DataReporte ReporteRecursosHumanos = new FinancialReporter(Dataset);
            ReporteRecursosHumanos.Generate();
                break;

            case 3:
            Dataset = "Ventas";
            DataReporte ReporteVentas = new FinancialReporter(Dataset);
            ReporteVentas.Generate();
                break;

            default:
                break;
        }
    sc.close();
    }
}
