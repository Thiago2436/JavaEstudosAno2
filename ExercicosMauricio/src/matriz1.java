import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int A[][]= new int [5][5],i,j;
		System.out.println(" Digite");
		for (i=0;i<5;i++) {
			for(j=0; j<5; j++) {
				System.out.print("["+i+"]"+"["+j+"]");
				A[i][j] = read.nextInt();
				}
				}
		System.out.println("Diagonal");
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if( i == j)
					System.out.println(""+A[i][j]);
			}
					
		}
		
		read.close();
		
		// TODO Auto-generated method stub

	}

}
