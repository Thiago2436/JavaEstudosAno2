import java.util.Scanner;
/*
 * Escreva um programa em Java que contenha um 
 * método que verifique se um número é par ou ímpar. 
 * No main, faça a chamada ao método. 
 */
public class exercicio1 {
static void parimpar() {
	Scanner read = new Scanner(System.in);
	int Num;
	Num = read.nextInt();
	if(Num%2 == 0){
		System.out.println("Numero " +Num+" Par");
	}
		else {
			System.out.println("Numero "+Num+" Impar");
			}
	read.close();
	
}
	public static void main(String[] args) {
		parimpar();
		// TODO Auto-generated method stub

	}

}
