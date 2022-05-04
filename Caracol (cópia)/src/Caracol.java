import java.util.Scanner;

public class Caracol {

	public static void main(String[] args) {
	
		int i,M,Continue = 1;//INDEXADORES
		Scanner read = new Scanner (System.in);
	
		while(Continue == 1) {//ESTRUTURA DE CONTINUAÇÃO
			System.out.println("TYPE ONE NUMBER, BETEWEN 0 AND 20 :");
			M = read.nextInt();
			int A[][] = new int [M][M];
			int Mlim = M-1, beguin=0, Cont=1;//conjuntodeVARIAVEIS
		
		if ((M <= 20)) {//MAX DE 20
			while(Cont<=(M*M)) { //M É O NUMERO DA MATRIZ QUADRADA [N'X N']
				for( i=beguin;i<=Mlim;i++) {// vetor1DIREITA
					A[beguin][i]=Cont++;
				}
				for( i=beguin+1;i<=Mlim;i++) {// vetor2ABAIXO
					A[i][Mlim]=Cont++;
				}
				for( i=Mlim-1;i>=beguin;i--) {// vetor3ESQUERDA
					A[Mlim][i]=Cont++;
				}
				for ( i=Mlim-1;i>=beguin+1;i--) {//vetor4ACIMA
					A[i][beguin]=Cont++;
				}
				//LIMITE DE CONTAGEM
				Mlim=Mlim -1;
				beguin = beguin+1;
	}
	for( i=0;i<M;i++) {// PRINTAR A MATRIZ
		System.out.println("");
		for(int j=0; j<M; j++) {
			System.out.print(A[i][j]+"\t");// \T SERVE PARA FORMATAR
		}
	}
	}//END_IF
	else {// interface
		Continue = 1;
		System.out.println("!! TOO LARGE ! MAX [20] TRY AGAIN !");}
		System.out.println("\n CARACOL BY \n THIAGO MARTINS E MARTINS \n RENATA SA SALVARANI \n ANDREA NASTI (c) \n YOU WANT CONTINUE?");
		System.out.println(" [0]FOR NOT OR [1] TO YES : ");
		Continue = read.nextInt();
		System.out.println("OK, AS YOU WHISH !");
	}
		// TODO Auto-generated method stub
	read.close();
	}

}
