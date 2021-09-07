import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Bat extends Enemigos {
	Image Bat;
	public int x1=630;
	public int y1=360;
	public int x2=570;
	public int y2=420;
	public int batarriba = 630;
	public int batarriba2 = 570;
  public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Bat, x1, y1, ancho, alto, null);
		grafico.drawImage(Bat, x2, y2, ancho, alto, null);
	        movimientobat();
	}
  private void cargarImag() {
		Bat = new ImageIcon("src\\Imagenes\\Bat.gif").getImage();
	}
public void movimientobat() {
		if (Juego.contadorbat==0 ) {
			if (batarriba>300) {
				x1 = x1-30;
				batarriba = batarriba-30;
			}else {
					batarriba-=30;
					x1 = x1+30;
					if (x1==630) {
						batarriba = 630;
					}
		}
			if (batarriba2>510) {
				x2 = x2-30;
				batarriba2 = batarriba2-30;
			}else {
					batarriba2-=30;
					x2 = x2+30;
					if (x2==570) {
						batarriba2 = 570;
					}
		}
	                
	}
}
}
