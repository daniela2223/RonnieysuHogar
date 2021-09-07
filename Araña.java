import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Araña extends Enemigos {
	Image Araña;
	public int x1=720;
	public int y1=540;
	public int x2=30;
	public int y2=30;
	public int x3=240;
	public int y3=480;

  public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Araña, x1, y1, ancho, alto, null);
		grafico.drawImage(Araña, x2, y2, ancho, alto, null);
		grafico.drawImage(Araña, x3, y3, ancho, alto, null);

	}
  private void cargarImag() {
		Araña = new ImageIcon("src\\Imagenes\\Araña.gif").getImage();
	}
}
