import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String nome;
		Scanner read = new Scanner(System.in);
		System.out.print("Informe um nome-> ");
		nome = read.nextLine();
		System.out.println(nome+" tem "+nome.length()+" caracteres");
	}

}
