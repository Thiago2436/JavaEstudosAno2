
public class Alunos {
public String nome, RA;
public float M,N1,N2;
public Alunos(String nome, String rA, float n1, float n2) {
	super();
	this.nome = nome;
	
	RA = rA;
	M = ((n1 + n2)/2);
	N1 = n1;
	N2 = n2;
	
	
}
public String Imprimir() {
	 return "Nome : "+nome+"/n RA : "+RA+" Media : "+M;
	 
}

}
