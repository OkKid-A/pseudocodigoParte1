import java.util.Scanner;

public class Ejercicio13{

	public static void main(String[] args) {
		double PI = 3.1416;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa el radio del cilindro");
		double radio = scanner.nextDouble();
		System.out.println("\nIngresa la altura del cilindro");
		double altura = scanner.nextDouble();
		if ((radio>0) && (altura>0)) {
			double volumen = PI*radio*radio*altura;
			System.out.println("El volumen del cilindro es " + volumen);
		} else {
			System.out.println("\nEl radio y la altura deben ser positivos");
		}
	}
}