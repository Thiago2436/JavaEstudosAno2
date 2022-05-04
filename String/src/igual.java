import java.util.Scanner;

public class igual {

	public static void main(String[] args) {
		String capital;
		Scanner read = new Scanner(System.in);
		System.out.println("capital Brasil? ");
		capital = read.nextLine();
		if(capital.equalsIgnoreCase("Brasilia")
				||capital.equalsIgnoreCase("Brasília"))
			System.out.println("certo");
		else
			System.out.println("errado");
		
		// TODO Auto-generated method stub
		read.close();
	}

}
