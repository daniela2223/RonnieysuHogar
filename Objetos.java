import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Objetos  {
	Image Reloj;
	Image Heart;
	Image Estrella;
	Image Fundacion;
	public int x1=806;
	public int y1=5;
	public int x2 = 806;
	public int y2 = 445;
	public int x3=0;
	public int y3 = 360;
	public int x4=798;
	public int y4 = 218;
	
	public void paint(Graphics grafico) {
		cargarImag();
		grafico.drawImage(Reloj, x1, y1, 45, 45, null);
		grafico.drawImage(Heart, x2, y2, 45, 45, null);
		grafico.drawImage(Fundacion, x3, y3, 30, 30, null);
		grafico.drawImage(Estrella, x4, y4, 60, 50, null);
	}
	
	private void cargarImag() {
		Reloj = new ImageIcon("src\\Imagenes\\Poo.png").getImage();
		Heart = new ImageIcon("src\\Imagenes\\Corazon.png").getImage();
		Fundacion = new ImageIcon("src\\Imagenes\\Fundacion.png").getImage();
		Estrella = new ImageIcon("src\\Imagenes\\Estrella.png").getImage();
		
	}
}
