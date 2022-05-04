import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pilha S = new Pilha();
		Pilha Aux = new Pilha();
		
		Scanner leia = new Scanner (System.in);
		int op, val, bin;
		
		S.criaPilha();  // criando a pilha S vazia
		Aux.criaPilha();
		
		do
		{
			System.out.println("\n1 - Inserir na Pilha");
			System.out.println("2 - Remover da Pilha");
			System.out.println("3 - Imprimir a Pilha");
			System.out.println("4 - Converter Decimal para Binario");
			System.out.println("5 - Verificar numero Capicua");
			System.out.println("6 - Sequencia de números ordenados");
			
			
			System.out.println("0 - Sair do programa");
			System.out.println("Digite a opcao: ");
			op = leia.nextInt();
			
			switch(op) 
			{
			   case 1: System.out.println("Digite o valor a inserir:");
			           val = leia.nextInt();
			           
			           if (S.Push(val))
			        	   System.out.println("Inserção com Sucesso!");
			           else
			        	   System.out.println("Pilha Cheia!");
			           break;
			   
			   case 2: if (S.vazia())
				            System.out.println("Pilha Vazia!");
			           else 
			           {
			        	   System.out.println("Valor removido:" + S.Topo());
			        	   S.Pop();
			           }
			           break;
			           
			   case 3: if (S.vazia())
				             System.out.println("Pilha Vazia!");
			           else
			           {
			        	   System.out.println("\nPILHA:\n");
			        	   S.imprime();
			           }
			           break;
			           
			   case 4: System.out.println("Digite um numero em decimal: ");
			           val = leia.nextInt();
			           
			           bin = S.Converte(val);
			           
			           System.out.println("Numero em binário: "+ bin);
			           break;
			           
			   case 5: System.out.println("Digite um numero: ");
			           val = leia.nextInt();
			           
			           if (S.Capicua(val))
			        	   System.out.println("Numero Capicua!");
			           else
			        	   System.out.println("Numero não é Capicua!");
			           
			           break;
			           
			   case 6: 
				   /* Faça uma repetição para digitar numeros a serem inseridos na pilha S
				    *    --> a cada valor a ser inserido:
				    *    --> se a pilha está vazia insere o nmumero
				    *        senao
				    *            se o numero é menor do que o valor do Topo--> insere o numero
				    *            senao
				    *                Usaremos a pilha Aux para ir removendo numeros de S
				    *                até encontrar o local onde o numero sera inserido
				    *                
				    *                Feito isso, insere o numero e em seguida
				    *                
				    *                Retornar todos os numeros da pilha Aux para a S
				    *                
				    *    Ao finalizar a repetição
				    *    
				    *    Imprime o topo e o remova da pilha
				    *    Faça isso ate a pilha ficar vazia e teremos a sequencia ordenada
				    * 
				    * 
				    */
			   
			           
			           
			           
				   
			        	    
			} // switch
			
		} while (op !=0);  // do
		
	} // main

} // Classe Principal
