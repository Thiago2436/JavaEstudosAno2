import java.util.Scanner;


public class Ex06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salario, aumento;
		
		System.out.print("Entre com o valor do salário -> ");
		salario = leia.nextFloat();
		System.out.print("Entre com o percentual de aumento -> ");
		aumento = leia.nextFloat();
		
		//salario = salario*(1+aumento/100);
		//salario = salario + salario*(aumento/100);
		salario += salario*(aumento/100);
		System.out.println("\nO novo salário é R$ "+salario);

	}

}
