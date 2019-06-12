package formularioJavaSwing;

import javax.swing.*;

public class Formulario extends JFrame {

	
	private JLabel label1;
	
	public Formulario() {
		setLayout(null);
		label1=new JLabel("hola Formulario.");
		label1.setBounds(10,20,200,30);
		add(label1);
		
	}
	
	
	public static void main(String[] args) {
		
		Formulario formulario1=new Formulario();
		// X, Y, largo,alto
		formulario1.setBounds(10,10,400,300);
		formulario1.setVisible(true);
		
		
		
	}
	
	
}
