import javax.swing.JOptionPane;

public class Principal {
	public static int menu()
	{
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir"
				+ "\n2. Listar"
				+ "\n3. Emprestar"
				+ "\n4. Devolver"
				));
		return escolha;
	}
	public static int inserir(Livro lista[], int fim)
	{
		if (fim<10)
		{
			String autor = JOptionPane.showInputDialog("Autor.: ");
			String titulo = JOptionPane.showInputDialog("Titulo.: ");
			float Tombo = Float.parseFloat(JOptionPane.showInputDialog("Tombo :"));
			lista[fim++] = new Livro(titulo, autor, Tombo);
		}
		else
			JOptionPane.showMessageDialog(null, "Fim da lista");
		return fim;
	}
	public static void exibir(Livro lista[], int fim)
	{
		for (int i=0; i<fim; i++)
			JOptionPane.showMessageDialog(null,lista[i].imprimir());
	}
	public static void  emp( Livro lista[], int fim) {
		boolean existe = false;
		String t = JOptionPane.showInputDialog("informe o titulo");
		for(int i =0; i<fim; i++) {
			if (lista[i].titulo.equalsIgnoreCase(t)) {
				if (lista[i].emprestar())
				{
					JOptionPane.showMessageDialog(null, "emprestimo ok");
				} else {
					JOptionPane.showMessageDialog(null, "livro não dispponivel");
					existe = true;
					break;
				}
			}
			if(!existe) {
				JOptionPane.showMessageDialog(null, "livro não cadastrado");
			}
		}
	}

	public static void dev(Livro lista[], int fim)
	{
		String t = JOptionPane.showInputDialog("Informe o título do livro que quer emprestar");
		boolean existe=false;
		for (int i=0;i<fim;i++)
		{
			if (lista[i].titulo.equalsIgnoreCase(t))
			{
				if (lista[i].devolver())
					JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso");
				else
					JOptionPane.showMessageDialog(null, "Devolução não realizada, livro já estava disponível");
				existe=true;
				break;
			}
		}
		if (!existe)
			JOptionPane.showMessageDialog(null, "Livro não cadastrado");	
	}
	
	
	public static void main(String[] args) {
		Livro listalivro[] = new Livro[10];
		int op, pos = 0;
		
		do
		{
			op = menu();
			switch (op)
			{
			case 1: pos=inserir(listalivro, pos); 
					break;
			case 2: exibir(listalivro, pos); 
					break;
			case 3:  emp(listalivro, pos); 
					break;
			case 4: dev(listalivro, pos);
			default: 
				JOptionPane.showMessageDialog(null, "Opção inválida!!");
			}
			
		} while (op!=3);
	}

		// TODO Auto-generated method stub

	}


