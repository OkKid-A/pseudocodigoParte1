import java.util.Scanner;
import java.lang.Integer;

public class Ejercicio8{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa un número entero");
		int num1 = Integer.valueOf(scanner.nextLine());
		System.out.println("\nIngresa otro número entero");
		int num2 = Integer.valueOf(scanner.nextLine());
		System.out.println("\nIngresa otro número entero");
		int num3 = Integer.valueOf(scanner.nextLine());
		double promedio = (num1+num2+num3)/3;
		System.out.println("\nEl promedio entre "+num1+", "+num2+" y "+num3+" es "+promedio);
	}
}