import java.util.Scanner;


public class Exercicio06 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int ano;
		
		System.out.print("Informe um ano -> ");
		ano = get.nextInt();
		
		if (ano%4==0 && (ano%400==0 || ano%100!=0))
			System.out.println("\nAno bissexto");
		else
			System.out.println("\nNão é ano bissexto");

	}

}
