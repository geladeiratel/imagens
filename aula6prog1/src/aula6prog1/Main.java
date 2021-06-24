package aula6prog1;

public class Main {
	
	public static void main(String [] args){
		
		Ponto p1, p2;
		Circulo c1, c2;
		
		p1 = new Ponto(10,20);
		c1 = new Circulo(10, 20, 30);		
		System.out.println("Ponto1: " + p1 + " Circulo1: " + c1);
		
		p2 = c1; //superclasse (menos especializado) <- recebe subclasse (mais especializado)
		         //superclasse jah possuia tudo da subclasse
		System.out.println("Ponto2: " + p2);  //superclasse ganhou mais funcoes
		
		//p2 = new Ponto(1,1); //Todos os campos devem estar disponíveis no lado direito para conversão
		c2 = ( Circulo ) p2; //subclasse (mais especializado) <- recebe superclasse (menos especializado)
		                     //Destino nao possuia as informacoes mais especializadas
							 //Ambos os lados têm que ter as mesmas informações
							 //A unica coisa diferente em 'p2' eh seu tipo 'Ponto'
		                     //Eh necessario usar cast
		System.out.println("Circulo2: " + c2);
		
		A a = new A();
		B b = new B();
		
		a = b; //OK
		if( a instanceof B )
			System.out.println("SIM");
		else 
			System.out.println("NÃO");
		
		b = (B) a; //Necessario a linha de cima também.
		
		
	}
}
