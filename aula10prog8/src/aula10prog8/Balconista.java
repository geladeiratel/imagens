package aula10prog8;

//Final: ninguem pode extender essa classe
public final class Balconista extends Empregado {
	
	private double salario;	
	
	public Balconista( String nome, String sobrenome, 
			double salario, Data d){
		super(nome,sobrenome);
		setSalario(salario);
		super.setDataNascimento(d);
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
