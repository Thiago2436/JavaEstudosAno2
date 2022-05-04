import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		int V[] = new int[20], i, j = 1;
		Random gera = new Random();
		System.out.println("Lista de  Numeros ");
		for (i = 0; i < 20; i++) {
			V[i] = gera.nextInt(50) + 1;
			System.out.print(V[i] + "|");
		}
		System.out.println("\n \n Multiplos de 5 : \n");
		for (i = 0; i < 20; i++) {
			if (V[i] % 5 == 0)
					System.out.print(V[i] + "|");
			
		}
		System.out.println("\n : "+j);
	}

	// TODO Auto-generated method stub

}
