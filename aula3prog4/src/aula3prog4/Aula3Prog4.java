package aula3prog4;

import javax.swing.JOptionPane;

import java.security.SecureRandom;

public class Aula3Prog4 {		

	int metodo1( int valor ){ return 0; }
	
	int metodo1( double valor ){ return 0; }
	
	public static void main(String[] args) { 

		SecureRandom numeroAleatorio = new SecureRandom(); 

		String saida = "";	
		int numero=0;
		for(int i=0;i<20;i++){
			
			numero = 1 + numeroAleatorio.nextInt(6);
			saida += numero + " ";
			
		}
		
		JOptionPane.showMessageDialog(null, saida,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
				
		//

	}

}
