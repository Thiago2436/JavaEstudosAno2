import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args) {
		String frase;
		Scanner read = new Scanner(System.in);
		int contVogais=0;
		System.out.print("Informe uma frase-> ");
		frase = read.nextLine().toUpperCase();
		
		for (int i=0;i<frase.length();i++)
		{
			switch (frase.charAt(i))
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O': 
			case 'U': contVogais++; break;
			}
		}
		System.out.println(frase+"\n\nTem "+contVogais+" vogais na frase");

	}

}
