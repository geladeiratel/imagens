package aula10prog2;

public class Main {
	
	public static void main(String [] args){
						
		//Forma p = new Forma(); //Forma nao pode ser instanciada
		Forma p;
		
		p = new Circulo(); //Trata subclasse (mais especifico) como objeto da superclasse (menos especifico)
		System.out.println(p.getTipo());
		
		p = new Quadrado();
		System.out.println(p.getTipo());
		
		p = new Triangulo();
		System.out.println(p.getTipo());
		
		
		Forma [] vetor = { new Circulo(), new Quadrado(), new Triangulo() };
		for(int i=0; i<vetor.length; i++ )
			System.out.println(vetor[i].getTipo());
		
	}
}
