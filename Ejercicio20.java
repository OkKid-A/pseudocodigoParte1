import java.util.*;
import java.lang.Integer;

public class Ejercicio20{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngrese un número de cinco dígitos");
		int num1 = scanner.nextInt();
		if(num1 >= -99999 && num1 <= -10000){
			num1 = num1*(-1);
		}
		if (num1 <= 99999 && num1 >= 10000) {
			String convertida = num1+"";
			int d1 = Integer.valueOf(convertida.substring(0,1));
			int d2 = Integer.valueOf(convertida.substring(1,2));
			int d3 = Integer.valueOf(convertida.substring(2,3));
			int d4 = Integer.valueOf(convertida.substring(3,4));
			int d5 = Integer.valueOf(convertida.substring(4,5));
			if (d1 == d5 && d2 == d4) {
				System.out.println("\nEl número es capícua");
			} else {
				System.out.println("\nNo es capícua");
			}
		}	
		else {
			System.out.println("\nDebe ser un número de cinco digitos");
		}
	}
}