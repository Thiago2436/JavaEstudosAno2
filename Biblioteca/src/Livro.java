import javax.swing.text.StyledEditorKit.BoldAction;

public class Livro {
	public String titulo, autor;
	public String status;
	public float Tombo;
	public Livro( String titulo, String autor,  float tombo) {
		this.titulo = titulo;
		this.autor = autor;
		this.status = "D";
		Tombo = tombo;
	}
	public String imprimir() {
		if (status.equalsIgnoreCase("d"))
		return " Titulo: "+titulo+" Tombo : "+Tombo+" Status : "+status+" Autor "+autor;
		return " status " +status+ " Emprestado ";
	}
	public Boolean emprestar()
	{
		if(status.equalsIgnoreCase("d")) {
			status ="E";
			return true;
		}
		return false;
	}
	public Boolean devolver()
	{
		if(status.equalsIgnoreCase("e")) {
			status ="d";
			return true;
		}
		return false;
	}
	
}
