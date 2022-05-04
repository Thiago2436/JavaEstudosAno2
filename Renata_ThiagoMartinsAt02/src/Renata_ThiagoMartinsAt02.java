import java.util.Random;
import java.util.Scanner;

// Thiago Martins Martins 
// Renata de S� Salvarani
public class Renata_ThiagoMartinsAt02 {

	public static void main(String[] args) {
		int Vet[]= new int [20], j,i, num,centena, unidade, dezena;
		Random gera= new Random ();
		boolean existe= false;
		System .out.println ("Elementos gerados");
		for (i=0;i<20;i++){
		Vet[i]= gera.nextInt (9)+1;
		
		System.out.print (Vet[i]+" | ");}
		
		System.out.println ("\n\nDigite um numero de 3 digitos para ser encontrado:  ");
		Scanner leia = new Scanner (System.in);
		num = leia.nextInt();
		
		centena = (num/100);
		dezena = (num%100)/10;
		unidade= (num%100)%10;
		for (i=0;i<18;i++){
			if (Vet[i]== centena){
				if ((Vet[i+1]==dezena) && (Vet[i+2]==unidade)){
					System.out.print("|"+Vet[i]+"|"+Vet[i+1]+"|"+Vet[i+2]);
					existe=true;
					break;	}
				}
				}
		for (i= 19;i>2;i--){
			if (Vet[i]== centena){
				if ((Vet[i-1]==dezena) && (Vet[i-2]==unidade)){
					System.out.print("|"+Vet[i]+"|"+Vet[i-1]+"|"+Vet[i-2]);
					existe=true;
					break;	}
				}
				}
		
	if(existe==false)
		System.out.println(" Nao");
	}

	}


