import java.util.Scanner;


public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=1, num, somaPar=0, somaImpar=0;
		while (i<=10)
		{
			System.out.print(i+"� N�mero -> ");
			num = leia.nextInt();
			if (num%2==0)
				somaPar+=num;
			else
				somaImpar+=num;
			i++;
		}
		System.out.println("\nSoma dos pares = "+somaPar);
		System.out.println("\nSoma dos �mpares = "+somaImpar);

	}
}
