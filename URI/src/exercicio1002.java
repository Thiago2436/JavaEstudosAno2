
	import java.util.Scanner;


public class exercicio1002 {
	public static void main(String[] args) {
		
		double A ;
		double pi =3.14159;
		double R;
		Scanner read = new Scanner (System.in);
		R = read.nextDouble();				
		A = pi*(R*R);
		read.close();
		System.out.printf("A=%.4f \n",A);
		// TODO Auto-generated method stub

	}

}
