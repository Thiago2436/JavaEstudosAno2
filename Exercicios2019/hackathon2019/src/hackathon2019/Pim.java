package hackathon2019;

import java.util.Scanner;

public class Pim {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int y,x,i;
		
		x=read.nextInt();
		y=read.nextInt();
		for(i=1;i<=y;i++)
		{
			if (i%x == 0)
				System.out.println(" PIM !");
			else
				System.out.print("|"+i);
		}
			
		
		
		// TODO Auto-generated method stub

	}

}
