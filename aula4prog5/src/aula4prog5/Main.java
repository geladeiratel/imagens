package aula4prog5;

public class Main {

	public static void main(String [] args){
		
		Empregado e = new Empregado();
		
		e.setNome("Joao").setSobrenome("da Silva").
			setDataNascimento(1, 1, 2000).
			setDataContratacao(2, 2, 2021);
				
		System.out.println(e);
		
	}
}
