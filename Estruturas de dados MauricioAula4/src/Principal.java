import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Lista L = new Lista();
		Scanner leia = new Scanner(System.in);
		String nome, curso;
		int op;
		No r = null;
		
		L.criarLista();
		
		do {
			System.out.println("\n1 - Inserir no Inicio");
			System.out.println("2 - Inserir no Fim");
			System.out.println("3 - Listagem dos alunos");
			System.out.println("4 - Remover no Inicio");
			System.out.println("5 - Remover no Fim");
			System.out.println("6 - Consultar aluno");
			System.out.println("7 - Transferir para Inicio");
			System.out.println("8 - Transferir para Fim");
			System.out.println("9 - Remover um aluno");
			
			System.out.println("10 - Remover nomes repetidos");
			/*
			 *  Procurar na lista a ocorrencia de nomes repetidos
			 *  enquanto houver nomes repetidos, remova-os.
			 *  no final a lista deve ter apenas um nome de cada aluno
			 * 
			 * Ao remover, verificar se � no fim ou no meio
			 * 
			 * O algoritmo termina, quando o n� consultado (p) chegar no Fim da lista
			 */
			
			
			System.out.println("0 - Sair do programa");
			
			System.out.println("\nDigite a op��o: ");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1: System.out.println("Digite o nome a inserir: ");
			        nome = leia.next();
			        System.out.println("Digite o curso: ");
			        curso = leia.next();
			        L.Ins_Inicio(nome, curso);
			        break;
			        
			case 2: System.out.println("Digite o nome a inserir: ");
			        nome = leia.next();
			        System.out.println("Digite o curso: ");
			        curso = leia.next();
			        L.Ins_Fim(nome, curso);
			        break;

			case 3: if (L.Inicio == null)
				       System.out.println("Lista vazia!");
			        else
			        	L.Listagem();
			        break;
			        
			case 4: if(L.Rem_Inicio())
				         System.out.println("Remo��o com sucesso!");
			        else
			        	System.out.println("Lista vazia!");
			        break;
			        
			case 5: if(L.Rem_Fim())
		                System.out.println("Remo��o com sucesso!");
	                else
	                 	System.out.println("Lista vazia!");
	                break;
	                
			case 6: System.out.println("Digite o nome do aluno a consultar: ");
			        nome = leia.next();
			        
			        r = L.Consultar(nome);
			        
			        if (r==null)
			        	System.out.println("Aluno nao cadastrado!");
			        else
			        {
			        	System.out.println("\nNome....: "+r.getNome());
			        	System.out.println("Curso....: "+r.getCurso());
			        }
			        break;
			         
			case 7: System.out.println("Digite o nome do aluno a transferir: ");
				    nome = leia.next();
						        
					r = L.Consultar(nome);
						        
					if (r==null)
					   	System.out.println("Aluno nao cadastrado!");
					else
						if (r == L.Inicio)
							System.out.println("O nome "+nome+" j� � o primeiro!");
						else {
							L.Transf_Inicio(r);
						    System.out.println("Transferencia com sucesso!");
						}
					 break;	
					       
			case 8: System.out.println("Digite o nome do aluno a transferir: ");
		            nome = leia.next();
				        
			        r = L.Consultar(nome);
				        
	       	 	    if (r==null)
			   	         System.out.println("Aluno nao cadastrado!");
			        else
				        if (r == L.Fim)
					        System.out.println("O nome "+nome+" j� � o �ltimo!");
				        else {
					           L.Transf_Fim(r);
				               System.out.println("Transferencia com sucesso!");
				        }
			        break;
			        
			case 9: System.out.println("Digite o nome do aluno a remover: ");
                    nome = leia.next();
		        
	                r = L.Consultar(nome);
		        
   	 	            if (r==null)
	   	                  System.out.println("Aluno nao cadastrado!");
	                else
	                {
	                	if (r == L.Inicio)
	                		 L.Rem_Inicio();
	                	else
	                		if (r == L.Fim)
	                			L.Rem_Fim();
	                		else
	                		    L.Rem_Meio(r);
   	 	            
	                    System.out.println("Remo��o com sucesso!");
	                }
	                break;	
	                	
			case 10: if (L.Inicio==null || L.Inicio.getProx()==null)
				          System.out.println("N�o h� nomes repetidos nesta lista!");
			         else
			         {
			        	 Rem_Repetidos();
			        	 System.out.println("Os nomes repetidos foram removidos!");
			         }
	                 break; 	
	                 
			} // fim do switch
			
		} while (op!=0);
		
		

	} // fim da main

	
