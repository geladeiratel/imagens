package aula1prog2;

public abstract class Operacoes {
        	
	protected float op1;
	protected float op2;
	public Operacoes(float op1, float op2){
		this.op1 = op1;
		this.op2 = op2;
		
	}
	public abstract float calcular();	
}
