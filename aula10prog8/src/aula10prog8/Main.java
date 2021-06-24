package aula10prog8;

public class Main {
	
	public static void main(String [] args){
		
		Chefe c = new Chefe("Joao", "da Silva", 25000,new Data(1,1,2001));
		Balconista b = new Balconista("Maria","da Silva",600,new Data(1,2,2001));
		Estagiario e1 = new Estagiario("Antonio","da Silva",600,10,5,new Data(1,3,2001));
		Estagiario e2 = new Estagiario("Silva","da Silva",600,10,2,new Data(1,12,2001));
		
		Empregado [] e = { c, b, e1, e2 }; //Polimorfismo
		
		for(int i=0; i<13;i++)
			for(int j=0;j<e.length;j++)
				if(e[j].getDataNascimento().getMes()==i)					
					System.out.println(e[j] + " Pagamento: " + (e[j].pagamento()+100) + " Feliz aniversário");
				else
					System.out.println(e[j] + " Pagamento: " + e[j].pagamento());
				
	}//fim main

}//fim classe
