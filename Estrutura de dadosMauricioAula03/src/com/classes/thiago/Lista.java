package com.classes.thiago;


public class Lista {

	public No Inicio;
	
	public void criaLista() {
		Inicio = null;
	}
	
	public void Ins_Inicio(String n, String c) {
		
		No p = new No();
		
		p.setNome(n);
		p.setCurso(c);
		p.setProx(Inicio);
		Inicio = p;
	}
	
	public void Ins_Fim(String n, String c) {
		
		No p = new No(); // p ser� o n� a ser inserido
		No q = Inicio;
		
		p.setNome(n);
		p.setCurso(c);
		p.setProx(null);
		
		if (Inicio==null)
			Inicio = p;
		else {
				while (q.getProx()!=null)
				q = q.getProx();
			
			// q est� posicionado no �ltimo n� da lista
			
			// o proximo de q passa a ser p (novo n�)
			q.setProx(p);
		}
	}
	
	public void Listagem() {
		
		No p = Inicio;
		
		System.out.print("Inicio-->");
		while (p!=null) {
			System.out.print("["+p.getNome()+","+p.getCurso()+"]-->");
			p = p.getProx();
		}
		System.out.println("null");
		
	}
	
	public String Primeiro() {
		
		if (Inicio == null)
				return null;
		else
			return Inicio.getNome();
	}
	
	public boolean Rem_Inicio() {
		
		if (Inicio == null)
			return false;
		else {
			
			Inicio = Inicio.getProx();
			return true;	
		}
	}
	
	public boolean Rem_Fim() {
		No p, q=null; // ponteiros de auxilio na busca do ultimo aluno
		
		if (Inicio==null)
			return false;
		else {
		   // testando se existe apenas 1 no na lista
			
			if (Inicio.getProx()==null)
				Inicio = null;
			else {
			// muitos alunos na lista	
				p = Inicio;
				//enquanto p n�o for o ultimo aluno
				while (p.getProx()!=null) {
					q = p;
					p = p.getProx();
				}
				// p � o ultimo e q � o penultimo
				// q passa a ser o utlimo aluno
				q.setProx(null);
			}
			return true;
		}
			
	} // fim da Rem_Fim
	
	public No Consulta(String nome) {
		
		No p = Inicio;
		
		while ((p!=null) && ( ! p.getNome().equals(nome) ) )
			p = p.getProx();
		
		return p;
	}
	
	public void Ins_Depois(No r, String nome, String curso) {
		
		No p = new No(); // alocando memoria para p (vazia)
		
		p.setNome(nome);
		p.setCurso(curso);
		
		p.setProx(r.getProx());
		
		r.setProx(p);
	}
	
	public void Ins_Antes(No r, String nome, String curso) {
		
		No p = new No();
		
		p.setNome(nome);
		p.setCurso(curso);
		p.setProx(r);
		
		No q = Inicio;
		while (q.getProx()!=r)
			q = q.getProx();
		
		q.setProx(p);
		
	}
	
	public void Rem_Meio(No r) {
		
		No q = Inicio;
		
		while (q.getProx()!=r) 
		{
			q = q.getProx();
		
		q.setProx(r.getProx());
		}
	}
	
	
	public No Ins_Ord (No r, String n, String c) {
		 		
		if( r == null) {
			return  new No();
			}
			else if (r.getNome().compareTo(n)>0){
				r.setNome(n);
				r.setCurso(c);
				r.setProx(Inicio);
				return r;
				}
				 else
				r= Ins_Ord(r.getProx(),n, c);
			return r;
		
}}







