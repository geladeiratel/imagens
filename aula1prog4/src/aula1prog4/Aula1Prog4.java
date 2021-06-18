package aula1prog4;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Aula1Prog4 {

	public static void main(String[] args) {

		String mensagem = "Ola\nMundo!";
		String titulo = "Titulo da Janela";
		
		// null: nenhum icone serah utilizado		
		JOptionPane.showMessageDialog(null, mensagem);
		
		JOptionPane.showMessageDialog(null, mensagem, 
				titulo, JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, mensagem,
				titulo, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mensagem, 
				titulo, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, mensagem,
				titulo, JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, mensagem,
				titulo, JOptionPane.WARNING_MESSAGE);

		System.exit(0);

	}
}
