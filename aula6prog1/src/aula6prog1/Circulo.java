package aula6prog1;

public class Circulo extends Ponto {
	
	protected double raio;
	
	public Circulo() {
		
		setRaio(0);		
		
	}
	
	public Circulo( double raio, int x, int y ){
		super(x,y);//chamada explicita ao construtor da superclasse
		
		setRaio(raio);
	}
	
	public void setRaio(double raio){
		this.raio = ( raio >= 0 ? raio : 0);
	}
	
	public double getRaio(){
		return this.raio;
	}
	
	public double area(){
		return Math.PI * Math.pow(raio, 2);
	}
	
	public String toString(){
		return "["+x+","+y+"] Raio: " + this.raio;
	}
	

}
