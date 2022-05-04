package hackathon2019;

import java.util.Scanner;

public class Amigos {
	public static int pag(int m, int n) {
		if( m == 0)
			return n+1;
		if ( n == 0)
			return pag(m-1,1);
		return pag( m-1,pag(m,n-1));
				
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int m = read.nextInt();
		int n = read.nextInt();
		System.out.println(":"+pag(m,n));
		
		// TODO Auto-generated method stub

	}

}
