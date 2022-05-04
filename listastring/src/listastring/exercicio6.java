package listastring;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		String frase;
		char letra;
		Scanner read = new Scanner(System.in);
		frase = read.nextLine().toUpperCase();
		letra = read.next().toUpperCase().charAt(0);
		int cont=0;
		
		for(int i = 0 ; i<frase.length();i++) {
			if(frase.charAt(i)==letra) {
				cont++;
			}
			System.out.println("Frase tem :"+cont+" Letras");
			}
		
		// TODO Auto-generated method stub

	}

}
