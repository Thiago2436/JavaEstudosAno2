import java.util.Scanner;


public class Ex08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float km, precoLocacao;
		int dias;
		System.out.println("Digite os dados da loca��o do ve�culo -> ");
		System.out.print("Quantos dias? ");
		dias = leia.nextInt();
		System.out.print("Quantos quil�metros? ");
		km = leia.nextFloat();
		precoLocacao = dias*60 + km*0.15f;
		System.out.println("\nPre�o a pagar pela loca��o do ve�culo -> R$ "+precoLocacao);;

	}

}
