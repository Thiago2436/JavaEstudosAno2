import java.util.Random;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int V[]= new int[20], i ,val;
		Random gera = new Random();
		Scanner read = new Scanner(System.in);
		System.out.println("Lista de Numeros : ");
		for(i=0;i<20;i++) {
			V[i] = gera.nextInt(50)+1;
			System.out.print("|"+V[i]);
		}
		System.out.println("\n Digite o multiplo : ");
		val = read.nextInt();
		for(i=0;i<20;i++) {
		if (V[i]%val==0)
		{
			System.out.print(V[i]+"|");
		}
		}
		// TODO Auto-generated method stub

	}

}
