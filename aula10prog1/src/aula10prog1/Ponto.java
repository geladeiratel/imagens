package aula10prog1;

public class Ponto extends Forma{

	//Acessivel apenas no package + subclasses
	protected int x, y;	
	
	private static int contador;
	
	protected void finalize(){
		contador--;
		System.out.println("Fim do Ponto");
	}
	public static int getContador(){ //Sem o static aqui, nao funciona
		return contador;
	}
	
	public Ponto() {
		
		//Primeiro método invocado eh sempre o construtor da Superclasse
		//Chamada implicita ao construtor da Superclasse nesta linha
		setPonto(0,0);		
		
	}
	public Ponto(int x, int y){
		setPonto(x,y);
		contador++;
	}
	
	public void setPonto (int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
}
