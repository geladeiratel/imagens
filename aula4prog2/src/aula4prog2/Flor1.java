package aula4prog2;

public class Flor1 {

	private String nome;
	private int tamanho;
	private String cor;
	
	public Flor1() {
		setFlor("Não informado",0,"Indefinida");
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
