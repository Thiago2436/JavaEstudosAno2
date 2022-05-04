/*
 * Faça um programa em Java que crie uma classe Animal, 
 * que tenha como atributos Nome, Especie,
Raça (todos public) e como métodos:
• Construtor: que receba os dados do Animal
• imprimir: método para retornar os dados do Animal
Faça uma classe Principal que instancie 
um objeto da classe Animal leia e mostre os dados do
Animal.
 */
public class Animal {
	public String nome, esp, raça;

	public Animal(String nome, String esp, String raça) {
		super();
		this.nome = nome;
		this.esp = esp;
		this.raça = raça;
	}
	
	public String retorna() {
		return " Nome : "+nome+" Raça : "+raça+" Especie : "+esp;
	}
}
