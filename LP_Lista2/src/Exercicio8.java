import javax.swing.JOptionPane;

public class Exercicio8 {
	/*
	 * Escreva um programa em Java que contenha uma função que retorne TRUE
	 *  caso o argumento passado seja primo e FALSE caso contrário. 
	 * O argumento será sempre um valor inteiro.
	 */
	public static boolean VF(int numero) {
		for( int j = 2; j<numero; j++) {
			if(numero % j == 0)
			return false;
		}
		return true;
		}

	public static void main(String[] args) {
		int n[]= new int [1];
		for(int i = 0; i <n.length;i++) {
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite"+(1+i)+" Numero. sera primo?"));
			
		}
		for (int i = 0; i < n.length; i++) {
            if(VF(n[i]) )
            	           
                System.out.println(n[i] + " E primo.  " );
            else
            	System.out.println(" Nao e primo "+n[i]);
        }    
		
    }
		// TODO Auto-generated method stub

	}


