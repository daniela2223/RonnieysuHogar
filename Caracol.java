import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Caracol extends Enemigos {
	Image Caracol;
	public int x1=120;
	public int y1=390;
	public int x2=630;
	public int y2=30;
	
	public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Caracol, x1, y1, ancho, alto, null);
		grafico.drawImage(Caracol, x2, y2, ancho, alto, null);
		movimientocaracol();
	}

	private void cargarImag() {
		Caracol = new ImageIcon("src\\Imagenes\\Caracol.gif").getImage();
	}
}
