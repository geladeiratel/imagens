package aula3prog2;

import java.util.Scanner;

public class Aula3Prog2 {	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		double angulo=0, radiano=0; //Angulo em graus		

		System.out.print("Angulo: ");
		angulo = entrada.nextDouble();	
		
		radiano = angulo* Math.PI/180; //Conversao do angulo em graus para radianos
				
		System.out.println("Cosseno de " + angulo + " eh: " + Math.round(Math.cos(radiano)));
		System.out.println("Seno de " + angulo + " eh: " + Math.round(Math.sin(radiano)));
		
		//

	}

}
