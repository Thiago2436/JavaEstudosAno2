import java.util.Scanner;


public class Ex04 {

	public static void main(String[] args) {
		String nome;
		Scanner read = new Scanner(System.in);
		System.out.print("Informe um nome-> ");
		nome = read.nextLine();
		System.out.println();
		for (int i=0; i<nome.length(); i+=2)
			System.out.print(nome.charAt(i)+" ");
		

	}

}
