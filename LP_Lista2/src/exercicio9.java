import java.util.Scanner;
/*
 * Faça um programa em Java que imprima todos os números primos de um 
 * intervalo informado pelo usuário. 
 * Utilize o método do exercício 8 para verificar se o número é primo ou não.
 */

public class exercicio9 {
	public static boolean VF(int numero) {
		for( int j = 2; j<numero; j++) {
			if(numero % j == 0)
			return false;
		}
		return true;
		}
		
	

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int N = 0;
		System.out.println(" Tamanho do Intervalo ");
		N=read.nextInt();
		int n[] = new int [N];
		for(int i = 0; i <n.length;i++) {
			System.out.print(" Digite o Nº:  "+(1+i)+"_");
			n[i]=read.nextInt();
		}
		for (int i = 0 ; i< n.length; i++) {
			if(VF(n[i])) {
				System.out.print(" E Primo : "+n[i]+" ");
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
