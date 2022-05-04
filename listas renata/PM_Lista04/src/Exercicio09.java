import java.util.Arrays;
import java.util.Random;


public class Exercicio09 {

	public static void main(String[] args) {
		int V[] = new int[10];
		int i, j=0;
		Random gera = new Random();
		boolean existe;
		for (i=0;i<10;)
		{
			V[i] = gera.nextInt(50)+1;
			existe=false;
			for (j=0;j<i;j++)
			{
				if (V[i]==V[j])
				{
					existe = true;
					break;
				}
			}
			if (!existe)  // if (existe==false)
				i++;
		}
		Arrays.sort(V);
		System.out.println("Vetor-> "+Arrays.toString(V));
	}
}
