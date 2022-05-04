import java.util.Scanner;
/*
 * Faça um programa em Java com um método que leia dois valores (float) 
 * e calcule a divisão entre eles. 
 * No main, faça a chamada ao método.
 */
public class Exercicio2 {
	public static void Divisao() {
		 Scanner read = new Scanner(System.in);
	float N1,N2, R;
	N1 = read.nextFloat();
	N2 = read.nextFloat();
	R = (N1/N2);
	System.out.printf(" %.2f ",R);
	read.close();
	
	}
	public static void main(String[] args) {
		Divisao();
			// TODO Auto-generated method stub

	}

}
