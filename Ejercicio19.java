import java.util.Random;

public class Ejercicio19{

	public static void main(String[] args) {
		Random random = new Random();
		int aleatorio = random.nextInt(1001);
		System.out.println("\nEl número escogido es " + aleatorio);
		if ((aleatorio % 5 == 0) && (aleatorio < 126) && (aleatorio > 0)) {
			System.out.println("\nCorrecto");
		} else {
			System.out.println("\nIncorrecto");
		}
	}
}