import java.util.Random;
import java.util.Scanner;

public class thiagonumeroprincipal {
public static int[] principal(int Num [],int t) {
	System.out.println("==========================");
	t = Num.length;
	int b [] = new int [t];
	b = Num;
	System.out.println(": Principal: "+b[0]+" !");
	System.out.println("==========================");
	 
	return Num;
		
}

	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
				int Num [] = new int[10];
				Random gera = new Random();
		for(int i =0; i<Num.length;i++) {
			Num[i] = gera.nextInt(10)+1;
			System.out.print(Num[i]);
		}
		System.out.println("+");
		principal(Num, 0);
		
		
		
		// TODO Auto-generated method stub

	}

}
