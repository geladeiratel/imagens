package aula4prog1;

public class HoraTeste2 {

	public static void main(String [] args){
		
		Hora2 h1 = new Hora2();
		Hora2 h2 = new Hora2(10);
		Hora2 h3 = new Hora2(10,55);
		Hora2 h4 = new Hora2(10,55,12);
		Hora2 h5 = new Hora2(10,55,23);
		Hora2 h6 = new Hora2(h5);
		
		System.out.println("H1: " + h1);
		System.out.println("H2: " + h2);
		System.out.println("H3: " + h3);
		System.out.println("H4: " + h4);
		System.out.println("H5: " + h5);
		System.out.println("H6: " + h6);
		
	}
	
}
