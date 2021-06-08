import java.util.Scanner;

public class Ejercicio1{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero entero");
		int num1 = scanner.nextInt();
		System.out.println("Ingresa otro numero entero");
		int num2 = scanner.nextInt();
		int resultado = num1 + num2;
		System.out.println("La suma de "+ num1+ " + "+num2 +" = "+ resultado);
	}
}