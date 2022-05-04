package revisãoN2;

import java.util.Random;

public class exercicio1 {

	public static void main(String[] args) {
		int A[] = new int [30], Media =0, S=0;
		Random gera = new Random();
		for (int i = 0;i<30;i++) {
			A[i] = gera.nextInt(50)+1;
			System.out.printf("[%2d]",A[i]);
		}
		for(int  i = 0; i<30; i++) {
			if((i%2)==0) {
				S += A[i];
				}
		}
		Media = (S/15);
		System.out.println("\n M = "+Media);
		
		// TODO Auto-generated method stub

	}

}
