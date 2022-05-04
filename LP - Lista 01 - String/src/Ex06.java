import java.util.Scanner;


public class Ex06 {

	public static void main(String[] args) {
		String frase;
		char letra;
		int cont=0;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe uma frase-> ");
		frase = read.nextLine().toUpperCase();
		
		System.out.println("\nInforme uma letra-> ");
		letra = read.next().toUpperCase().charAt(0);
		
		for (int i=0; i<frase.length(); i++)
		{
			if (frase.charAt(i)==letra)
				cont++;
		}
		System.out.println("Na frase tem "+cont+" letras "+letra);
		
	}

}
