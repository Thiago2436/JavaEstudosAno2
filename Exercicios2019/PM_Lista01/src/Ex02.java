import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		float media;
		System.out.println("Informe três valores");
		System.out.print("1º valor -> ");
		a = leia.nextInt();
		System.out.print("2º valor -> ");
		b = leia.nextInt();
		System.out.print("3º valor -> ");
		c = leia.nextInt();
		media = (a+b+c)/3f;
		System.out.println("\n\nA média é igual a "+media);
	}

}
