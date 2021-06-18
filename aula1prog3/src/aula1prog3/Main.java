package aula1prog3;

import java.util.Scanner; //importar a classe Scanner

public class Main
{
   public float variavelInstancia;
   public static void main(String[] args)
   {
      //Cria um objeto de entrada da Classe Scanner
      Scanner entrada = new Scanner(System.in);

      int n1; 
      int n2; 
      int soma; 

      System.out.print("Primeiro numero: "); 
      n1 = entrada.nextInt(); // le o primeiro inteiro do usuario

      System.out.print("Segundo numero: "); 
      n2 = entrada.nextInt(); // le o segundo numero do usuario

      soma = n1 + n2; //soma e armazena

      System.out.printf("Soma eh %d%n", soma);
      
      //DONE1
      Main obj = new Main();
      System.out.println(obj.soma(1.3f,1.2f));
      
   } //fim do metodo main
   
   /*
    * TODO: 1) Crie um metodo 'imprimir' que receba uma String fornecida
    *          pelo usuario e retorne essa String
    * 
    */
   public String imprimir(String str){
	   return null;
   }
   
   public String toString(){
	return null;	   
   }
   
   /*
    * TODO: 2) Crie um metodo 'soma' que receba dois operandos reais de precisao simples 
    *          e retorne o resultado real com precisao simples.
    * 
    */
   public float soma(float n1, float n2){
	   
	   return -1.0f;
	   
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
   
} //fim da classe Main
