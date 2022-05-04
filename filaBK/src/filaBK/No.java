package filaBK;

public class Senha {
	private char letra;  //P ou C
private int num;  // 1000 ou 2000
private No prox; 
List<Senha> prioritarios = new ArrayList<Senha>();
List<Senha> comuns = new ArrayList<Senha>();
public char getLetra() {
	return letra;
}
public void setLetra(char letra) {
	this.letra = letra;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public No getProx() {
	return prox;
}
public void setProx(No prox) {
	this.prox = prox;
}
public List<Senha> getPrioritarios() {
	return prioritarios;
}
public void setPrioritarios(List<Senha> prioritarios) {
	this.prioritarios = prioritarios;
}
public List<Senha> getComuns() {
	return comuns;
}
public void setComuns(List<Senha> comuns) {
	this.comuns = comuns;
}


}
