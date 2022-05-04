import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Lista L = new Lista();
		No aluno;
		int op;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("1- Inserir no fim ");
			System.out.println("2 Listar Alunos  ");
			System.out.println("0 - Sair ");
			op = leia.nextInt();
			switch(op) {
			case 1: aluno = new No();
			System.out.println("digite o nome : ");
			aluno.setNome(leia.next());
			L.IsereFim(aluno);
			break;
			case 2: System.out.println("Listagem dos Alunos");
			L.ListarAlunos();
			break;
			}
		}while(op !=0);
		leia.close();
		// TODO Auto-generated method stub

	}

}
