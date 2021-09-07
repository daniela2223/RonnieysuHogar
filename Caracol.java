import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Caracol extends Enemigos {
	Image Caracol;
	public int x1=120;
	public int y1=390;
	public int x2=630;
	public int y2=30;
	public int arriba1 = 90;
	public int arriba2 = 30;
	
	public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Caracol, x1, y1, ancho, alto, null);
		grafico.drawImage(Caracol, x2, y2, ancho, alto, null);
		movimientocaracol();
	}

	private void cargarImag() {
		Caracol = new ImageIcon("src\\Imagenes\\Caracol.gif").getImage();
	}
	public void movimientocaracol() {
		if (Juego.contadorcaracol==0) {
			if (arriba1<180) {
				x1 = x1+30;
				arriba1 = arriba1+30;
			}else {
					arriba1+=30;
					x1 = x1-30;
					if (x1==90) {
						arriba1 = 90;
					}
		}
			if (arriba2<270) {
				y2 = y2+30;
				arriba2 = arriba2+30;
			}else {
					arriba2+=30;
					y2 = y2-30;
					if (y2==30) {
						arriba2 = 30;
					}
			}
	}
}
}
