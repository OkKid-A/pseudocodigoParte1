import java.util.*;
import java.lang.Integer;

public class Ejercicio18{

	public static void main(String[] args) {
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("\nIngresa un número de uno a cuatro dígitos");
		int num1 = Integer.valueOf(scanner.nextInt());
		if (num1 >= -9999 && num1 <= 0) {
			num1 = num1*(-1);
		}
		if (num1 <= 9999 && num1 >= 0) {
			String convertida = (num1+"");
			if (num1 >= 1000) {
				d4 = Integer.valueOf(convertida.substring(3,4));
				System.out.println("\n"+d4+"");
			}
			if (num1 >= 100) {
				d3 = Integer.valueOf(convertida.substring(2,3));
				System.out.println("\n"+d3+"");
			}
			if (num1 >= 10) {
				d2 = Integer.valueOf(convertida.substring(1,2));
				System.out.println("\n"+d2+"");
			}
			d1 = Integer.valueOf(convertida.substring(0,1));
			System.out.println("\n"+d1+"");
			int suma = d1+d2+d3+d4;
			System.out.println("\nLa suma de los dígitos del número es igual a "+suma);
		} else {
			System.out.println("No es un número de cuatro dígitos");
		}
	}
}