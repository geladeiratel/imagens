package aula6prog4;

public class Cilindro extends Circulo {
	
	protected double altura;
	
	public Cilindro() {
		
		setAltura(0);		
		
	}
	
	public Cilindro( double raio, int x, int y, double altura ){
		super(raio,x,y);//chamada explicita ao construtor da superclasse
		
		setAltura(altura);
	}
	
	public void setAltura(double altura){
		this.altura = ( altura >= 0 ? altura : 0);
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public double area(){
		return 	2 * super.area() + //2 * area do Circulo
				2 * Math.PI * raio * altura;
	}
	
	public double volume(){
		return super.area() * altura; //area do Circulo * altura do Cilindro
	}
	
	public String toString(){
		return super.toString() + " Altura: " + altura;
	}
	

}
