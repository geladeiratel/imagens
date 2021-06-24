package aula10prog8;

//Final: ninguem pode extender essa classe
public final class Chefe extends Empregado {
	
	private double salario;
	
	public Chefe( String nome, String sobrenome, double salario, Data data){
		super(nome,sobrenome);
		setSalario(salario);
		super.setDataNascimento(data);
	}

	public void setSalario(double salario){
		this.salario = ( salario > 0 ? salario : 0); 
	}
	
	public double pagamento(){
		return salario;
	}
	
	public String toString(){
		return "Chefe: " + super.toString();
	}
}
