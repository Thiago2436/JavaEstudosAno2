import java.util.Scanner;


public class Exercicio03 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		float base, altura, area;
		int op;
		
		System.out.print("Informe o valor da base-> ");
		base = get.nextFloat();
		System.out.print("Informe o valor da altura-> ");
		altura = get.nextFloat();
		System.out.println("\n\nEscolha a opção para o cálculo da área"
				+ "\n1. Retângulo\n2. Triângulo");
		System.out.print("==> Opção -> ");
		op = get.nextInt();
		if (op<1 || op>2)
			System.out.println("\nOpção inválida");
		else
		{
			if (op==1)
				area = base * altura;
			else
				area = (base*altura)/2;
			
			System.out.println("\n\nA área é igual a "+area);
		}
		

	}

}
