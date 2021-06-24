package aula4prog7;

public class Empregado {

	private String nome;
	private String sobrenome;
	private Data dataNascimento;
	private Data dataContratacao;
	
	private static int contador; //quantidade de objetos na memoria
	
	public static int getContador(){
		return contador;
	}
	
	protected void finalize(){
		contador--;
		System.out.println("\nFinalizador: " + contador);
	}

	public Empregado(){
		contador++; //Incrementa a variavel static
	}
	
	public Empregado(String nome, String sobrenome,
			int d, int m, int a,
			int dd, int mm, int aa) {
		
		setNome(nome);
		setSobrenome(sobrenome);
		setDataNascimento(d,m,a);
		setDataContratacao(dd,mm,aa);
		
	}
	
	public Empregado setNome(String n){
		this.nome = n;
		
		return this; //Para encadeamento
	}
	
	public Empregado setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
		
		return this; //Para encadeamento
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	
	public Empregado setDataNascimento(int d, int m, int a){
		dataNascimento = new Data(d,m,a);
		
		return this; //Para encadeamento
	}
	public Data getDataNascimento(){
		return dataNascimento;
	}
	
	public Empregado setDataContratacao(int dd, int mm, int aa){
		dataContratacao = new Data(dd, mm, aa);
		
		return this; //Para encadeamento
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
