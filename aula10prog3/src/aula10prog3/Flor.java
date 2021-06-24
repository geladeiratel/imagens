package aula10prog3;

public abstract class Flor extends Planta{

	private String nome;
	private int tamanho;
	private String cor;
	
	private Data dataCompra;	
	
	private static int contador; //quantidade de objetos na memoria
	
	
	public String local(){
		return null;
	}
	public boolean vazo(){
		return false;
	}	
	
	public static int getContador(){ //sem o static aqui, nao funciona
		return contador;
	}
	
	protected void finalize(){
		contador--;
		System.out.println("\nFinalizador: " + contador);
	}

	public Flor(){
		//contador++; //Incrementa a variavel static
	}
	
	public Flor(String n, int t, String c, 
			int d, int m, int a) {		
		
		setFlor(n,t,c);
		setDataCompra(d,m,a);
		
		contador++;
	}
	
	public Flor setFlor(String n, int t, String c){
		
		setNome(n);
		setTamanho(t);
		setCor(c);
		
		return this;
	}
	
	public Flor setDataCompra(int d, int m, int a){
		dataCompra = new Data(d,m,a);
		
		return this;
	}
	public Data getDataCompra(){
		return dataCompra;
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
	
	/*public String nomeCientificoFlor(){
				
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
	*/
	public String toString(){
		return "Nome: " + getNome() + 
				" Tamanho: " + getTamanho() + 
				" Cor: " + getCor() + "|" +
				"Data Compra: " + getDataCompra();
	}
}