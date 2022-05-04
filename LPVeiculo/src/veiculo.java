
/*
 * Faça um programa em Java que crie uma classe Veículo para armazenar o 
 * Modelo, Marca e o ano
de fabricação (todos public). 
Implemente os seguintes métodos na classe:
• Construtor: para receber os valores por parâmetro
• imprimir: retornar os dados do veículo
• calcularIdade: método para retornar a idade do veículo,
 sendo que o ano atual deve ser
passado por parâmetro
Crie uma classe Principal que instancie 
um objeto da classe Veículo e mostre os dados do veículo,
bem como a idade do veículo.
 */
public class veiculo {
	public String model, marca;
	public int ano;
	
	public veiculo(String model, String marca, int ano) {
		super();
		this.model = model;
		this.marca = marca;
		this.ano = ano;
	}
	
	public String Imprime () {
		 return "Modelo "+model+" \n Marca : "+marca+" Ano : "+ano;
		 
	}
	public int idade() {
		 int id = (2020-ano);
		return id;
	}
	

}
