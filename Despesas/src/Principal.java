import javax.swing.JOptionPane;

public class Principal {

public static int menu1(){
    int op= Integer.parseInt (JOptionPane.showInputDialog ("1.Cadastrar\n2.Listar\n3.Consultar\n4.Imprimir despesas\n5.Imprimir despesas por categoria\n6.Sair"));
   return op;
   }
public static char menu2(){
    char op=JOptionPane.showInputDialog("a. Consulta por descrição\nb. Consulta por categoria\nc. Voltar").toLowerCase().charAt(0);
    return op;
}
public static int Cadastrar (Despesa v[],int qtd){
    
    if (qtd==10)
            JOptionPane.showMessageDialog(null,"Lista de despesas completa!!");
        else{
            String codigo=JOptionPane.showInputDialog("Informe o codigo da despesa");
            String descrição=JOptionPane.showInputDialog("Descrição  do produto (nome): ");
            String tipo=JOptionPane.showInputDialog("Informe o tipo de despesa? alimentação, moradia, diversão, outros?");
            String data=JOptionPane.showInputDialog("data");
            float valor = Float.parseFloat(JOptionPane.showInputDialog("valor"));
            v[qtd++]=new Despesa (codigo, descrição, tipo, data, valor);
}
    return qtd;
}
public static void listar (Despesa v[],int qtd){
    
    for(int i=0;i<qtd;i++)
    JOptionPane.showMessageDialog (null, v[i].imprimir());
}
public static void consDescrição (Despesa v[], int qtd){
    
    String descricao=JOptionPane.showInputDialog("Informe a descrição da despesa para consulta");
        boolean existe=false;
        for (int i=0;i<qtd;i++){
            
            
			if (v[i].descricao.equalsIgnoreCase(descricao)){
                JOptionPane.showMessageDialog (null,v[i].imprimir());
                existe=true;
                break;
            }
        }
        if (existe==false)
            JOptionPane.showMessageDialog (null,"Despesa não foi cadastrada!!");
 }

public static void consTipo(Despesa v[], int qtd){
    
        String tipo=JOptionPane.showInputDialog ("Informe o tipo de Despesa para consulta");
        boolean existe=false;
        for (int i=0;i<qtd;i++){
            
          if (v[i].tipo.equalsIgnoreCase(tipo)){
                JOptionPane.showMessageDialog(null,v[i].imprimir());
                existe=true;
                break;
            }
}
if (existe==false)
    JOptionPane.showMessageDialog (null, "Não há nenhuma despesa com esse tipo!!");
}

public static float imprimirDespesas (Despesa v[], int qtd){
    float total = 0;
    
    for (int i=0;i<qtd;i++){
      total += v[i].valor;
       }    
    System.out.println("Total : "+total);
    return total;
		   
    }
public static float despesascategoria(Despesa v[], int qtd) {
    String tipo=JOptionPane.showInputDialog("Informe a categoria que quer somar? alimentação, moradia, diversão, outros?");
	float totaltipo = 0;
    for(int i = 0; i<qtd;i++) {
    if (tipo.equalsIgnoreCase(v[i].tipo)) {
    	totaltipo += v[i].valor;
    }
    	}
    System.out.println(" Total: "+totaltipo+" Categoria: "+tipo);
    return totaltipo;
	
}

	public static void main(String[] args) {
		Despesa produto[]= new Despesa [10];
        int op1, qt=0;
        char op2;
        
        do{
            op1=menu1();
            switch(op1){
                case 1: qt= Cadastrar (produto, qt);break;
                case 2: listar (produto,qt);break;
                case 3: do{
                    op2=menu2();
                    switch(op2){
                        case 'a':consDescrição(produto,qt);break;
                        case 'b':consTipo(produto,qt);break;
                     }
                }while (op2!='d');break;  
                case 4: imprimirDespesas (produto,qt);break;
                case 5: despesascategoria(produto, qt);break;    
                case 6: JOptionPane.showMessageDialog (null, "FIM");break;
                default: JOptionPane.showMessageDialog (null, "Opção Inválida !!");                
            }
           
        }while (op1!=6);
		
		// TODO Auto-generated method stub

	}

}
