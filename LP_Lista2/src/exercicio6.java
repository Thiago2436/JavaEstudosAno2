import java.util.Scanner;

public class exercicio6 {
	static Scanner read = new Scanner(System.in);
	public static int Potencia (int base, int pot) {
		int acumulador = 1;
		do {
			if(base != 0) {
				do {
					acumulador = (acumulador*base);
					pot--;
				}while(pot >0 );
				System.out.println("Saida :"+acumulador);
			}// end do if
		}while((base == 0));// end do While
		System.out.println(" Fim da potencia. ");
		
		return acumulador;
		
		
		
	}
	public static void main(String[] args) {
		int x,y;
		System.out.println("Digite a Base :");
		x=read.nextInt();
		System.out.println(" Digite o Expoente");
		y=read.nextInt();
		Potencia(x, y);
		System.out.println("===================");
		
		
		// TODO Auto-generated method stub

	}

}
