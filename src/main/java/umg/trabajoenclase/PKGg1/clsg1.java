package umg.trabajoenclase.PKGg1;
import java.util.Scanner;

public class clsg1 {

    public void calcularAreaCirculo()  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);
    }

}
