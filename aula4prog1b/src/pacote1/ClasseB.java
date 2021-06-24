package pacote1;

public class ClasseB {	

	public static void main(String[] args) {
		ClasseA objetoA = new ClasseA();
		
		//Modificadores de Acesso
		
		//Public
		System.out.println(objetoA.primeiro);
		
		//Protected
		System.out.println(objetoA.segundo);
		
		//Sem modificador
		System.out.println(objetoA.terceiro);
		
		//Private
		//Sem acesso
		//System.out.println(objetoA.quarto);		

	}

}
