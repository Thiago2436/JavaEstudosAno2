import java.util.Scanner;


public class Exercicio15 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, i, j;
		System.out.print("Informe um número para imprimir a sequencia -> ");
		num = leia.nextInt();
		for (i=1;i<=num;i++)
		{
			for (j=i;j<=i*i;j+=i)
				System.out.printf("%2d ",j);
			System.out.println();
		}

	}
}
