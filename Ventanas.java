import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventanas {
  public Ventanas() {
	  JFrame ventana1 = new JFrame();
	    JPanel panel = new JPanel();
	    panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
	ventana1.setSize(900,640);
    ventana1.setLocation(300,200);
    ventana1.setVisible(true);
    ventana1.setResizable(false);
    ventana1.setLocationRelativeTo(null);
    ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana1.add(panel);
    
    JButton btnJugar = new JButton("");
    btnJugar.setIcon(new ImageIcon("src\\Imagenes\\BotonJugar.png"));
	btnJugar.setBounds(568, 300, 147, 73);
	panel.add(btnJugar);
	btnJugar.setVisible(true);
	
	JButton btnInstrucciones = new JButton("");
	btnInstrucciones.setIcon(new ImageIcon("src\\Imagenes\\Boton2.png"));
	btnInstrucciones.setBounds(530, 425, 192, 38);
	panel.add(btnInstrucciones);
	btnInstrucciones.setVisible(true);
	
	JLabel lblFondo = new JLabel("");
	lblFondo.setBounds(0, 0, 900, 640);
	lblFondo.setIcon(new ImageIcon("src\\Imagenes\\Inicio.png"));
	panel.add(lblFondo);
	
	btnJugar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Juego.prueba =1;
			ventana1.dispose();
		}
	});
	btnInstrucciones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new Instrucciones();
}
});
  }
}
