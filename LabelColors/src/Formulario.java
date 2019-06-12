import javax.swing.*;


public class Formulario extends JFrame {
	
	private JLabel lbl1, lbl2, lbl3;
	
	public Formulario() {
		
		setLayout(null);
		lbl1=new JLabel("rojo");
		lbl1.setBounds(10,20,300,30);
		add(lbl1);
		lbl2=new JLabel("azul");
		lbl2.setBounds(10,50,300,30);
		add(lbl2);
		lbl3=new JLabel("verde");
		lbl3.setBounds(10,80,300,30);
		add(lbl3);
		
		
		
	}
	
	
	public static void main(String [] args) {
		
		Formulario formulario1= new Formulario();
		formulario1.setBounds(0,0,300,160);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
		
		
		
		
	}
	
	

}
