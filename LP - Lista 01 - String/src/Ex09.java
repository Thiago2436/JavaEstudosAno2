import java.util.Arrays;
import java.util.Scanner;


public class Ex09 {

	public static void main(String[] args) {
		String lista[] = new String[5], aux="";		
		Scanner read = new Scanner(System.in);
		int i,j;
		
		for (i=0;i<5;i++)
		{
			System.out.println("Informe um nome");
			lista[i] = read.nextLine();
		}
		System.out.println(Arrays.toString(lista));
		
		
		//BubbleSort
		
		for (i=0;i<5;i++)
		{
			for (j=i+1;j<5;j++)
			{
				if (lista[i].compareToIgnoreCase(lista[j])>0)
				{
					aux=lista[i];
					lista[i]=lista[j];
					lista[j]=aux;
				}
			}
		}
		
		System.out.println(Arrays.toString(lista));

	}

}
