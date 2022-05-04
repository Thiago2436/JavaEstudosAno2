
public class Lista {
	
	public No Inicio;
	public No Fim;
	
	public void criarLista() {
		Inicio = null;
		Fim = null;
	}
	
	public void Ins_Inicio(String n, String c) {
		
		No p = new No();
		
		p.setNome(n);
		p.setCurso(c);
		p.setProx(Inicio);
		if (Inicio==null)
			Fim=p;
		
		Inicio = p;
	}
	
	public void Ins_Fim(String n, String c) {
		
		No p = new No();  // aloca memoria para o novo aluno
		
		p.setNome(n);
		p.setCurso(c);
		p.setProx(null);
		
		if (Inicio==null)
			Inicio = p;
		else
			Fim.setProx(p);
		
		Fim = p;
			
	}
	
	public boolean Rem_Inicio() {
		
		if (Inicio == null)
			return false;
		else
		{
			if (Inicio.getProx()==null) {
				Inicio = null;
				Fim = null;
			}
			else
				Inicio = Inicio.getProx();
			
			return true;
		}
		
	}
	
	public boolean Rem_Fim() {
		
		if (Inicio==null)
			return false;
		else {
			
			if (Inicio.getProx()==null) //So existe um aluno
			{
				Inicio = null;
				Fim = null;
			}
			else {
				No q = Inicio;
				while (q.getProx()!=Fim)
					q = q.getProx();
				
				q.setProx(null);
				Fim = q;
			}
			return true;
		}	
	}
	
	public No Consultar(String n) {
		No p = Inicio;
		
		while ((p!=null) && ( ! p.getNome().equals(n)))
			p = p.getProx();
		
		return p;
	}
	
	public void Transf_Inicio(No r) {
		No q = Inicio;
		
		while (q.getProx()!=r)
			q = q.getProx();
		
		
		q.setProx(r.getProx());
		r.setProx(Inicio);
		Inicio = r;
		
		if (r==Fim)
			Fim = q;
	}
	
	public void Transf_Fim(No r) {
		No q = Inicio;
		
		if (r==Inicio)
			 Inicio = Inicio.getProx();
		else {
			while (q.getProx()!= r)
				q = q.getProx();
			
			q.setProx(r.getProx());
		}
		
		r.setProx(null);
		Fim.setProx(r);
		Fim = r;
	}
	                                                
	
	public void Rem_Meio(No r) {
		No q = Inicio;
		
		while (q.getProx()!= r)
			 q = q.getProx();
		
		q.setProx(r.getProx());	
	}
	 
	public void	Rem_Repetidos() {
		No p = Inicio;
		No q = null;
		No r = null;
	while( p != Fim) {
		q = p.getProx(); 
		do{
			if ( q.getNome().equals(p.getNome())) 
			{
				if (q!=Fim)
				{
					r = q.getProx();
					Rem_Meio(q);
	
				q = r;
				}
			else 
			{
			Rem_Fim();
			q = null();
		}
		else
			q = q.getProx();
	
	}
			while(q != null);
	p =p.getProx();
	}while( q !=Fim);
	
	}
	public void Listagem() {
		No p = Inicio;
		
		System.out.print("\nInicio-->");
		while (p!=null) {
			System.out.print("["+p.getNome()+","+p.getCurso()+"]-->");
			p = p.getProx();
		}
		System.out.println("null\n");
		
	}
	
		

}
