import java.util.Scanner;


public class Exercicio05 {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		float a1, a2, a3;
		
		System.out.println("Informe os �ngulos do tri�ngulo");
		System.out.print("1� �ngulo-> ");
		a1 = get.nextFloat();
		System.out.print("2� �ngulo-> ");
		a2 = get.nextFloat();
		System.out.print("3� �ngulo-> ");
		a3 = get.nextFloat();
		if ((a1+a2+a3)!=180 || (a1==0) || (a2==0) || (a3==0))
			System.out.println("\n\nValores inv�lidos!!");
		else
		{
			if (a1==90 || a2==90 || a3==90)
				System.out.println("\n\nTri�ngulo ret�ngulo");
			else
				if (a1>90 || a2>90 || a3>90)
					System.out.println("\n\nTri�ngulo obtus�ngulo");
				else
					System.out.println("\n\nTri�ngulo acut�ngulo");
		}

	}

}
