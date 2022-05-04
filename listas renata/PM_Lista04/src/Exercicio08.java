import java.util.Random;


public class Exercicio08 {

	public static void main(String[] args) {
		int V[] = new int[20], par[] = new int[20], impar[] = new int[20];
		int i, j=0, k=0;
		Random gera = new Random();
		
		System.out.println("Elementos gerados");
		for (i=0;i<20;i++)
		{
			V[i] = gera.nextInt(50)+1;
			System.out.print(V[i]+" ");
			if (V[i] % 2 == 0)
				par[j++] = V[i];
			else
				impar[k++] = V[i];
		}
		
		System.out.println("\nValores pares");
		for (i=0;i<j;i++)
			System.out.print(par[i]+" ");
		
		System.out.println("\nValores ímpares");
		for (i=0;i<k;i++)
			System.out.print(impar[i]+" ");
	}

}
