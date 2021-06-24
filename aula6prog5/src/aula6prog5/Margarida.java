package aula6prog5;

public class Margarida extends Flor {	
		
	public Margarida(int t, String c,int d, int m, int a) {		
		super("",t,c,d,m,a);
		super.setNome("Leocanthemum Vulgare");
	}	
	
	public void finalize(){ //Sobrecarga do metodo da superclasse
		System.out.println("Finaliza " + super.getNome());
		super.finalize(); //Invoca o metodo da superclasse
	}
	
	public String toString(){
		return "Nova flor: " + super.toString();
	}
}