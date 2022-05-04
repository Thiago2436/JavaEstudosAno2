import java.util.Scanner;


public class exercicio7 {
/*
 * Faça um programa em Java que implemente uma função INVERTE
 *  que recebe um número int como parâmetro e retorna este 
 * número escrito ao contrário. Ex: 431    134.
  */
	static Scanner read = new Scanner(System.in);
	
public static void inverte( int a) {
	int C, D, U;
	
	 
	if(a >= 1000) {
		System.out.println(" limite 3 Digitos");
		
	 	}
		else {
			C = a/100;
			D = a%100/10;
			U = a%10;
			System.out.println("  Invertido : "+U+D+C);	
			}
	}
	
	
	

	public static void main(String[] args) {
		int Num;
		Num = read.nextInt();		
		inverte(Num);
		
		
		
		// TODO Auto-generated method stub
read.close();
	}

}
