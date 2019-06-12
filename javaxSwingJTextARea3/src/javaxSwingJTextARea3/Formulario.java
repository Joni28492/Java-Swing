package javaxSwingJTextARea3;

import javax.swing.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener {
	
	private JScrollPane scrollpane1, scrollpane2;
	private JTextArea textarea1,textarea2;
	private JButton boton1;
	
	public Formulario() {
		
		setLayout(null);
		textarea1=new JTextArea();
		scrollpane1= new JScrollPane(textarea1);
		scrollpane1.setBounds(10,10,200,140);
		add(scrollpane1);
		
		textarea2= new JTextArea();
		scrollpane2=new JScrollPane(textarea2);
		scrollpane2.setBounds(220,10,200,140);
		add(scrollpane2);
		
		
		boton1=new JButton("verificar contenido");
		boton1.setBounds(10,170,150,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
			String texto1=textarea1.getText(), texto2=textarea2.getText();
			
			if(texto1.equals(texto2)==true) {
				setTitle("los 2 controles tienen el mismo texto");
			}
			else {
				setTitle("no son iguales");
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Formulario formulario1= new Formulario();
		formulario1.setBounds(0,0,500,255);
		formulario1.setVisible(true);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
