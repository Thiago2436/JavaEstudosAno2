package com.lohiane.estruturasdados.vetor.teste;

import java.util.Scanner;

import com.lohiane.estruturasdados.vetor.Vetor;

public class Aula3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Vetor  vetor = new Vetor(5);
		String Elemento;
		System.out.println("Digite o Elemento");
		Elemento = read.next();
		vetor.adiciona(Elemento);
		System.out.println("Digite +1 Elemento");
		Elemento = read.next();
		vetor.adiciona(Elemento);
				vetor.adiciona(Elemento);
	
		}
						
		// TODO Auto-generated method stub

	}


