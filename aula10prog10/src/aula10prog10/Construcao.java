package aula10prog10;

public class Construcao implements EmissaoCarbono {

	private double altura;
	
	public Construcao(double altura) {
		setAltura(altura);
	}

	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}

	@Override
	public double getEmissaoCarbono() {
		// TODO Auto-generated method stub
		return this.altura * 2;
	}
	
	public String toString(){
		return "Construcao Altura: " + getAltura();
	}
}
