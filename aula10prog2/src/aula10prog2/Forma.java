package aula10prog2;

public abstract class Forma {

	public final String teste; 
	
	public Forma() {
		teste="";
	}
	
	public String toString(){
		return "Forma";
	}
	
	public String getTipo(){
		return null;
	}
	
	public abstract String getTeste();

}
