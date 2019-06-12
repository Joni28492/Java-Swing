/*Disponer dos objetos de la clase JButton con las etiquetas:
 *  "varón" y "mujer",
 *  al presionarse mostrar en la barra de títulos del JFrame
 *   la etiqueta del botón presionado.
 */

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	JButton btn1, btn2;
	
	public Formulario() {
		
		setLayout(null);
		btn1=new JButton ("varon");
		btn1.setBounds(10, 100, 90, 30);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2=new JButton ("mujer");
		btn2.setBounds(110, 100, 90, 30);
		add(btn2);
		btn2.addActionListener(this);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1) {
			setTitle("varon");
		}
		if(e.getSource()==btn2) {
			setTitle("mujer");
		}
		
		
	}
	
	
	public static void main(String [] args) {
		
		Formulario formulario1 =new Formulario();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		
		
		
		
	}
	
	

}
