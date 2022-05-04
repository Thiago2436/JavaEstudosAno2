package revisãoN2;

public class exercicio4 {

	public static void main(String[] args) {
		int A[][] = new int [10][10];
		int z =0,u=1;
		for(int i = 0; i <10; i++) {
			for(int j = 0; j<10; j++) {
				if(i==j) {
					A[i][j] = u;
				}				
			}}
				for(int i = 0; i<10;i++) {
				for(int j =0; j<10;j++) {
					System.out.printf("[%2d]",A[i][j]);
					}
				System.out.println("");
			}
		// TODO Auto-generated method stub

	}
}
