package javaxSwingJCheckBox2;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;



public class Formulario extends JFrame implements ActionListener, ChangeListener {

	private JLabel label1;
	private JCheckBox check1;
	private JButton boton1;
	
	public Formulario() {
		
		setLayout(null);
		label1=new JLabel("esta de acuerdo con las normas o servicios");
		label1.setBounds(10,10,400,30);
		add(label1);
		
		check1=new JCheckBox("Acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1= new JButton("Continuar");
		boton1.setBounds(10,100,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
	}
	
	public void stateChanged(ChangeEvent e) {
		
		if(check1.isSelected()==true) {
			boton1.setEnabled(true);
		}
		else {
			boton1.setEnabled(false);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		
		Formulario formulario1= new Formulario();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		
	}
	
	
	
}
