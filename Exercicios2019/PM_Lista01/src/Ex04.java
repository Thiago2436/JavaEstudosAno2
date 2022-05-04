import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int d, h, m, s, totSeg;
		System.out.println("Entre com a quantidade de");
		System.out.print("Dias -> ");
		d = leia.nextInt();
		System.out.print("Horas -> ");
		h = leia.nextInt();
		System.out.print("Minutos -> ");
		m = leia.nextInt();
		System.out.print("Segundos -> ");
		s = leia.nextInt();

		totSeg = d*24*60*60 + h*60*60 + m*60 + s;
		System.out.println("\nTotal de segundos = "+totSeg);
	}

}
