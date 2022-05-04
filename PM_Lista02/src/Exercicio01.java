import java.util.Scanner;


public class Exercicio01 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int num, c, d, u;
		
		System.out.print("Informe um número -> ");
		num = get.nextInt();
		
		if (num>=1000)
			System.out.println("\nNúmero não pode ser maior que 999");
		else
		{
			c = num/100;
			d = num%100/10;
			u = num%10;
			
			if (c<d && d<u)
				System.out.println("\nO número é ascendente");
			else
				System.out.println("\nO número não é ascendente");
		}

	}

}
