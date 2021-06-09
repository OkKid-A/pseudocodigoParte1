import java.util.Scanner;
import java.lang.Double;

public class Ejercicio11{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa la longitud en centimetros");
		double cm = Double.parseDouble(scanner.nextLine());
		double yardas = cm*0.1090361;
		double metros = cm*0.01;
		double pies = cm*0.3248084;
		double inch = cm*0.393791;
		System.out.println("\n"+cm + " cm, equivalen a " + yardas + " yardas, " + metros + " metros, " + pies + " pies y " + inch + " pulgadas");
	}
}