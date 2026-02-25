import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De qué número quieres la tabla?: ");
        int num = sc.nextInt();

        System.out.println("Tabla del " + num + ":");
        
       
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}