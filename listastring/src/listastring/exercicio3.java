package listastring;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		//Faça um programa em Java que leia um nome e o 
		//escreva tantas vezes quantos forem seus caracteres. 
		//Um nome por linha.
		String nome;
		Scanner read = new Scanner(System.in);
		nome = read.nextLine();
		int tam = nome.length();
		System.out.println("O Nome : "+nome+" Possui : "+tam+" Caracteres ");
		for(int i = 1; i<=tam;i++) {
			System.out.println(nome+ "[ " +i+ " ] ordem");
			read.close();
		}
		// TODO Auto-generated method stub

	}

}
