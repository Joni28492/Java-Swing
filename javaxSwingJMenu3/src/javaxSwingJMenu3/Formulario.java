package javaxSwingJMenu3;

import javax.swing.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener {

	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1,mi2;
	private JTextField tf1,tf2;
	
	public Formulario() {
		setLayout(null);
		
		mb= new JMenuBar();
		setJMenuBar(mb);
		menu1=new JMenu ("opciones");
		mb.add(menu1);
		mi1=new JMenuItem("redimensionar ventana");
		menu1.add(mi1);
		mi1.addActionListener(this);
		mi2=new JMenuItem("salir");
		menu1.add(mi2);
		mi2.addActionListener(this);
		
		tf1=new JTextField();
		tf1.setBounds(10,10,100,30);
		add(tf1);
		
		tf2=new JTextField();
		tf2.setBounds(10,50,100,30);
		add(tf2);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mi1) {
			String cad1=tf1.getText(), cad2=tf2.getText();
			int alto=Integer.parseInt(cad1);
			int ancho=Integer.parseInt(cad2);
			setSize(ancho,alto);
			
		}
		
		if(e.getSource()==mi2) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,300,200);
		formulario1.setVisible(true);;
		
	}
	
	
	
	
	
}
