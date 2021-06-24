package aula4prog2;

public class FlorTeste2 {

	public static void main(String [] args){
		
		Flor2 f1 = new Flor2();
		Flor2 f2 = new Flor2("rosa");
		Flor2 f3 = new Flor2("rosa",10);
		Flor2 f4 = new Flor2("rosa",10,"vermelha");
		Flor2 f5 = new Flor2("margarida",20,"amarela");
		Flor2 f6 = new Flor2(f5);
		
		System.out.println("F1: " + f1);
		System.out.println("F2: " + f2.nomeCientificoFlor());
		System.out.println("F3: " + f3);
		System.out.println("F4: " + f4.nomeCientificoFlor());
		System.out.println("F5: " + f5);
		System.out.println("F6: " + f6.nomeCientificoFlor());
		
		
	}
	
}
