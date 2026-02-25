import java.util.Scanner;

public class Ejercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número A: ");
        int a = sc.nextInt();
        System.out.print("Número B: ");
        int b = sc.nextInt();

        int mayor = (a > b) ? a : b;
        int menor = (a < b) ? a : b;

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}