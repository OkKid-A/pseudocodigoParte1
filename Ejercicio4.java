import java.util.Scanner;
import java.lang.Integer;

public class Ejercicio4{

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("\nIngresa un número");
	int num1 = Integer.parseInt(scanner.nextLine());
	int cuadrado = num1*num1;
	int cubo = num1*num1*num1;
	System.out.println("\nEl cuadrado de "+num1+" es " + cuadrado + " y el cubo es "+cubo);
	}
}