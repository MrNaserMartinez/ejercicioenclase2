package umg.trabajoenclase;
import umg.trabajoenclase.PKGg1.clsg1;
import umg.trabajoenclase.PKGg2.clsg2;
import umg.trabajoenclase.PKGg3.clsg3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("bienvenido a trabajo en equipo ");
        Scanner scanner = new Scanner(System.in);
        clsg1 clsg1 = new clsg1();
        clsg2 clsg2 = new clsg2();
        clsg3 clsg3 = new clsg3();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular área de un círculo (Clsg1)");
            System.out.println("2. Calcular volumen de un cubo (Clsg2)");
            System.out.println("3. Calcular volumen de un cilindro (Clsg3)");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    clsg1.calcularAreaCirculo();
                    break;
                case 2:
                    clsg2.areadeuntriangulo();
                    break;
                case 3:
                    clsg3.calcularVolumenCilindro();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }


    }
}