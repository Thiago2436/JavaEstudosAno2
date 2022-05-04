import java.util.Scanner;


public class Ex07V01 {

	public static void main(String[] args) {
		String palavra, inv="";
		Scanner read = new Scanner(System.in);
		System.out.print("Informe uma palavra-> ");
		palavra = read.next();
		for (int i=palavra.length()-1;i>=0;i--)
		{
			inv+=palavra.charAt(i);		
		}
		System.out.println(inv);
			
	}

}
