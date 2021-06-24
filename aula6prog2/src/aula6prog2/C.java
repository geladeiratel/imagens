package aula6prog2;

public class C extends B{

	protected int varc;	
	public C() {
		// implicitamente invoca o construtor da superclasse B		
		varc = 30;
	}
	
	public String toString(){
		return "Estou em C: " + vara + " " + varb + " " + varc;
	}

}
