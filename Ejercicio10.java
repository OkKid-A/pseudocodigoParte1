import java.util.Scanner;
import java.lang.Double;

public class Ejercicio10{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa la longitud de la base");
		double base = Double.parseDouble(scanner.nextLine());
		System.out.println("\nIngresa la longitud de la altura");
		double altura = Double.parseDouble(scanner.nextLine());
		double area = base*altura;
		double perimetro = (base*2)+(altura*2);
		System.out.println("\nEl área del rectangulo es " + area + " y el perimetro es "  + perimetro);
	}
}