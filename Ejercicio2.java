import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el nombre del pais");	
		String pais = scanner.nextLine();
		System.out.println("Ingresa el nombre de su capital");	
		String capital = scanner.nextLine();
		System.out.println(capital + " es la capital de " + pais);
	}
}