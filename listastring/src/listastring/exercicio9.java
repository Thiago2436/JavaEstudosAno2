package listastring;
/*Faça um programa que inicialmente leia um vetor com 5 
nomes e depois coloque-os em ordem alfabética.*/

import java.util.Arrays;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		String Lista[] = new String [5], aux="";
		Scanner read = new Scanner(System.in);
		int i,j;
		for(i = 0; i  < 5; i++) {
			Lista [i] = read.nextLine();
			Lista [i] = Lista[i].toUpperCase();
			}
		System.out.println(Arrays.toString(Lista));
		Arrays.sort(Lista);	
		
		System.out.println(Arrays.toString(Lista));
		// TODO Auto-generated method stub

	}

}
