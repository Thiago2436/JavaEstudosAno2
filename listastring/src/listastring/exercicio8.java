package listastring;
/* 8. Escreva um programa em Java que leia uma palavra 
fornecida pelo teclado e em seguida escreva o caractere 
presente no meio da palavra, caso esta tenha um número 
ímpar de caracteres e os dois do meio caso esta tenha 
um número par de caracteres. Como exemplo, considere a
palavra SONHO. O caractere a ser impresso será o N. */

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		String palavra;
		Scanner read = new Scanner (System.in);
		palavra = read.next();
		if(palavra.length()%2!=0) {
			int i = palavra.length()/2;
			System.out.println(palavra.charAt(i));
			}
		else if(palavra.length()%2==0) {
			 int i = palavra.length()/2-1;
			 int ip = palavra.length()/2;
			 System.out.print(palavra.charAt(i));
			 System.out.print(palavra.charAt(ip));
			 }
			
			// TODO Auto-generated metho stub

	}

}
