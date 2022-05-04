import java.util.Scanner;


public class Exercicio02 {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int placa, u;
		
		System.out.print("Informe os números da placa -> ");
		placa = get.nextInt();
		if (placa<1000 || placa>9999)
			System.out.println("\nNúmero inválido. A placa tem que ter 4 algarismos");
		else
		{
			u = placa%10;
			if (u==1 || u==2)
				System.out.println("\nPlaca "+placa+" -> Rodízio de Segunda-feira");
			else
				if (u==3 || u==4)
					System.out.println("\nPlaca "+placa+" -> Rodízio de Terça-feira");
				else
					if (u==5 || u==6)
						System.out.println("\nPlaca "+placa+" -> Rodízio de Quarta-feira");
					else
						if (u==7 || u==8)
							System.out.println("\nPlaca "+placa+" -> Rodízio de Quinta-feira");
						else
							System.out.println("\nPlaca "+placa+" -> Rodízio de Sexta-feira");
		}
		

	}
}
