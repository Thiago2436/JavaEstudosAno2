import java.util.Arrays;
import java.util.Random;


public class Exercicio07 {

	public static void main(String[] args) {
		int A[] = new int[10];
		int i, j=0, aux;
		Random g = new Random();
		
		System.out.println("Números gerados aleatoriamente\n");
		for (i=0; i<10; i++)
		{
			A[i] = g.nextInt(50)+1;
			System.out.print(A[i]+" ");
		}
		
		//BubbleSort
		for (i=0;i<10;i++)
		{
			for (j=i+1;j<10;j++)
			{
				if (A[j]<A[i])
				{
					aux=A[i];
					A[i]=A[j];
					A[j]=aux;
				}
			}
		}
		
		System.out.println("\n\nNúmeros ordenados\n");
		for (i=0; i<10; i++)
		{
			System.out.print(A[i]+" ");
		}
	}

}
