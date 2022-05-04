package com.classes.thiago;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
       
		Lista L = new Lista();
	    Scanner leia = new Scanner(System.in);
	    String nome, curso = null ;
	    int op;
	    No r = null;
		
		L.criaLista();  // criando a lista L vazia
		
		do {
			System.out.println("\n1 - Inserir no Inicio");
			System.out.println("2 - Inserir no Fim");
			System.out.println("3 - Listagem");
			System.out.println("4 - Remover no Inicio");
			System.out.println("5 - Remover no Fim");
			System.out.println("6 - Consultar Aluno");
			System.out.println("7 - Inserir depois de um aluno");			
			System.out.println("8 - Inserir antes de um aluno");
			System.out.println("9 - Remover um aluno");
			
			System.out.println("10 - Inserir ordenado");
			
			System.out.println("0 - Sair do programa");
			
			System.out.println("Digite a op��o: ");
			op = leia.nextInt();
			
			switch(op) {
			   
			    case 1: System.out.println("Digite o nome do aluno:");
			            nome = leia.next();
			            System.out.println("Digite o curso do aluno: ");
			            curso = leia.next();
			            L.Ins_Inicio(nome, curso);
			            break;
			            
			    case 2: System.out.println("Digite o nome do aluno:");
	                    nome = leia.next();
	                    System.out.println("Digite o curso do aluno: ");
	                    curso = leia.next();
	                    L.Ins_Fim(nome, curso);
	                    break;
	                    
			    case 3: System.out.println("\n *** Listagem dos Alunos *** \n");
			            L.Listagem();
			            break;
			  			            
			    case 4: nome = L.Primeiro(); 
			    	    if (L.Rem_Inicio())
			    	        System.out.println("O(a) aluno(a) "+nome+ " foi removido(a) da lista!");
			            else
			            	System.out.println("Lista Vazia!");
			    	    break;
			   
			    case 5: if (L.Rem_Fim())
			    	        System.out.println("Remocao com sucesso!");
			            else
			            	System.out.println("Lista Vazia!");
			            break;
			            
			    case 6: System.out.println("Digite o nome do aluno a consultar:");
                        nome = leia.next();
                        
                        r = L.Consulta(nome);
                        
                        if (r==null)
                        	System.out.println("Aluno nao cadastrado!");
                        else {
                        	
                        	System.out.println("Nome....: "+r.getNome());
                        	System.out.println("Curso...: "+r.getCurso());
                        	                       	
                        }
                        break;
                        
			    case 7: System.out.println("Digite o nome do aluno a consultar:");
                        nome = leia.next();
                
                        r = L.Consulta(nome);
                
                        if (r==null)
                	          System.out.println("Aluno nao cadastrado!");
                        else {
                           System.out.println("Digite o nome a inserir: ");
                           nome = leia.next();
                           System.out.println("Digite o curso a inserir: ");
                           curso = leia.next();
                           
                           // ser� que r � o ultimo n� da lista?
                           if (r.getProx()==null)
                        	   L.Ins_Fim(nome, curso);
                           else
                        	   L.Ins_Depois(r,nome,curso);
                        		
                        }
                        break;
               
			    case 8: System.out.println("Digite o nome do aluno a consultar:");
                        nome = leia.next();
        
                        r = L.Consulta(nome);
        
                        if (r==null)
        	                System.out.println("Aluno nao cadastrado!");
                        else {
                            System.out.println("Digite o nome a inserir: ");
                            nome = leia.next();
                            System.out.println("Digite o curso a inserir: ");
                            curso = leia.next();
                            
                            if (r==L.Inicio)
                            	L.Ins_Inicio(nome, curso);
                            else
                            	L.Ins_Antes(r,nome, curso);
                        }
                        break;
                        
			    case 9: System.out.println("Digite o nome do aluno a remover:");
                        nome = leia.next();

                        r = L.Consulta(nome);

                        if (r==null)
	                        System.out.println("Aluno nao cadastrado!");
                        else 
                        {
                        	if (r==L.Inicio)
                        		L.Rem_Inicio();
                        	else
                        		if (r.getProx()==null) // r � o ultimo
                        		    L.Rem_Fim();
                        		else
                        			L.Rem_Meio(r);
                        	System.out.println("Remo��o com sucesso!");
                        }
                        break;
                 
			    case 10:  System.out.println("Digite o nome do aluno a Cadastar:");
                nome = leia.next();
                
                r = L.Consulta(nome);

                if (r==null) {
	                System.out.println("Lista vazia");
	                L.Ins_Inicio(nome, curso);
                }
                else {
                    System.out.println("Digite o nome a inserir: ");
                    nome = leia.next();
                    System.out.println("Digite o curso a inserir: ");
                    curso = leia.next();}
                if (r==L.Inicio)
                	L.Ins_Inicio(nome, curso);
                else
                	  L.Ins_Ord(r,nome, curso);
	                      
	                      /* Na classe Lista:
	                       * 
	                       * Se a lista estiver vazia ou se o nome � menor do que o 1o. nome da lista
	                       *     Ins_inicio
	                       * senao
	                       *     Procurar (while) o lugar onde nome sera inserido
	                       *     
	                       *     se o nome for o maior entre todos
	                       *          Ins_fim
	                       *     senao
	                       *         (existe na lista alguem maior que nome)
	                       *         ins_antes
	                       * 
	                       */
	                      
	                      
	                      break;
	                   
                        
                        
			} // switch
			
		}while (op!=0);
	} // main
	
}// classe principal
