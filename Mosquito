import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Mosquito extends Enemigos {
	Image Mosquito;
	public int x1=30;
	public int y1=540;
	public int x2 = 450;
	public int y2 = 90;
	public int x3 = 30;
	public int y3 = 150;
	public int arriba1= 30;
	public int arriba2 = 90;
	public int arriba3 = 60;
	
	public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Mosquito, x1, y1, ancho, alto, null);
		grafico.drawImage(Mosquito, x2, y2, ancho, alto, null);
		grafico.drawImage(Mosquito, x3, y3, ancho, alto, null);
		movimientomosquito();
	}

	private void cargarImag() {
		Mosquito = new ImageIcon("src\\Imagenes\\Mosquito.gif").getImage();
	}
	public void movimientomosquito() {
		if (Juego.contadormosquito==0) {
			if (arriba1<610) {
				x1 = x1+30;
				arriba1 = arriba1+30;
			}else {
					arriba1+=30;
					x1 = x1-30;
					if (x1==30) {
						arriba1 = 30;
					}
			}
			if (arriba3<180) {
				x3 = x3+30;
				arriba3 = arriba3+30;
			}else {
					arriba3+=30;
					x3 = x3-30;
					if (x3==30) {
						arriba3 = 30;
					}
			}
			if (arriba2<300) {
				y2 = y2+30;
				arriba2 = arriba2+30;
			}else {
					arriba2+=30;
					y2 = y2-30;
					if (y2==90) {
						arriba2 = 90;
					}
			}
			
		}
	                
	}
}
