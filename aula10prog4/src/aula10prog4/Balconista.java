package aula10prog4;

//Final: ninguem pode extender essa classe
public final class Balconista extends Empregado {
	
	private double salario;	
	
	public Balconista( String nome, String sobrenome, 
			double salario){
		super(nome,sobrenome);
		setSalario(salario);
		
	}

	public void setSalario(double salario){
		this.salario = ( salario > 0 ? salario : 0 ); 
	}
	
	
	public double pagamento(){
		return this.salario;
	}
	
	public String toString(){
		return "Balconista: " + super.toString();
	}
}
