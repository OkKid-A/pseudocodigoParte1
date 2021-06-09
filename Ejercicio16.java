import java.util.*;

public class Ejercicio16{

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("\nIngresa un número");
		double num1 = scanner.nextDouble();
		System.out.println("\nIngresa un segundo número");
		double num2 = scanner.nextDouble();
		System.out.println("\nIngresa un tercer número");
		double num3 = scanner.nextDouble();
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("El número mayor es " + num1);
			} else {
				System.out.println("El número mayor es " + num3);
			}
		} else{
			if(num2 > num3){
				System.out.println("El número mayor es " + num2);
			} else{
				System.out.println("El número mayor es " + num3);
			}
		}
	}
}