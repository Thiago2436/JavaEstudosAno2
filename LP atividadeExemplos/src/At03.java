import java.util.Scanner;

public class At03 {
	static Scanner Read = new Scanner(System.in);
	
	public static int geraCod(String n) {
		int codigo=0,i;
		for(i =0 ; i<n.length(); i++)
		{
			if(n.charAt(i)!=' ')
			{
				switch(n.charAt(i))
				{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'Á':
				case 'É':
				case 'Í':
				case 'Ó':
				case 'Ú':
				case 'À':
				case 'È':
				case 'Ì':
				case 'Ò':
				case 'Ù': codigo+=5; break;
				default: codigo +=10;					
				}
			}
		}
		
	return codigo;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int resultado = 0;
		System.out.println(" Digita um Nome : ");
		nome =Read.next();
		nome = nome.toUpperCase();
		resultado = geraCod(nome);
		System.out.println(" Nome Fornecido = "+nome+" \n Resultado : "+resultado+"\n Bolsonaro Lixo");

	}

}
