package listastring;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//Faça um programa em Java que leia um nome e imprima 
		//somente as letras na posição par (a partir da posição 0).
		String nome;
		Scanner read = new Scanner(System.in);
		nome=read.nextLine();
		for(int i = 0; i < nome.length(); i++ ) {
			if(i%2 == 0) {
				System.out.print("caracteres na posição par : "+nome.charAt(i));
			}
			if(i%2 != 0) {
				System.out.println(" impar \n"+nome.charAt(i));
			}
			read.close();
		}
		read.close();
	}
	

}
