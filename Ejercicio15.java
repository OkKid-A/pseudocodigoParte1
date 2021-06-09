import java.util.*;

public class Ejercicio15{

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("\nIngresa un número entero");
		int num1 = scanner.nextInt();
		if (num1 == 0) {
			System.out.println("\nEl número ingresado es nulo");
		} else if (num1 > 0){
			System.out.println("\nEl número ingresado es positivo");
		} else {
			System.out.println("\nEl número ingresado es negativo");
		}
	}
}