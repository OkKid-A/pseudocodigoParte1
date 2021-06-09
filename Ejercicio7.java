import java.util.Random;

public class Ejercicio7{

	public static void main(String[] args) {
		Random random = new Random();
		int aleatorio = (random.nextInt(40)+10);
		System.out.println("\nEl número escogido es "+aleatorio);
		double reducido = aleatorio*0.85;
		System.out.println("\n" + aleatorio + " reducido en 15% es igual a "+reducido);
	}
}