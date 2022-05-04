package revisãoN2;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int A[][] = new int [5][5];
		int L;
		Random Gera = new Random();
		Scanner read = new Scanner (System.in);
		for(int i =0;i<5;i++) {
			for(int j = 0; j<5; j++) {
				A[i][j] =Gera.nextInt(50)+1;
				System.out.printf("[%2d]",A[i][j]);
			}
			System.out.println("");
		}
		System.out.println("LINHA : ");
		L = read.nextInt();
		if(L<5) {
			for( int i =0;i<1;i++) {
				for (int j = 0; j<5; j++) {
					System.out.printf("|%2d|",A[L][j]);					
				}
				
				System.out.println("");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
