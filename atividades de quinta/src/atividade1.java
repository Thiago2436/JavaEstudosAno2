import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		String palavra;
		Scanner read = new Scanner(System.in);
		palavra = read.next();
		String concatena ="" ;
		for(int i=0 ; i< palavra.length(); i++) {
			for(int j = 0 ; j < palavra.length(); j++);{
				concatena += palavra.charAt(i);
				System.out.println(concatena);
			}
		}
		// TODO Auto-generated method stub

	}

}
