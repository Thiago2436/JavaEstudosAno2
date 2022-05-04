
public class Pilha {
	private int topo;
	private int p[] = new int[10];
	
	public void criaPilha() {
		topo = -1;
	}
	
	public boolean vazia() {
		return topo==-1;
	}
	
	public boolean cheia() {
		return topo == p.length -1;
	}
	
	public boolean Push (int v) {
		
		if (!cheia()) {
			topo++;
			p[topo] = v;
			return true;
		}
		else
			return false;
	}
	
	public boolean Pop() {
		
		if (! vazia()) {
			topo--;
			return true;
		}
		else
			return false;
	}
	
	public int Topo () {
		return p[topo];
	}
	
	public void imprime() {
		int i;
		for (i= topo; i>=0; i--)
			System.out.println("[ "+p[i]+" ]");
				
	}
	
	public int Converte (int v) {
		int b = 0;
		
		while (v > 0) {
			
			Push(v%2);
			v /= 2;
		}
		
		while (!vazia()) {
			b = b*10 + Topo();
			Pop();
		}
		
		return b;
	}
	
	public boolean Capicua(int val)
	{
		int inv=0, fator = 1, aux = val;
		
		// inserindo cada algarismo na pilha.
		while (aux > 0)
		{
			Push(aux % 10);
			aux /= 10;
		}
		// inverter o numero val (com o uso da pilha)
		
		while (! vazia())
		{
			inv = inv + Topo()*fator;
			Pop();
			fator *= 10;
		}
		if (inv == val)
			return true;
		else
			return false;	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
