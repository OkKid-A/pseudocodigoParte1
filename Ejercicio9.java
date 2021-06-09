import java.util.Scanner;

public class Ejercicio9{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngrese una palabra");
		String palabra1 = scanner.nextLine();
		System.out.println("\nIngrese una palabra diferente");
		String palabra2 = scanner.nextLine();
		String palabra3 = palabra1;
		palabra1 = palabra2;
		palabra2 = palabra3;
		System.out.println("\nLa primer palabra ahora es " + palabra1 +" y la segunda es " + palabra2);
	}
}