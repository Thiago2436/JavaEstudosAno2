package algoritmos;

import java.util.Random;

public class exercicio8 {

	public static void main(String[] args) {
		int A[][]= new int [4][12],i,j,C[] = new int [12],TA = 0,MP = 0,mes = 0,sem = 0, CT=0;
		Random Gera = new Random();
		for(i=0;i<4;i++) {
			for(j = 0;j<12;j++) {
				A[i][j] =Gera.nextInt(55)+1;
				System.out.printf("|%2d|",A[i][j]);
				if (A[i][j]>=MP) { //GUARDA O  MAIS PRODUTIVO *SEMANA MES E VALOR
					MP = A[i][j];
					mes = (j+1);
					sem = (i+1);}
				}
			System.out.println("||"+(i+1)+"ª Semana");
		}
			//Total MES JA SOMA TOTAL ANO. 
		System.out.println("TOTAL POR MES");
		for(i=0;i<12;i++) {
			for(j=0;j<4;j++) {
				C[i]=C[i]+A[j][i];
					if(C[i]>=CT) {
					CT = C[i];
				}
				TA +=C[i];
				}
			//System.out.print(i+1);
			System.out.printf("|%2d|",C[i]);
			}
		System.out.println("\n TOTAL DO ANO : "+TA);
		System.out.println("VALOR MAIS PRODUTIVO: "+CT);
		System.out.println("MAIOR PRODUÇÃO : "+mes+" SEMANA : "+sem+" TOTAL :"+MP);
		
		
		
		// TODO Auto-generated method stub

	}

}
