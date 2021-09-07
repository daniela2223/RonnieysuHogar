import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Instrucciones {
public Instrucciones() {
	JFrame ventana5 = new JFrame();
  	JPanel panel5 = new JPanel();
  	panel5.setBorder(new EmptyBorder(5, 5, 5, 5));
	panel5.setLayout(null);
	ventana5.setSize(900,640);
	ventana5.setLocation(300,200);
	ventana5.setVisible(true);
	ventana5.setResizable(false);
	ventana5.setLocationRelativeTo(null);
	ventana5.setDefaultCloseOperation(0);
	ventana5.add(panel5);
	JButton btnnota3 = new JButton("");
	btnnota3.setIcon(new ImageIcon("src\\Imagenes\\xinst.png"));
	btnnota3.setBounds(100,150 , 69, 64);
	panel5.add(btnnota3);
	btnnota3.setVisible(true);
	JLabel lblFondo3 = new JLabel("");
	lblFondo3.setBounds(0, 0, 900, 640);
	lblFondo3.setIcon(new ImageIcon("src\\Imagenes\\Instrucciones.png"));
	panel5.add(lblFondo3);
	btnnota3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ventana5.dispose();
		}
	});


}
}
