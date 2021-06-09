import java.util.*;

public class Ejercicio17{

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("\nIngresa el valor del lado 1");
		double lado1 = scanner.nextDouble();
		System.out.println("\nIngresa el valor del lado 2");
		double lado2 = scanner.nextDouble();
		System.out.println("\nIngresa el valor del lado 3");
		double lado3 = scanner.nextDouble();
		if (lado1 == lado2) {
			if (lado2 == lado3) {
				System.out.println("El triángulo es equilátero");
			} else {
				System.out.println("El triángulo es isosceles");
			}
		} else {
			if (lado1 == lado3) {
				System.out.println("El triángulo es isosceles");
			} else {
				System.out.println("El triángulo es escaleno");
			}
		}
	}
}