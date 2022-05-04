import java.util.Scanner;


public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int inicio, fim, i, soma, aux;
		char resp;
		
		do
		{
			System.out.print("\nInforme o intervalo\nInício: ");
			inicio = leia.nextInt();
			System.out.print("Final: ");
			fim = leia.nextInt();
			
			if (fim<inicio)
			{
				aux=inicio;
				inicio=fim;
				fim=aux;
			}
			
			System.out.print("\nNúmeros no intervalo: ");
			for (soma=0,i=inicio;i<=fim;i++)
			{
				System.out.print(i+" ");
				soma+=i;	
			}
			
			System.out.println("\n\nA soma é "+soma);
			System.out.print("\nDeseja executar novamente? S/N -> ");
			resp = leia.next().toUpperCase().charAt(0);
		} while (resp=='S');

	}
}
