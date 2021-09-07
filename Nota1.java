import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Nota1 {
public Nota1() {
	JFrame notaventana1 = new JFrame();
	notaventana1.setSize(700,498);
	notaventana1.setLocation(300,200);
	notaventana1.setVisible(true);
	notaventana1.setResizable(false);
	notaventana1.setLocationRelativeTo(null);
	notaventana1.setDefaultCloseOperation(0);
	JPanel notapanel1 = new JPanel();
    notapanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
    notapanel1.setLayout(null);
    notaventana1.add(notapanel1);
	//boton
	JButton btnnota1 = new JButton("");
	btnnota1.setIcon(new ImageIcon("src\\Imagenes\\xnotas1.png"));
	btnnota1.setBounds(210, 92, 48, 47);
	notapanel1.add(btnnota1);
	btnnota1.setVisible(true);
	JLabel lblFondos = new JLabel("");
	lblFondos.setBounds(0, 0, 700, 498);
	lblFondos.setIcon(new ImageIcon("src\\Imagenes\\Nota3.png"));
	notapanel1.add(lblFondos);
	
	btnnota1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			notaventana1.dispose();
		}
	});
}
}
