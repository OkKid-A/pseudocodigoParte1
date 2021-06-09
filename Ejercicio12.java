import java.util.Scanner;
import java.lang.Double;

public class Ejercicio12{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa el valor la temperatura a convertir en celsius");
		double tempC = Double.parseDouble(scanner.nextLine());
		double tempF = ((tempC*(0.18))+32);
		System.out.println("\nLa temperatura en Farenheit es " + tempF + " °F");
	}
}