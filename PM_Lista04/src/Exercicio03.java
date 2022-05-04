import java.util.Random;


public class Exercicio03 {

	public static void main(String[] args) {
		Random alea = new Random();
		int i, vet[] = new int[20];
		
		System.out.print("Valores gerados -> ");
		for (i=0;i<20;i++)
		{
			vet[i] = alea.nextInt(50)+1;
			System.out.print(vet[i]+" ");
		}
		
		System.out.print("\n\nMúltiplos de 5 -> ");
		for (i=0;i<20;i++)
		{
			if (vet[i]%5==0)
				System.out.print(vet[i]+" ");
		}

	}

}
