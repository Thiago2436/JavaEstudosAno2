import java.util.Random;

public class Exercicio07 {
	public static void main(String[] args) {
		Random gera = new Random();
		int i, maior=0, menor=51, num;
		for (i=1;i<=20;i++)
		{
			num = gera.nextInt(50)+1;
			System.out.print(num+" ");
			if (num>maior)
				maior=num;
			if (num<menor)
				menor=num;
		}
		System.out.println("\nMaior = "+maior+" e Menor = "+menor);
	}
}
