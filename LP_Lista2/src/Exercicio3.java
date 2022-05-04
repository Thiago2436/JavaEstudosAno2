import java.util.Arrays;
/*
 * Faça um programa em Java com um método para ler três números inteiros diferentes 
 * e os coloque em ordem crescente. 
 * No main, faça a chamada ao método.
 */
import java.util.Random;
public class Exercicio3 {
	public static void Crescente() {
		int N[]= new int [3];
	Random gera = new Random();
	int i;
	for(i=0; i<3; i++){
		N[i] = gera.nextInt(10)+1;
		System.out.println(N[i]+" ");
		}
	Arrays.sort(N);
	System.out.println("======== Ordenados :");
	for(i=0; i<3; i++){
		System.out.println(N[i]+" ");
		}
	System.out.println("========");
}
	public static void main(String[] args) {
		Crescente();
		// TODO Auto-generated method stub

	}

}
