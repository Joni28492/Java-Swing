/*Ingresar el nombre de usuario y clave en 
 * controles de tipo JTextField. Si se ingresa las cadena 
 * (usuario: "juan", clave: "abc123") luego mostrar en el
 *  título del JFrame el mensaje "Correcto"
 *  en caso contrario mostrar el mensaje "Incorrecto". 
 */
import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener {
    private JLabel label1,label2;
    private JTextField textfield1,textfield2;
    private JButton boton1;
    public Formulario() {
        setLayout(null);
        label1=new JLabel("Nombre:");
        label1.setBounds(10,10,100,30);
        add(label1);
        label2=new JLabel("Clave:");
        label2.setBounds(10,50,100,30);
        add(label2);
        textfield1=new JTextField();
        textfield1.setBounds(130,10,100,30);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(130,50,100,30);
        add(textfield2);
        boton1=new JButton("Confirmar");
        boton1.setBounds(10,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            if (cad1.equals("juan")==true && cad2.equals("abc123")==true) {
                setTitle("Correcto");
            } else {
                setTitle("Incorrecto");
            }
        }
    }
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,260,200);
        formulario1.setVisible(true);
    }    
}