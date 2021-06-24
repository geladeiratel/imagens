package aula10prog10;

public class Bicicleta implements EmissaoCarbono {

	private int aro;
	
	public Bicicleta(int aro) {
		setAro(aro);
	}
	
	public int getAro(){
		return aro;
	}
	public void setAro(int aro){
		this.aro = aro;
	}

	@Override
	public double getEmissaoCarbono() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return "Bicicleta Aro: " + getAro();
	}

}
