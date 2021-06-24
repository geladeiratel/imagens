package aula6prog1;

public class Ponto {

	//Acessivel apenas no package + subclasses
	protected int x, y;
	
	
	public Ponto() {
		
		//Primeiro método invocado eh sempre o construtor da Superclasse
		//Chamada implicita ao construtor da Superclasse nesta linha
		setPonto(0,0);
		
	}
	public Ponto(int x, int y){
		setPonto(x,y);
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
