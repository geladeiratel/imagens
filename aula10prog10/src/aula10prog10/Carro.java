package aula10prog10;

public class Carro implements EmissaoCarbono{

	private double consumo;
	
	public Carro(double consumo) {
		setConsumo(consumo);
	}

	public double getConsumo(){
		return this.consumo;
	}
	public void setConsumo(double consumo){
		this.consumo = ( consumo > 0 ? consumo : 0);
	}	
	
	@Override
	public double getEmissaoCarbono() {
		// TODO Auto-generated method stub
		return this.consumo * 10;
	}
	
	public String toString(){
		return "Carro Consumo: " + getConsumo();
	}
}
