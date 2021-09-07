import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Estrella extends Objetos {
	Image Estrella;
	public int x1=690;
	public int y1=540;
	public int x2=420;
	public int y2=420;
	public int x3=720;
	public int y3=120;
	public int x4=240;
	public int y4=480;
	public int x5=510;
	public int y5=300;
	public int x6=30;
	public int y6=90;
	

	public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Estrella, x1, y1, 38, 30, null);
		grafico.drawImage(Estrella, x2, y2, 38, 30, null);
		grafico.drawImage(Estrella, x3, y3, 38, 30, null);
		grafico.drawImage(Estrella, x4, y4, 38, 30, null);
		grafico.drawImage(Estrella, x5, y5, 38, 30, null);
		grafico.drawImage(Estrella, x6, y6, 38, 30, null);
	}
	
	private void cargarImag() {
		Estrella = new ImageIcon("src\\Imagenes\\Estrella.png").getImage();
	}
}
