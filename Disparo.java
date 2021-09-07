import java.awt.Rectangle;

public class Disparo {

	public int x;
	public int y;
	public int ancho = 30;
	public int alto = 30;
	public boolean vis;
	
	public Disparo (int x, int y) {
		this.x = x;
		this.y = y;
		vis = true;
	}
	
	public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return vis;
    }

    public void setVisible(Boolean visible) {
        vis = visible;
    }

    public Rectangle getLimites() {
        return new Rectangle(x, y, ancho, alto);
    }   
    
}
