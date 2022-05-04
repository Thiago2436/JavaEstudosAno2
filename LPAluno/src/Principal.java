import java.util.Scanner;

public class Principal {
	public static Scanner read = new Scanner(System.in);
	
	public static int menu() {
		System.out.println(" 1 Cadastrar: \n 2 Listar: \n 2.1Consultar \n 3 Sair :");
		int escolha = read.nextInt();
		return escolha;
		
	}
	
	public static int Cadastro(Alunos lista[], int qtd) {
		if(qtd<100) {
			String RA = read.next();
			String nome =read.next();
			float n1 =read.nextFloat();
			float n2 =read.nextFloat();
			lista[qtd++] = new Alunos(nome, RA, n1, n2);
		}
		
		return qtd;
		
	}

	public static void main(String[] args) {
		Alunos lista [] = new Alunos[10];
		int op,cont = 0;
		do {
			op = menu();
			switch(op) {
			case 1: ;break;
			case 2: ;break;
			case 3: ;break;
			}
			}while(op !=3);
		
		// TODO Auto-generated method stub

	}

}
