package excursão;

public class excursao {
	public String codigo,destino,transoporte,data;
	public float valor;
	public int vagas, reservas;
	
	public excursao(String codigo, String destino, String transoporte, String data, float valor, 
			int vagas) {
		
		this.codigo = codigo;
		this.destino = destino;
		this.transoporte = transoporte;
		this.data = data;
		this.valor = valor;
		this.vagas = vagas;
		this.reservas = 0;
	}
	public String imprimir() {
		return "codigo : "+codigo+"destino "+destino+"transporte "
	+transoporte+"data "+data+"valor : "+valor+"vagas"
	+vagas+"reservas"+reservas+"disponiveis"+(vagas-reservas);
		
	}
	public boolean reservar(int res) {
		int disp = (vagas -reservas);
		if(res<=disp) {
			reservas += res;
			}
		return false;
	}

}
