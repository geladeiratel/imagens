package aula3prog1;

public class Flor {

	//Variaveis de instancia
	private String nome;
	private String cor;
	private int tamanho;
		
	public Flor(String nome, String cor, int tamanho) {
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
	}	
	
	public String getNome(){
		return this.nome;
	}

}
