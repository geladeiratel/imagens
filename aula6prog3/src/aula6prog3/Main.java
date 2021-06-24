package aula6prog3;

public class Main {
	
	public static void main(String [] args){
				
		Circulo c1, c2;
				
		c1 = new Circulo(10, 20, 30);		
		c2 = new Circulo(10, 20, 30);
		
		System.out.println(Ponto.getContador());		
		c1=null;
		c2=null;
		System.gc();
		System.out.println(Ponto.getContador());
		
	}
}
