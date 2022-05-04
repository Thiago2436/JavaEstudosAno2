import java.util.Scanner;


public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,i, fat=1;
		System.out.print("Informe um número para calcular o fatorial-> ");
		num = leia.nextInt();
		for (i=1;i<=num;i++)
			fat*=i;
		System.out.println("O fatorial de "+num+" é igual a "+fat);
			
	}
}
