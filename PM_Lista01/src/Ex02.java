import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		float media;
		System.out.println("Informe tr�s valores");
		System.out.print("1� valor -> ");
		a = leia.nextInt();
		System.out.print("2� valor -> ");
		b = leia.nextInt();
		System.out.print("3� valor -> ");
		c = leia.nextInt();
		media = (a+b+c)/3f;
		System.out.println("\n\nA m�dia � igual a "+media);
	}

}
