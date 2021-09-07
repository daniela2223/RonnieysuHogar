import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana3 {
  public Ventana3() {
	  JFrame ventana3 = new JFrame();
		JPanel panel2 = new JPanel();
		panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel2.setLayout(null);
		ventana3.setSize(900,640);
        ventana3.setLocation(300,200);
        ventana3.setVisible(true);
        ventana3.setResizable(false);
        ventana3.setLocationRelativeTo(null);
        ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana3.add(panel2);
        JLabel lblFondo2 = new JLabel("");
		lblFondo2.setBounds(0, 0, 900, 640);
		lblFondo2.setIcon(new ImageIcon("src\\Imagenes\\ventana5.png"));
		panel2.add(lblFondo2);
		JButton atras = new JButton("");
		atras.setIcon(new ImageIcon("src\\Imagenes\\flecha22.png"));
		atras.setBounds(0, 551, 88, 54);
		panel2.add(atras);
		atras.setVisible(true);
		
		JButton adelante = new JButton("");
		adelante.setIcon(new ImageIcon("src\\Imagenes\\flecha11.png"));
		adelante.setBounds(800, 550, 86, 60);
		panel2.add(adelante);
		adelante.setVisible(true);
		adelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana3.dispose();
			}
		});
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ventana2();
			}
		});
    Juego.prueba =2;
	}

	
}
