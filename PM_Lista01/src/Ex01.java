import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		System.out.print("Digite um valor -> ");
		a=leia.nextInt();
		System.out.print("Digite outro valor -> ");
		b=leia.nextInt();
		System.out.println(a+" mais "+b+" é igual a "+(a+b));

	}

}
