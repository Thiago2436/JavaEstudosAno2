package listastring;

import java.util.Scanner;

//Faça um programa em Java 
//que leia um nome, calcule e mostre quantas letras tem
public class exercicio1 {

	public static void main(String[] args) {
		String nome;
		Scanner read = new Scanner(System.in);
		System.out.println("Nome :");
		nome = read.nextLine();
		System.out.println("Nome é : "+nome);
		
		int tam = nome.length(); //tamanho da variavel.
		System.out.println(": "+tam+" letras");
		read.close();
		// TODO Auto-generated method stub

	}

}
