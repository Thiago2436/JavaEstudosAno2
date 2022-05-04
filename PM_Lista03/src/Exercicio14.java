import java.util.Scanner;


public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int N, i=1, somaImpares=0;
		System.out.print("Informe um número -> ");
		N = leia.nextInt();
		while (somaImpares<N)
		{
			somaImpares+=i;
			i+=2;
		}
		if (N==somaImpares)
			System.out.println("\n"+N+" é um quadrado perfeiro");
		else
			System.out.println("\n"+N+" não é um quadrado perfeiro");

	}

}
