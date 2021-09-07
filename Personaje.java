import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Personaje  {
  Image Ronnie;
}

public void paint(Graphics graf){
	cargarImag();
    graf.drawImage(Ronnie, x, y, ancho, alto, null);
  }

private Image cargarImag() {

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeqder.png").getImage();

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeq.png").getImage();

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeqab.png").getImage();

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeqar.png").getImage();
	}
}
