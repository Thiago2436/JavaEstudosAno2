package hackathon2019;

import java.util.Scanner;

public class acima {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int N,i, cont=0;
		float media=0, perc;
		N = read.nextInt();
		int medias[] = new int[N];
		for (i=0;i<N;i++)
		{
			medias[i]=read.nextInt();
			media+=medias[i];
		}
		media /=N;
				for ( i = 0;i<N;i++)
				{
					if (medias[i]>media)
						cont++;
				}
		perc = (cont*100f)/N;
		System.out.printf("%.2f%%",perc);
		// TODO Auto-generated method stub

	}

}
