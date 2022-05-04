import java.util.Random;


public class Exercicio02 {

	public static void main(String[] args) {
		Random alea = new Random();
		int i, vet[] = new int[20], contPar=0;
		float media=0;
		
		System.out.print("Valores gerados -> ");
		for (i=0;i<20;i++)
		{
			vet[i] = alea.nextInt(50)+1;
			System.out.print(vet[i]+" ");
			if (vet[i]%2==0)
			{
				media+=vet[i];
				contPar++;
			}
			
		}
		media/=contPar;
		
		System.out.println("\n\nNo conjunto existem "+contPar
				+" números pares e a média é "+media);

	}

}
