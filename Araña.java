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
public void movimientoarañas() {
		if (Juego.contadoraraña==0) {
			if (arriba1>270) {
				y1 = y1-30;
				arriba1 = arriba1-30;
			}else {
					arriba1-=30;
					y1 = y1+30;
					if (y1==540) {
						arriba1 = 540;
					}
			}
			if (arriba2<570) {
				x2 = x2+30;
				arriba2 = arriba2+30;
			}else {
					arriba2+=30;
					x2 = x2-30;
					if (x2==30) {
						arriba2 = 30;
					}
			}
			if (arriba3>90) {
				y3 = y3-30;
				arriba3 = arriba3-30;
			}else {
					arriba3-=30;
					y3 = y3+30;
					if (y3==480) {
						arriba3 = 480;
					}
			}
		
		}			
        }
}
