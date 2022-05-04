import java.util.Scanner;


public class Ex10 {

	public static void main(String[] args) {
		String palavra, inv="";
		Scanner read = new Scanner(System.in);
		System.out.print("Informe uma palavra-> ");
		palavra = read.next();
		for (int i=palavra.length()-1;i>=0;i--)
		{
			inv+=palavra.charAt(i);		
		}
		System.out.println(inv);
		
		if (palavra.equals(inv))
			System.out.println("\nA palavra é um palíndromo");
		else
			System.out.println("\nA palavra não é um palíndromo");

	}

}
