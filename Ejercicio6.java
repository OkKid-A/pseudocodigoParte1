import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;

public class Ejercicio6{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int aleatorio = random.nextInt(200);
		System.out.println("\nEl número aleatorio escogido es "+aleatorio);
		double resultado = 0.3*aleatorio+aleatorio;
		System.out.println("\n"+aleatorio+" aumentado en un 30% e igual a "+resultado);
	}
}