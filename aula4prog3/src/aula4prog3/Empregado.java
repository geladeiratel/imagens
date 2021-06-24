package aula4prog3;

public class Empregado {

	private String nome;
	private String sobrenome;
	private Data dataNascimento;
	private Data dataContratacao;
	
	public Empregado(String nome, String sobrenome,
			int d, int m, int a,
			int dd, int mm, int aa) {
		
		setNome(nome);
		setSobrenome(sobrenome);
		setDataNascimento(d,m,a);
		setDataContratacao(dd,mm,aa);
		
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public String getNome(){
		return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	
	public void setDataNascimento(int d, int m, int a){
		dataNascimento = new Data(d,m,a);
	}
	public Data getDataNascimento(){
		return dataNascimento;
	}
	public void setDataContratacao(int dd, int mm, int aa){
		dataContratacao = new Data(dd, mm, aa);
	}
	public Data getDataContracao(){
		return dataContratacao;
	}
	
	public String toString(){
		
		return this.nome + "|" + this.sobrenome + "|"+
				"Data Contratacao: " + getDataContracao() + "|"+
				"Data Nascimento: " + getDataNascimento();
	}

}
