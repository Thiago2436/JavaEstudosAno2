package listastring;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		//Faça um programa em Java que leia uma String 
		//via teclado e a escreva invertido.
		String frase, tam=""; 
		
		Scanner read = new Scanner(System.in);
		frase = read.next();// next le uma unica palavra.
	
		for (int i = frase.length()-1; i>=0; i--) {
			
			tam += frase.charAt(i);
		}
		System.out.println(tam);
		
		// TODO Auto-generated method stub

	}

}
