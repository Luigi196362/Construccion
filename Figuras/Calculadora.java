import java.io.IOException;
import java.util.Scanner;
import Volumenes.*;
import Areas.*;

public class Calculadora {
    public static void main(String[] args) {
        clearConsole();
        Scanner scanner = new Scanner(System.in);
        int e = 0;

        while (e != 3) {
            System.out.println("1.-Area 2.-Volumen 3.- Salir");
            e = scanner.nextInt();
            clearConsole();
            switch (e) {

                // Area
                case 1:
                    e = 0;
                    System.out.println("1.-Circulo 2.-Cuadrado 3.- Triangulo");
                    e = scanner.nextInt();
                    clearConsole();
                    switch (e) {
                        // Circulo
                        case 1:
                            System.out.println("Radio:");
                            double r = scanner.nextInt();
                            Area objCirculo = new Circulo(r);
                            objCirculo.calcular_Area();
                            e = 0;

                            break;
                        // Cuadrado
                        case 2:
                            System.out.println("Lado:");
                            double l = scanner.nextInt();
                            Area objCuadrado = new Cuadrado(l);
                            objCuadrado.calcular_Area();
                            e = 0;
                            break;
                        // Triangulo
                        case 3:
                            System.out.println("Base:");
                            double b = scanner.nextInt();
                            System.out.println("Altura:");
                            double a = scanner.nextInt();
                            Area objTriangulo = new Triangulo(a, b);
                            objTriangulo.calcular_Area();
                            e = 0;
                            break;

                        default:
                            break;
                    }
                    break;

                // Volumen
                case 2:
                    e = 0;
                    System.out.println("1.-Cilindro 2.-Esfera");
                    e = scanner.nextInt();
                    clearConsole();
                    switch (e) {
                        // Cilindro
                        case 1:
                            System.out.println("Radio:");
                            double r = scanner.nextInt();
                            System.out.println("Altura:");
                            double h = scanner.nextInt();
                            Volumen objCilindro = new Cilindro(r, h);
                            objCilindro.calcular_Volumen();
                            e = 0;
                            break;

                        case 2:
                            System.out.println("Radio:");
                            double radio = scanner.nextInt();
                            Volumen objEsfera = new Esfera(radio);
                            objEsfera.calcular_Volumen();
                            e = 0;
                            break;

                        default:
                            break;
                    }

                    break;

                default:
                    break;
            }

        }
        scanner.close();

    }

    public static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
