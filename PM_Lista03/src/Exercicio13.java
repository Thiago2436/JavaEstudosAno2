import java.util.Scanner;


public class Exercicio13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,i;
		boolean primo=true;
		System.out.print("Informe um n�mero para verificar se � primo -> ");
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
			System.out.println(num+" � um n�mero primo");
		else
			System.out.println(num+" n�o � um n�mero primo");

	}
}
