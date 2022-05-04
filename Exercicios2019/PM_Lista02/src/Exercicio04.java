import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		float a, b, c;
		
		System.out.println("Informe os lados do triângulo");
		System.out.print("1º lado-> ");
		a = get.nextFloat();
		System.out.print("2º lado-> ");
		b = get.nextFloat();
		System.out.print("3º lado-> ");
		c = get.nextFloat();
		if (a<b+c && b<a+c && c<a+b)		
		{
			if (a==b && b==c)
				System.out.println("\n\nTriângulo equilátero");
			else
				if (a==b || a==c || b==c)
					System.out.println("\n\nTriângulo isósceles");
				else
					System.out.println("\n\nTriângulo escaleno");
		}
		else
			System.out.println("\n\nValores inválidos!! Não formam um triângulo");

	}

}
