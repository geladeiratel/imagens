package aula3prog3;

import java.util.Scanner;

public class Aula3Prog3 {		

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor: ");
		double valor = entrada.nextDouble();
		
		Operacoes op = new Operacoes();
		double resultado = op.calcular(valor);
		
		System.out.println("Resultado: " + resultado);
		
		//

	}

}
