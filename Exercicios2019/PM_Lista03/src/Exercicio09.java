import java.util.Scanner;


public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=1, b=1, c, N, i;
		System.out.print("Informe a quantidade de elementos da sequencia de Fibonacci -> ");
		N = leia.nextInt();
		System.out.print("1 1 ");
		for (i=3;i<=N;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		

	}

}
