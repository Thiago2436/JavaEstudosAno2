import java.util.Scanner;


public class Exercicio07 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int a, b, c, x;
		
		System.out.println("Informe 3 valores");
		System.out.print("1� n�mero-> ");
		a = get.nextInt();
		System.out.print("2� n�mero-> ");
		b = get.nextInt();
		System.out.print("3� n�mero-> ");
		c = get.nextInt();
		if (a>b)
		{
			x=a;
			a=b;
			b=x;
		}
		if (b>c)
		{
			x=b;
			b=c;
			c=x;
		}
		if (a>b)
		{
			x=a;
			a=b;
			b=x;
		}
		System.out.println("\nN�meros em ordem: "+a+" - "+b+" - "+c);

	}

}
