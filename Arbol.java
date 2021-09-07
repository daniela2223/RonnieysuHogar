import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Arbol {
	Image Arbol;
	private int x1=690;
	private int y1=420;
	private int x2=720;
	private int y2=60;
	private int x3=510;
	private int y3=120;
	private int x4=90;
	private int y4=480;
	private int x5=300;
	private int y5=480;
	private int x6=90;
	private int y6=240;
	public final int ancho = 30;
	public final int alto = 30;

	public void paint (Graphics grafico) {
		cargarImag();
		grafico.drawImage(Arbol, x1, y1, ancho, alto, null);
		grafico.drawImage(Arbol, x2, y2, ancho, alto, null);
		grafico.drawImage(Arbol, x3, y3, ancho, alto, null);
		grafico.drawImage(Arbol, x4, y4, ancho, alto, null);
		grafico.drawImage(Arbol, x5, y5, ancho, alto, null);
		grafico.drawImage(Arbol, x6, y6, ancho, alto, null);
	}

	private void cargarImag() {
		Arbol = new ImageIcon("src\\Imagenes\\arbol.png").getImage();
	}
}
