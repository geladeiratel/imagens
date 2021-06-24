package aula10prog6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main2 extends JFrame {
	
	private static final long serialVersionUID = 1L; //GUI com identificador unico 
	private Hora3 hora;
	private JLabel rotuloHora, rotuloMinuto, rotuloSegundo;
	private JTextField campoHora, campoMinuto, campoSegundo, campoDisplay;
	private JButton botaoSair;
	
	public Main2() {		
		super ("Classe Interna Anônima"); //Titulo da Janela
	
		hora = new Hora3();
		//ClasseInterna ouvinte = new ClasseInterna();
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		rotuloHora = new JLabel("Hora");		
		campoHora = new JTextField(10);
		//campoHora.addActionListener(ouvinte);
		campoHora.addActionListener(
				
				//Classe interna anonima que implementa a interface 'ActionListener'
				new ActionListener(){
					
					public void actionPerformed( ActionEvent evento ){
						hora.setHora( Integer.parseInt(evento.getActionCommand()) );
						campoHora.setText(hora.getHora()+"");
						campoDisplay.setText("A Hora é: " + hora);
					}//fim metodo					
				}//fim classe anonima				
		);//fim metodo
		
		container.add(rotuloHora);
		container.add(campoHora);
		
		rotuloMinuto = new JLabel("Minuto");		
		campoMinuto = new JTextField(10);
		//campoMinuto.addActionListener(ouvinte);
		campoMinuto.addActionListener(
				//Classe interna anonima que implementa a interface 'ActionListener'
				new ActionListener(){
					
					public void actionPerformed( ActionEvent evento ){
						hora.setMinuto( Integer.parseInt(evento.getActionCommand()) );
						campoMinuto.setText(hora.getMinuto()+"");
						campoDisplay.setText("A Hora é: " + hora);
					}//fim metodo					
				}//fim classe anonima				
		);//fim metodo
		container.add(rotuloMinuto);
		container.add(campoMinuto);
		
		rotuloSegundo = new JLabel("Segundo");		
		campoSegundo = new JTextField(10);
		//campoSegundo.addActionListener(ouvinte);
		campoSegundo.addActionListener(
				//Classe interna anonima que implementa a interface 'ActionListener'
				new ActionListener(){
					
					public void actionPerformed( ActionEvent evento ){
						hora.setSegundo( Integer.parseInt(evento.getActionCommand()) );
						campoSegundo.setText(hora.getSegundo()+"");
						campoDisplay.setText("A Hora é: " + hora);
					}//fim metodo					
				}//fim classe anonima				
		);//fim metodo
		container.add(rotuloSegundo);
		container.add(campoSegundo);
		
		campoDisplay = new JTextField(30);
		campoDisplay.setEditable(false);
		container.add(campoDisplay);
		
		botaoSair = new JButton("Sair");
		botaoSair.addActionListener(
				//Classe interna anonima que implementa a interface 'ActionListener'
				new ActionListener(){
					
					public void actionPerformed( ActionEvent evento ){
						System.exit(0);
					}//fim metodo					
				}//fim classe anonima				
		);//fim metodo
		container.add(botaoSair);		
		
	}//fim construtor

	public static void main(String [] args){
		
		Main2 main = new Main2();
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
