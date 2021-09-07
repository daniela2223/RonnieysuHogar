import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Lago {
	Image Lago;
	private int x1=690;
	private int y1=210;
	private int x2=90;
	private int y2=330;
	private int x3=360;
	private int y3=180;
	public final int ancho = 60;
	public final int alto = 30;

	public void paint (Graphics grafico) {
		cargarImag();
		grafico.drawImage(Lago, x1, y1, ancho, alto, null);
		grafico.drawImage(Lago, x2, y2, ancho, alto, null);
		grafico.drawImage(Lago, x3, y3, ancho, alto, null);
	}

	private void cargarImag() {
		Lago = new ImageIcon("src\\Imagenes\\Lago y pez.png").getImage();
	}
}
