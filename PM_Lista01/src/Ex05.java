import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, x;
		System.out.println("Entre com dois valores");
		System.out.print("1º valor -> ");
		a = leia.nextInt();
		System.out.print("2º valor -> ");
		b = leia.nextInt();
		
		System.out.println("\n\nAntes da troca: a="+a+" b="+b);
		
		x=a;
		a=b;
		b=x;
		
		System.out.println("\n\nApós a troca:   a="+a+" b="+b);		

	}

}
