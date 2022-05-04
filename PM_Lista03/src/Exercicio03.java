import java.util.Scanner;


public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int i=1;
		System.out.print("Digite seu nome -> ");
		nome = leia.nextLine();
		
		while (i<=10)
		{
			System.out.println(nome);
			i++;
		}
		
	}

}
