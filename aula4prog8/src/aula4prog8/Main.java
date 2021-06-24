package aula4prog8;

public class Main {

	public static void main(String [] args){
		
		Flor e1 = new Flor();		
		e1.setFlor("rosa", 1, "vermelha").setDataCompra(29, 5, 2021);				
		System.out.println(e1 + " " + e1.getContador());
		
		Flor e2 = new Flor();		
		e2.setFlor("rosa", 1, "vermelha").setDataCompra(29, 5, 2021);				
		System.out.println(e2 + " " + e2.getContador());
		
		Flor e3 = new Flor();		
		e3.setFlor("rosa", 1, "vermelha").setDataCompra(29, 5, 2021);				
		System.out.println(e3 + " " + e3.getContador());
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		System.gc();
		
		System.out.println("\nContador: " + Flor.getContador());
		
	}
}
