package aula4prog2;

public class FlorTeste1 {

	public static void main(String [] args){
		
		Flor1 flor = new Flor1();
		System.out.println(flor);
		
		flor.setFlor("rosa", 19, "vermelha");
		System.out.println(flor.nomeCientificoFlor());
				
		System.out.println(flor);
		
	}
	
}
