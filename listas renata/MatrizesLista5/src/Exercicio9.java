import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int a [][]=new int [10][10],i,j,x;
		Random gera = new Random ();
		Scanner read = new Scanner (System.in);
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				a[i][j]=gera.nextInt (98)+1;
				System.out.printf("[%2d]", a[i][j]);
				
			}
			System.out.println(" ");
		}
		for(i=0;i<10;i++) {
			x=a[i][i];
			a[i][i] = a[i][9-i];
			a[i][9-i] = x;
							
		}
		// TODO Auto-generated method stub

	}

}
