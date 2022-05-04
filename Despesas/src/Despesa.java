
public class Despesa {
	public String codigo, descricao, tipo, data;
	public float valor;
	public Despesa(String codigo, String descricao, String tipo, String data, float valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
	}
	public String imprimir ()
	{
		return "codigo : " +codigo+"\n Descrição: "+descricao+"\n Data : "+data+"\n Valor"+valor+"\nTipo : "+tipo;
	}
}
