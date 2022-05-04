import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Exercicio06 {

	public static void main(String[] args) {
		Random alea = new Random();
		Scanner leia = new Scanner(System.in);
		int a[] = new int[10], b[] = new int[10], i, x;
		
		
		for (i=0;i<10;i++)
		{
			a[i] = alea.nextInt(50)+1;
		}
		
		System.out.println("\n\nDigite um número -> ");
		x = leia.nextInt();
		
		for (i=0;i<10;i++)
		{
			b[i] = a[i]*x;
		}
		
		System.out.println("\nVetor a -> "+Arrays.toString(a));
		System.out.println("\nVetor b -> "+Arrays.toString(b));

	}

}
