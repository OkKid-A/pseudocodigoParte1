import java.util.Scanner;
import java.lang.Double;

public class Ejercicio3{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "\nIngresa un número");
		double num1 = Double.parseDouble(scanner.nextLine());
		double doble = num1*2;
		System.out.println("\nEl doble de "+ num1 + " es igual a " + doble+ "\n");
		double triple = num1*3;
		System.out.println("\nEl triple de "+ num1 + " es igual a " + triple + "\n");
	}
}