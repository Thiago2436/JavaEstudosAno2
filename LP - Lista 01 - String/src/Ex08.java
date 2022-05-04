import java.util.Scanner;


public class Ex08 {

	public static void main(String[] args) {
		String palavra;
		int tam;
		
		Scanner read = new Scanner(System.in);
		System.out.print("Informe uma palavra-> ");
		palavra = read.next();
		tam = palavra.length();
		
		if (tam%2==1)  
			System.out.println(palavra+"\n"+palavra.charAt(tam/2));
		else 
			System.out.println(palavra+"\n"+palavra.charAt(tam/2-1) 
					+""+ palavra.charAt(tam/2));

	}

}
