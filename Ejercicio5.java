import java.util.Scanner;
import java.lang.Integer;

public class Ejercicio5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresa un número");
        int num1 = Integer.valueOf(scanner.nextLine());
        int siguiente = num1+1;
        System.out.println("\nEl número después de " + num1 + " es " + siguiente);
    }
}