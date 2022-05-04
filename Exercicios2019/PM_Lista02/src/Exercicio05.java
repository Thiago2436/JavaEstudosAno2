import java.util.Scanner;


public class Exercicio05 {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		float a1, a2, a3;
		
		System.out.println("Informe os ângulos do triângulo");
		System.out.print("1º ângulo-> ");
		a1 = get.nextFloat();
		System.out.print("2º ângulo-> ");
		a2 = get.nextFloat();
		System.out.print("3º ângulo-> ");
		a3 = get.nextFloat();
		if ((a1+a2+a3)!=180 || (a1==0) || (a2==0) || (a3==0))
			System.out.println("\n\nValores inválidos!!");
		else
		{
			if (a1==90 || a2==90 || a3==90)
				System.out.println("\n\nTriângulo retângulo");
			else
				if (a1>90 || a2>90 || a3>90)
					System.out.println("\n\nTriângulo obtusângulo");
				else
					System.out.println("\n\nTriângulo acutângulo");
		}

	}

}
