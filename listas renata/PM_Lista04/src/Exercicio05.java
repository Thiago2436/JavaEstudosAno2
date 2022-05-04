import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Random alea = new Random();
		Scanner leia = new Scanner(System.in);
		int i, vet[] = new int[10], op;

		System.out.print("Valores gerados -> ");
		for (i = 0; i < 10; i++) {
			vet[i] = alea.nextInt(50) + 1;
			System.out.print(vet[i] + " ");
		}

		System.out.print("\n\nOrdem gerada ->  ");
		for (i = 0; i < 10; i++)
			System.out.print(vet[i] + " ");

		System.out.print("\n\nOrdem inversa ->  ");
		for (i = 9; i >= 0; i--)
			System.out.print(vet[i] + " ");

	}

}
