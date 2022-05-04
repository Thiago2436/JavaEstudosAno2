import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float dist, desemp, precoL, qtdeL, gasto;
		System.out.print("Informe a distância -> ");
		dist = leia.nextFloat();
		System.out.print("Informe o desempenho do veículo -> ");
		desemp = leia.nextFloat();
		System.out.print("Informe o preço do litro do combustível -> ");
		precoL = leia.nextFloat();
		
		qtdeL = dist/desemp;
		gasto = qtdeL*precoL;
		
		System.out.println("\nPara a viagem de "+dist
				+"km, você precisará de "+qtdeL
				+" litros e gastará R$ "+gasto);
	}

}
