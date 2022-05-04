import java.util.Scanner;

public class At04 {

	/*
	 * Elabore um programa em Javacom um
	 * método (static) que receba 
	 * um númeropor parâmetroe retorne a soma de seus algarismos 
	 * caso o número seja par e o produto de seus algarismos, casoo número seja ímpar. 
	 * Por exemplo, para o número 136, deverá calcular e retornar1+3+6 que é 10 e, 
	 * para o número 353, deverá calcular e retornar3*5*3 que é 45. Na função main(), 
	 * peça  a entradada número, 
	 * chame a função e imprima o valor do retorno.
	 */
	static Scanner read = new Scanner(System.in);
	
	public static void Produto (int NUM) {
		int C, D, U;
		if(NUM >= 1000 ) {
			System.out.println(" limite 3 Digitos ");
			}
			else if( NUM %2 == 0) {
				C = NUM/100;
				D = NUM%100/10;
				U = NUM%10;
				System.out.println(" Resultado para Numero par e  SOMA : "+(C+D+U));
				}
			else {
				C = NUM/100;
				D = NUM%100/10;
				U = NUM%10;
				System.out.println(" Resultado para Numero Impar e Multiplicação: "+(C*D*U));

			}
		
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" digite um numero max de 3 algarismos");
		int NUM = read.nextInt();
		Produto(NUM);
		

	}

}
	
	
	
