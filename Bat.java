import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Bat extends Enemigos {
	Image Bat;
	public int x1=630;
	public int y1=360;
	public int x2=570;
	public int y2=420;
  public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Bat, x1, y1, ancho, alto, null);
		grafico.drawImage(Bat, x2, y2, ancho, alto, null);
	}
  private void cargarImag() {
		Bat = new ImageIcon("src\\Imagenes\\Bat.gif").getImage();
	}
}
