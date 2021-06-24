package aula4prog2;

public class FlorTeste3 {

	public static void main(String [] args){
		
		Flor3 f1 = new Flor3();
		Flor3 f2 = new Flor3("rosa");
		Flor3 f3 = new Flor3("rosa",10);
		Flor3 f4 = new Flor3("rosa",10,"vermelha");
		Flor3 f5 = new Flor3("margarida",20,"amarela");
		Flor3 f6 = new Flor3(f5);
		
		System.out.println("F1: " + f1);
		System.out.println("F2: " + f2.nomeCientificoFlor());
		System.out.println("F3: " + f3);
		System.out.println("F4: " + f4.nomeCientificoFlor());
		System.out.println("F5: " + f5);
		System.out.println("F6: " + f6.nomeCientificoFlor());
		
		
		
	}
	
}
