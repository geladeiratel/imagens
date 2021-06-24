package aula10prog4;

public class Main {
	
	public static void main(String [] args){
		
		Chefe c = new Chefe("Joao", "da Silva", 25000);
		Balconista b = new Balconista("Maria","da Silva",600);
		Estagiario e1 = new Estagiario("Antonio","da Silva",600,10,5);
		Estagiario e2 = new Estagiario("Silva","da Silva",600,10,2);
		
		Empregado [] e = { c, b, e1, e2 }; //Polimorfismo
		
		System.out.println("Antes:");
		for(int i=0;i<e.length;i++)
			System.out.println(e[i] + " Pagamento: " + e[i].pagamento());
		
		//Eh possivel tornar um Estagiario um Chefe?
		Empregado n1 = e1; //Empregado (superclasse, menos especifico) <- recebe subclasse (mais especifico)		

		n1 = c; //Recebe o que falta
		n1.setNome("Antonio"); n1.setSobrenome("da Silva"); //Cuidado com os metodos mutadores
		c = (Chefe) n1;
		//System.out.println("Novo chefe: " + c + " Pagamento: " + c.pagamento());
		
		//Eh possivel tornar o Chefe um Estagiario?
		Empregado n2 = c; //Subiu um nivel na hierarquia
		
		n2 = e1; //Recebe o que falta
		n2.setNome("Joao"); n2.setSobrenome("da Silva"); //Apenas Empregado tem metodos mutadores
		e1 = (Estagiario) n2;
		//System.out.println("Novo estagiario: " + e1 + " Pagamento: " + e1.pagamento());
		
		System.out.println("Depois:");
		for(int i=0;i<e.length;i++)
			System.out.println(e[i] + " Pagamento: " + e[i].pagamento());
		
		
		
	}//fim main

}//fim classe
