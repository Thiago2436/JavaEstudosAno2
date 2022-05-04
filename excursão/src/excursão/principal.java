package excursão;
import javax.swing.JOptionPane;

public class principal {
	//************************************************************
	public static int menu1() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir "
				+ "\n2 Listar"
				+ "\n3 Consultar"
				+ "\n4 Reservar"
				+ "\n5 Sair"));
		return op;
	}
	public static char menu2() {
		char op = JOptionPane.showInputDialog("\na Codigo"
				+ "\nb Destino"
				+ "\nc Data"
				).toLowerCase().charAt(0);
		return op;
	}
	// ************************************************************
	public static int inserir(excursao[] viagem, int qt) {
		if ( qt == 10) 
	JOptionPane.showMessageDialog(null, "Lista Completa");
 else {
	String codigo = JOptionPane.showInputDialog(" Informe o codigo");
	String destino =  JOptionPane.showInputDialog("Destino");
	String transoporte = JOptionPane.showInputDialog("Meio de transporte");
	String data = JOptionPane.showInputDialog("Data");
	float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
	int vagas = Integer.parseInt(JOptionPane.showInputDialog("Vagas"));
	
		viagem[qt++] = new excursao(codigo, destino, transoporte, data, valor, vagas);
	
}
return qt;
}
//*************************************************************************************
	public static void listar(excursao[] viagem, int qt) {
		for(int i = 0 ; i<qt; i++) {
			JOptionPane.showInputDialog(null, viagem[i].imprimir());
		}
				
	}
//*****************************************************************************************

	public static void main(String[] args) {
excursao viagem[] = new excursao[10];
int op, qt =0;
char op2;

do {
	op = menu1();
	switch(op) {
	case 1: qt = inserir(viagem,qt); 
	break;
	case 2: listar(viagem, qt); 
	break;
	case 3:
		do {
			op2 = menu2();
			switch(op2) {
			case 'a': consCodigo(viagem,qt); break;
			case 'b': consDestino(viagem,qt); break;
			case 'c': consData(viagem,qt);break;
			}
		}while(op2 !='d');
		break;
	case 4: fazerReservar(viagem,qt); break;
	case 5: JOptionPane.showMessageDialog(null, "Sair");
	default: JOptionPane.showMessageDialog(null, "Opção invalida");
	}
	
}while(op !=5);
		// TODO Auto-generated method stub

	}
private static void consCodigo(excursao[] viagem, int qt) {
	String codigo = JOptionPane.showInputDialog("Informe o codigo")
		
	// TODO Auto-generated method stub
	
}
	

}
