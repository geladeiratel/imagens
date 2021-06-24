package aula10prog8;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;

	private Data dataNascimento;
	
	//Subclasses devem implementar esse metodo
	public abstract double pagamento();
	
	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}
	
	public void setDataNascimento(Data d){
		this.dataNascimento = new Data(d.getDia(),d.getMes(),d.getAno());
	}
	public Data getDataNascimento(){
		return this.dataNascimento;
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
