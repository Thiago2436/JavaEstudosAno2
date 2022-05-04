import java.util.Scanner;


public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,i;
		boolean primo=true;
		System.out.print("Informe um número para verificar se é primo -> ");
		num = leia.nextInt();
		if (num==1) primo=false;
		for (i=2;i<=num/2;i++)
		{
			if (num%i==0)
			{
				primo=false;
				break;
			}
		}
		if (primo)
			System.out.println(num+" é um número primo");
		else
			System.out.println(num+" não é um número primo");

	}
}
