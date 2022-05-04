import java.util.Scanner;


public class Ex08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float km, precoLocacao;
		int dias;
		System.out.println("Digite os dados da locação do veículo -> ");
		System.out.print("Quantos dias? ");
		dias = leia.nextInt();
		System.out.print("Quantos quilômetros? ");
		km = leia.nextFloat();
		precoLocacao = dias*60 + km*0.15f;
		System.out.println("\nPreço a pagar pela locação do veículo -> R$ "+precoLocacao);;

	}

}
