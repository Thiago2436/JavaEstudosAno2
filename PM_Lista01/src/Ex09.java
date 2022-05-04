import java.util.Scanner;


public class Ex09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float C, F;
		System.out.print("Informe a tempetura em Fahrenheit -> ");
		F = leia.nextFloat();
		C = ((F - 32)/9)*5;
		System.out.println("\n"+F+"°F = "+C+"°C");

	}

}
