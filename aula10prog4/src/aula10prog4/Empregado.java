package aula10prog4;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;

	//Subclasses devem implementar esse metodo
	public abstract double pagamento();
	
	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String toString(){
		return this.nome + " " + this.sobrenome;
	}

}
