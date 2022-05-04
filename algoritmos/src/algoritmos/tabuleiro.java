package algoritmos;

public class tabuleiro {

	public static void main(String[] args) {
		int a[][]=new int[8][8],i,j=0;
		//int UM=1,ZERO=0, S;
		
		for (i=0;i<8; i++) {				
			for(j=0;j<8;j++) {
				a[i][j] = (i+j)%2;
				//S=(j+i);
				//if ((S%=2)==0)
				//a[i][j]= ZERO;
				//if(ZERO == 0)
				//ZERO = UM;
				//else
					//a[i][j] = UM;
				System.out.printf("|%2d|",a[i][j]);
				}
			System.out.println("|"+i);
			//ZERO = a[i][j-1];
			}
		
						
			
		
		// TODO Auto-generated method stub

	}

}
