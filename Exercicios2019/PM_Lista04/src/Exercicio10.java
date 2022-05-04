import java.util.Random;
import java.util.Scanner;


public class Exercicio10 {

	public static void main(String[] args) {
		int V[] = new int[10];
		int i, num;
		Random gera = new Random();
		Scanner leia = new Scanner(System.in);
		boolean existe=false;
		System.out.println("Elementos gerados");
		for (i=0;i<10;i++)
		{
			V[i] = gera.nextInt(50)+1;
			System.out.print(V[i]+" ");
		}
		System.out.print("\n\nInforme o número que deseja encontrar -> ");
		num = leia.nextInt();
		for (i=0;i<10;i++)
		{
			if (V[i]==num)
			{
				System.out.println("\nNúmero encontrado na posição: "+i);
				existe=true;
				break;
			}
		}
		if (!existe)
			System.out.println("\nNúmero não encontrado");
	}
}
