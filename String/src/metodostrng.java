import java.util.Scanner;

public class metodostrng {

	public static void main(String[] args) {
		String nome;
		Scanner read = new Scanner(System.in);
		System.out.println("nome");
		nome = read.nextLine();
		System.out.println("Nome e : "+nome);
		
		int tam = nome.length(); //tamanho da variavel.
		System.out.println("tamanho :"+tam);
		read.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
