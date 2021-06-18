package aula1prog2;

import java.util.Scanner; //importar a classe Scanner

public class Main
{
   
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
      Operacoes [] op = { new Soma(1,1), new Subtracao(1,1) };  
      for( Operacoes i : op)
    	  System.out.println(i.calcular());
      
   } //fim do metodo main
   
   /*
    * TODO: 1) Crie um metodo 'calculadora' que receba dois operandos reais de precisao simples 
    *          e um operador 
    *          e retorne o resultado real com precisao simples.
    * 
    */
   public String imprimir(String str){
	   return null;
   }
   
} //fim da classe Main
