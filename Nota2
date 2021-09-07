import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Nota2 {
public Nota2() {
	JFrame notaventana2 = new JFrame();
	notaventana2.setSize(700,498);
	notaventana2.setLocation(300,200);
	notaventana2.setVisible(true);
	notaventana2.setResizable(false);
	notaventana2.setLocationRelativeTo(null);
	notaventana2.setDefaultCloseOperation(0);
	JPanel notapanel2 = new JPanel();
    notapanel2.setBorder(new EmptyBorder(5, 5, 5, 5));
    notapanel2.setLayout(null);
    notaventana2.add(notapanel2);
	//boton
	JButton btnnota2 = new JButton("");
	btnnota2.setIcon(new ImageIcon("src\\Imagenes\\xnotas.png"));
	btnnota2.setBounds(210,92, 54, 53);
	notapanel2.add(btnnota2);
	btnnota2.setVisible(true);
	JLabel lblFondo2 = new JLabel("");
	lblFondo2.setBounds(0, 0, 700, 498);
	lblFondo2.setIcon(new ImageIcon("src\\Imagenes\\Nota2.png"));
	notapanel2.add(lblFondo2);
	
	btnnota2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			notaventana2.dispose();
		}
	});
}
}
