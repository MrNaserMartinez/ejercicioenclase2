package umg.trabajoenclase.PKGg2;
import java.util.Scanner;


public class clsg2 {

    public void areadeuntriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = 0.5 * base * altura;
        System.out.println("El área del triángulo es: " + area);
    }
}
