import java.util.Scanner;


public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float N1, N2, media;
		int i=1;
		while (i<=10)
		{
			System.out.println("Aluno "+i);
			System.out.print("Digite a 1ª nota -> ");
			N1 = leia.nextFloat();
			System.out.print("Digite a 2ª nota -> ");
			N2 = leia.nextFloat();
			media = (N1+N2)/2;
			System.out.println("\nA média é "+media+"\n");
			i++;
		}

	}
}
