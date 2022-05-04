import java.util.Scanner;

public class Exercicio4 {
	/* * Faça um programa em Java que receba por parâmetro dois valores 
	 * inteiros e imprima o maior deles. No main, peça os dois números, 
	 * chame o método.
	 */
	public static int Maior(int a, int b) {
		if(a>b)
			return a;
		else 
			return b;
			}

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int x,y;
		x = read.nextInt();
		y = read.nextInt();
		System.out.println(Maior(x,y)+" Maior");
		read.close();
		
		// TODO Auto-generated method stub

	}

}
