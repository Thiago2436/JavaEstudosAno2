import java.util.Scanner;

public class comparemenormaior {

	public static void main(String[] args) {
		String nome1, nome2;
		Scanner read = new Scanner(System.in);
		nome1 = read.nextLine();
		nome2 = read.nextLine();
		if(nome1.compareTo(nome2)<0)
			System.out.println(nome1+"e menor"+nome2);
		else
			if(nome1.compareTo(nome2)==0)
				System.out.println("iaguais");
			else
				System.out.println(nome1+"	maior	"+nome2);
		read.close();
		
		
		// TODO Auto-generated method stub

	}

}
