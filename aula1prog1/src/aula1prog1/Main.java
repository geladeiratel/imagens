package aula1prog1;

public class Main {
        
	public float variavelInstancia;
	
	public static void main(String[] args) {
		
		System.out.println("Ola mundo!");
		
		Main obj = new Main();
		System.out.println(obj.calcular());
		System.out.println(obj.comparar(1.2f, 1.2f));
		obj.atribuir(1.2f);
	}
	
	/*
	 * TODO: 1) Crie um metodo toString que imprima 
	 * "Ola 'Engenharia de Computacao'" com cada string em uma linha separada
	 */
	public String toString(){
		return "Ola\n\'Engenharia\nde\nComputacao\'";
	}
	
	/*
	 * TODO: 2) Crie um metodo 'imprimir' que retorne 'SIM' se a string fornecida
	 * eh igual a "Engenharia de Computacao" e retorne 'NAO' caso contrario.
	 */
	public String imprimir(String texto){
		String resultado="NAO";
		if (texto.equals("Engenharia de Computacao"))
			resultado = "SIM";
		return resultado;
	}

	/*
	 * TODO: 3) Crie o metodo 'calcular' que retorna o resultado da seguinte expressao:
	 *          7 + 7 / ( 7 + 7 ). O resultado esperado eh 7.5
	 *           
	 */
	public float calcular(){
		float expressao =  7 + 7 / (float)(7 + 7);		
		return expressao;
	}
	
	/*
	 * TODO: 4) Crie um metodo 'comparar' que receba dois numeros reais e
	 *          retorne 1 caso os numeros sejam iguais e 2 caso sejam diferentes.
	 */
	public int comparar(float a, float b){
		
		int resultado=0;
		if(a==b)
			resultado=1;
		else
			if (a!=b)
				resultado=2;
		
		return resultado;
	}
	
	/*
	 * TODO: 5) Crie um metodo 'atribuir' que receba e atribua um valor real
	 *          de precisao simples ah variavel de instancia  
	 * 
	 */
	public void atribuir(float valor){
		this.variavelInstancia = valor;
	}
}
