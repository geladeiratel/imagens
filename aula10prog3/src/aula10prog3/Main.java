package aula10prog3;

public class Main {

	public static void main(String [] args){
		
		Rosa r = new Rosa(1,"vermelha",31,05,2021);		
		System.out.println(r);
		System.out.println(r.getNome() + " " + r.getTamanho());
		
		Margarida m = new Margarida(2,"amarela",31,05,2021);
		System.out.println(m);
		
		Flor f = r;
		r = (Rosa) f;
		
		//Garbage collector		
		r=null;
		m=null;
		System.gc();		
		
	}
}
