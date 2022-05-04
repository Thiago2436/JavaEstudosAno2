import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float metros;
		System.out.print("Digite o valor em metros-> ");
		metros=leia.nextInt();
		System.out.println("\n"+metros+" metros = "+(metros*1000)+" milímetros");

	}

}
