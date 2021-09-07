import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Nota3 {
public Nota3() {
	JFrame notaventana3 = new JFrame();
	notaventana3.setSize(700,498);
	notaventana3.setLocation(300,200);
	notaventana3.setVisible(true);
	notaventana3.setResizable(false);
	notaventana3.setLocationRelativeTo(null);
	notaventana3.setDefaultCloseOperation(0);
	JPanel notapanel3 = new JPanel();
    notapanel3.setBorder(new EmptyBorder(5, 5, 5, 5));
    notapanel3.setLayout(null);
    notaventana3.add(notapanel3);
	//boton
	JButton btnnota3 = new JButton("");
	btnnota3.setIcon(new ImageIcon("src\\Imagenes\\xnotas.png"));
	btnnota3.setBounds(210,92 , 54, 53);
	notapanel3.add(btnnota3);
	btnnota3.setVisible(true);
	JLabel lblFondo3 = new JLabel("");
	lblFondo3.setBounds(0, 0, 700, 498);
	lblFondo3.setIcon(new ImageIcon("src\\Imagenes\\Notaestrella.png"));
	notapanel3.add(lblFondo3);
	
	btnnota3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			notaventana3.dispose();
		}
	});
}
}
