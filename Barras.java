import java.awt.Color;
import java.awt.Graphics;
public class Barras{
	static int tiempo1 = 100;
	public void dibujarbarraderesistencia (Graphics g) {
		Color verde = (Color.GREEN);
		g.setColor(Color.WHITE);
		g.drawRect(820, 45, 17, 102);
		g.setColor(verde);
		g.fillRect(821, 46, 16, tiempo1);
		g.setColor(Color.WHITE);
		g.drawRect(820, 460, 17, 102);
		g.setColor(Color.RED);
		g.fillRect(821, 461, 16, Personaje.vida);
		g.setColor(Color.WHITE);
		g.drawRect(820, 250, 17, 120);
		g.setColor(Color.YELLOW);
		g.fillRect(821, 251, 16, Personaje.estr*20);
		contar();

	}
	public void contar(){
		if (Juego.tiempo==0) {
			tiempo1-=1;
		}
		if (tiempo1<=0) {
			tiempo1=0;
		}
	}
}
