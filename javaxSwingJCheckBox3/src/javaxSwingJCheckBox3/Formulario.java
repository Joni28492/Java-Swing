package javaxSwingJCheckBox3;
import javax.swing.*;
import java.awt.event.*;




public class Formulario extends JFrame implements ActionListener{

	private JCheckBox check1,check2,check3;
	private JButton boton1;
	
	public Formulario() {
		setLayout(null);
		check1=new JCheckBox("Chrome");
		check1.setBounds(10,10,150,30);
		add(check1);
		check2=new JCheckBox("Firefox");
		check2.setBounds(10,50,150,30);
		add(check2);
		check3=new JCheckBox("Opera");
		check3.setBounds(10,90,150,30);
		add(check3);
		
		boton1=new JButton("Confirmar");
		boton1.setBounds(10,130,150,30);
		boton1.addActionListener(this);
		add(boton1);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
			String cad="";
			if(check1.isSelected()==true)
				cad+="Chrome-";
			if(check2.isSelected()==true)
				cad+="Firefox-";
			if(check3.isSelected()==true)
				cad+="Opera";
			
			setTitle(cad);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		
		
	}
	
	
	
}
