package aula4prog1;

public class HoraTeste1 {

	public static void main(String [] args){
		
		Hora1 relogio = new Hora1();
		System.out.println(relogio);
		
		relogio.setHora(22, 19, 0);
		System.out.println(relogio.converterHora());
				
		System.out.println(relogio);
		
	}
	
}
