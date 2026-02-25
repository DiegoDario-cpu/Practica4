import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double n2 = sc.nextDouble();

        double suma = n1 + n2;
        System.out.println("La suma es: " + suma);
    }
}