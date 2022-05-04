package revisãoN2;

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		int A[] = new int [20];
		int B[] = new int [20],C[] = new int [20];
		Random gera = new Random();
		for(int i =0; i<20;i++) {
			A[i] = gera.nextInt(99)+1;
			if((A[i]%5)==0) {
				B[i] = A[i];
			}
			else {
				C[i]= A[i];}
					}
		System.out.println(" VETOR A ");
		for(int i =0; i<20;i++) {
			System.out.printf(" [%2d]",A[i]);
			}
		System.out.println("\n VETOR multiplos de 5");
		for(int i =0; i<20;i++) {
			System.out.printf(" [%2d]",B[i]);
			}
		System.out.println("\n VETOR nao multiplos");
		for(int i =0; i<20;i++) {
			System.out.printf(" [%2d]",C[i]);
			}
		
		// TODO Auto-generated method stub

	}

}
