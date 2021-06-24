package aula10prog10;

import java.util.ArrayList;

public class Main {

	public static void main(String [] args){
	
		ArrayList<EmissaoCarbono> array = new ArrayList<>();
		
		array.add(new Bicicleta(15));
		array.add(new Carro(30.5));
		array.add(new Construcao(100.5));
		
		for(EmissaoCarbono i : array)
			System.out.println(i + " Emissao Carbono: " + i.getEmissaoCarbono());
		
	}

}
