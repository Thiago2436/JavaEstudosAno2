import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		float a, b, c;
		
		System.out.println("Informe os lados do tri�ngulo");
		System.out.print("1� lado-> ");
		a = get.nextFloat();
		System.out.print("2� lado-> ");
		b = get.nextFloat();
		System.out.print("3� lado-> ");
		c = get.nextFloat();
		if (a<b+c && b<a+c && c<a+b)		
		{
			if (a==b && b==c)
				System.out.println("\n\nTri�ngulo equil�tero");
			else
				if (a==b || a==c || b==c)
					System.out.println("\n\nTri�ngulo is�sceles");
				else
					System.out.println("\n\nTri�ngulo escaleno");
		}
		else
			System.out.println("\n\nValores inv�lidos!! N�o formam um tri�ngulo");

	}

}
