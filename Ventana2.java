import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana2 {
  public Ventana2() {
	  JFrame ventana2 = new JFrame();
		JPanel panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel1.setLayout(null);
		ventana2.setSize(900,640);
    ventana2.setLocation(300,200);
    ventana2.setVisible(true);
    ventana2.setResizable(false);
    ventana2.setLocationRelativeTo(null);
    ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana2.add(panel1);
    JLabel lblFondo1 = new JLabel("");
		lblFondo1.setBounds(0, 0, 900, 640);
		lblFondo1.setIcon(new ImageIcon("src\\Imagenes\\ventana3.png"));
		panel1.add(lblFondo1);
		
		JButton atras = new JButton("");
        atras.setIcon(new ImageIcon("src\\Imagenes\\flecha2.png"));
		atras.setBounds(0, 550, 81, 54);
		panel1.add(atras);
		atras.setVisible(true);
		
		JButton adelante = new JButton("");
		adelante.setIcon(new ImageIcon("src\\Imagenes\\flecha1.png"));
		adelante.setBounds(800, 549, 86, 60);
		panel1.add(adelante);
		adelante.setVisible(true);
		adelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana2.dispose();
			}
		});
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ventanas();
			}
		});
	
}
}
