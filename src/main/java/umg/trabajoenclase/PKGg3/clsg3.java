package umg.trabajoenclase.PKGg3;
import java.util.Scanner;

public class clsg3 {

    public void calcularVolumenCilindro()  {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        double volumen = Math.PI * Math.pow(radio, 2) * altura;


        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
