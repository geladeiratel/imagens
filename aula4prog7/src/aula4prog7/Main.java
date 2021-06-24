package aula4prog7;

public class Main {

	public static void main(String [] args){
		
		Empregado e1 = new Empregado();				
		e1.setNome("Joao").setSobrenome("da Silva").
			setDataNascimento(1, 1, 2000).
			setDataContratacao(2, 2, 2021);		
		System.out.println(e1 + " " + e1.getContador());
		
		Empregado e2 = new Empregado();
		e2.setNome("Maria").setSobrenome("da Silva").
		setDataNascimento(1, 1, 2000).
		setDataContratacao(2, 2, 2021);		
		System.out.println(e2 + " " + e2.getContador());
		
		//Marca o objeto para o Garbage Collector
		//Soh funciona se nao ha mais referencias para o objeto
		e1 = null;
		e2 = null;
		
		System.gc(); //Sugere a chamada do Garbage Collector
		
		//Valores impressos aqui podem variar,
		//   caso o Garbage Collector tenha sido realizado com atraso
		System.out.println("\nObjetos ativos: " + Empregado.getContador());
		
	}
}
