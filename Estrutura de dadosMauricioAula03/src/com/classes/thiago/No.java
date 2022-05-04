package com.classes.thiago;


public class No {
	
	private String nome;
	private String curso;
	private No prox;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String c) {
		curso = c;
	}
	
	public No getProx() {
		return prox;
	}
	
	public void setProx(No a) {
		prox = a;
	}
}
