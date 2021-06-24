package aula10prog4;

//Final: ninguem pode extender essa classe
public final class Estagiario extends Empregado {
	
	private double salario;
	private double comissao;
	private int numeroVendas;
	
	public Estagiario( String nome, String sobrenome, 
			double salario, double comissao, int numeroVendas){
		super(nome,sobrenome);
		setSalario(salario);
		setComissao(comissao);
		setNumeroVendas(numeroVendas);
	}

	public void setSalario(double salario){
		this.salario = ( salario > 0 ? salario : 0 ); 
	}
	
	public void setComissao(double comissao){
		this.comissao = ( comissao > 0 ? comissao : 0 );
	}
	
	public void setNumeroVendas(int numeroVendas){
		this.numeroVendas = ( numeroVendas > 0 ? numeroVendas : 0 );
	}
	
	public double pagamento(){
		return this.salario + this.comissao * this.numeroVendas;
	}
	
	public String toString(){
		return "Estagiario: " + super.toString();
	}
}
