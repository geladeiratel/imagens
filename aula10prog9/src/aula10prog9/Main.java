package aula10prog9;

import java.util.ArrayList;

public class Main {
	
	public static void main(String [] args){
						
		//Forma p = new Forma(); //Forma nao pode ser instanciada		
		
		//Resposta 1
		Forma [] vetor = { 
				new Circulo(), 
				new Triangulo(), 
				new Esfera(),
				new Cubo() };
		for(Forma i : vetor){
			if(i instanceof Forma2D)
				System.out.print("Forma2D ");							
			if(i instanceof Forma3D)
				System.out.print("Forma3D ");
			System.out.println("Tipo: " + i);
		}
		
		
		//Resposta 2
		ArrayList<Forma> v = new ArrayList<>();
		v.add(new Circulo());
		v.add(new Circulo());
		v.remove(1);
		
		for(Forma i : v)
			System.out.println(v);
	}
}
