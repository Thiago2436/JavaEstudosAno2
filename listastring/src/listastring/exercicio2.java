package listastring;

import java.util.Scanner;
//Faça um programa em Java que leia um nome e o escreva 
//na tela 10 vezes. Um nome por linha.

public class exercicio2 {

	public static void main(String[] args) {
		int i;
		String Nome;
		System.out.println(" Digite o Nome ");
		Scanner read = new Scanner(System.in);
		Nome = read.nextLine();
		for(i=1;i<=10;i++) {
		System.out.println("Nome: "+Nome+" N º "+i);
			read.close();
			}
		// TODO Auto-generated method stub

	}

}
