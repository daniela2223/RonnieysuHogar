import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Felicitaciones {
public Felicitaciones() {
	JFrame felicidades = new JFrame();
	felicidades.setSize(900,640);
	felicidades.setLocation(300,200);
	felicidades.setVisible(true);
	felicidades.setResizable(false);
	felicidades.setLocationRelativeTo(null);
	felicidades.setDefaultCloseOperation(0);
	JPanel felicidadespanel = new JPanel();
	felicidadespanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	felicidadespanel.setLayout(null);
	felicidades.add(felicidadespanel);
	//boton
	JButton felicidad = new JButton("");
	felicidad.setIcon(new ImageIcon("src\\Imagenes\\SalirFinal.png"));
	felicidad.setBounds(10, 10, 146, 64);
	felicidadespanel.add(felicidad);
	felicidad.setVisible(true);
	JLabel lbl = new JLabel("");
	lbl.setBounds(0, 0, 900, 640);
	lbl.setIcon(new ImageIcon("src\\Imagenes\\Final.png"));
	felicidadespanel.add(lbl);
	
	felicidad.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
}
}
