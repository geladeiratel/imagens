package aula4prog2;

public class Flor3 {

	private String nome;
	private int tamanho;
	private String cor;
	
	public Flor3() {
		setFlor("Não informado",0,"Indefinida");
	}
	
	public Flor3(String n) {
		setFlor(n,0,"Indefinida");
	}
	
	public Flor3(String n, int t) {
		setFlor(n,t,"Indefinida");
	}
	
	public Flor3(String n, int t, String c) {
		setFlor(n,t,c);
	}
	
	public Flor3(Flor3 flor) {
		setFlor(flor.getNome(),flor.getTamanho(),flor.getCor());
	}

	public void setFlor(String n, int t, String c){
		
		setNome(n);
		setTamanho(t);
		setCor(c);
		
	}
	
	public String getNome(){
		return this.nome;
	}
	public int getTamanho(){
		return this.tamanho;
	}
	public String getCor(){
		return this.cor;
	}	
	public void setNome(String n){
		this.nome = n;
	}
	public void setTamanho(int t){
		this.tamanho = t;
	}
	public void setCor(String c){
		this.cor = c;
	}
	
	public String nomeCientificoFlor(){
				
		String nome=this.nome, cor=this.cor;
		int tamanho=this.tamanho;
		switch(nome){
		case "rosa": 
			nome = "Rosa Gallica";
		break;
		case "margarida": 
			nome = "Leocanthemum Vulgare";
		break;
		default:
		break;
		}
		
		return "Nome Cientifico: " + nome + 
				" Tamanho: " + tamanho + 
				" Cor: " + cor;
				
	}
	
	public String toString(){
		return "Nome: " + this.nome + 
				" Tamanho: " + this.tamanho + 
				" Cor: " + this.cor;
	}

}
