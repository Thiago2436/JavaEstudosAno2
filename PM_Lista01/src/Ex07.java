import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float dist, desemp, precoL, qtdeL, gasto;
		System.out.print("Informe a dist�ncia -> ");
		dist = leia.nextFloat();
		System.out.print("Informe o desempenho do ve�culo -> ");
		desemp = leia.nextFloat();
		System.out.print("Informe o pre�o do litro do combust�vel -> ");
		precoL = leia.nextFloat();
		
		qtdeL = dist/desemp;
		gasto = qtdeL*precoL;
		
		System.out.println("\nPara a viagem de "+dist
				+"km, voc� precisar� de "+qtdeL
				+" litros e gastar� R$ "+gasto);
	}

}
