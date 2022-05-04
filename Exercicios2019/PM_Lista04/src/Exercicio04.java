import java.util.Random;
import java.util.Scanner;


public class Exercicio04 {
	public static void main(String[] args) {
		Random alea = new Random();
		Scanner leia = new Scanner(System.in);
		int i, num, vet[] = new int[20];
		
		System.out.print("Valores gerados -> ");
		for (i=0;i<20;i++)
		{
			vet[i] = alea.nextInt(50)+1;
			System.out.print(vet[i]+" ");
		}
		
		System.out.print("\n\n\nInforme um número -> ");
		num = leia.nextInt();
		
		System.out.print("\n\nMúltiplos de "+num+" -> ");
		for (i=0;i<20;i++)
		{
			if (vet[i]%num==0)
				System.out.print(vet[i]+" ");
		}
	}

}
