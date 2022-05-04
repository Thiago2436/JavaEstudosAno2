import java.util.Scanner;


public class Ex07V02 {

	public static void main(String[] args) {
		String palavra;
		Scanner read = new Scanner(System.in);
		System.out.print("Informe uma palavra-> ");
		palavra = read.next();
		StringBuffer inv = new StringBuffer(palavra);
		inv.reverse();
		System.out.println(inv);
		
	}

}
