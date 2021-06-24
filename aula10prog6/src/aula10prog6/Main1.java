package aula10prog6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main1 extends JFrame {
	
	private static final long serialVersionUID = 1L; //GUI com identificador unico 
	private Hora3 hora;
	private JLabel rotuloHora, rotuloMinuto, rotuloSegundo;
	private JTextField campoHora, campoMinuto, campoSegundo, campoDisplay;
	private JButton botaoSair;
	
	public Main1() {		
		super ("Demonstracao de Classe Interna"); //Titulo da Janela		
		
		hora = new Hora3();
		ClasseInterna ouvinte = new ClasseInterna();
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		rotuloHora = new JLabel("Hora");		
		campoHora = new JTextField(10);
		campoHora.addActionListener(ouvinte);
		container.add(rotuloHora);
		container.add(campoHora);
		
		rotuloMinuto = new JLabel("Minuto");		
		campoMinuto = new JTextField(10);
		campoMinuto.addActionListener(ouvinte);
		container.add(rotuloMinuto);
		container.add(campoMinuto);
		
		rotuloSegundo = new JLabel("Segundo");		
		campoSegundo = new JTextField(10);
		campoSegundo.addActionListener(ouvinte);
		container.add(rotuloSegundo);
		container.add(campoSegundo);
		
		campoDisplay = new JTextField(30);
		campoDisplay.setEditable(false);
		container.add(campoDisplay);
		
		botaoSair = new JButton("Sair");
		botaoSair.addActionListener(ouvinte);
		container.add(botaoSair);
		
	}//fim construtor

	public static void main(String [] args){
		
		Main1 main = new Main1();
		main.setSize(600,150);
		main.setVisible(true);
	}
	
	private class ClasseInterna implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			if (evento.getSource() == botaoSair)
				System.exit(0);
			else if(evento.getSource() == campoHora){
					hora.setHora( Integer.parseInt(evento.getActionCommand()) );
					campoHora.setText(hora.getHora()+"");
				}
			else if(evento.getSource() == campoMinuto){
				hora.setMinuto( Integer.parseInt(evento.getActionCommand()) );
				campoMinuto.setText(hora.getMinuto()+"");
			}
			else if(evento.getSource() == campoSegundo){
				hora.setSegundo( Integer.parseInt(evento.getActionCommand()) );
				campoSegundo.setText(hora.getSegundo()+"");
			}
			campoDisplay.setText("A Hora é: " + hora);
		}//fim metodo		
		
	}//fim classe interna
	
}//fim classe
