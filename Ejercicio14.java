import java.util.Scanner;

public class Ejercicio14{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa un número");
		int num1 =  scanner.nextInt();
		System.out.println("\nIngresa otro número");		
		int num2 = scanner.nextInt();
		int residuo = num1%num2;
		if (residuo == 0){
			System.out.println("\nEs divisible");
		} else {
			System.out.println("\nNo es divisible");
		}
	}
}