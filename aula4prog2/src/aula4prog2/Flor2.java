package aula4prog2;

public class Flor2 {

	private String nome;
	private int tamanho;
	private String cor;
	
	public Flor2() {
		setFlor("Não informado",0,"Indefinida");
	}
	
	public Flor2(String n) {
		setFlor(n,0,"Indefinida");
	}
	
	public Flor2(String n, int t) {
		setFlor(n,t,"Indefinida");
	}
	
	public Flor2(String n, int t, String c) {
		setFlor(n,t,c);
	}
	
	public Flor2(Flor2 flor) {
		setFlor(flor.nome,flor.tamanho,flor.cor);
	}

	public void setFlor(String n, int t, String c){
		
		this.nome = n;
		this.tamanho = t;
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
