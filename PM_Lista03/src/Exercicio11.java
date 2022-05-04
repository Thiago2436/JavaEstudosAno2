
public class Exercicio11 {

	public static void main(String[] args) {
		int n, p1, p2;
		for (n=1000;n<=9999;n++)
		{
			p1=n/100;
			p2=n%100;
			if (n==Math.pow((p1+p2),2))
				System.out.println(n+" = "+p1+" + "+p2+" = "+(p1+p2)+"² = "+n);
		}
		

	}

}
