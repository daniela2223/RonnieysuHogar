import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Laberinto{
	Image arbusto;
  private int fila=0;
  private int columna=0;
  private final int numeroFilas=20;
  private final int numeroColumnas=26;
  private final int anchoBloque=30;
  private final int altoBloque=30;

  public void paint(Graphics grafico){
	  cargarImag();
    int[][] laberinto=obtieneLaberinto();
    for(fila=0; fila<numeroFilas; fila++){
      for(columna=0; columna<numeroColumnas; columna++){
        if (laberinto[fila][columna]==1){
          grafico.drawImage(arbusto, columna*30, fila*30, anchoBloque, altoBloque, null);
         
        }
      }
    }
  }

  public int [][] obtieneLaberinto(){
    int laberinto [][]=
    	{	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
    			{1,0,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,0,1,0,1,0,2,1},
    			{1,0,0,0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1},
    			{1,1,1,1,1,1,1,1,0,1,0,1,0,0,0,0,1,2,1,0,1,0,0,0,0,1},
    			{1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,0,1,1,1,1},
    			{1,0,1,1,0,1,0,1,0,1,0,1,2,2,1,0,0,0,0,0,1,0,0,0,0,1},
    			{1,0,1,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,0,1,0,1,2,2,1},
    			{1,0,1,2,0,1,0,1,0,1,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,1},
    			{1,0,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0},
    			{1,0,1,0,0,0,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,1,1,1,0,1},
    			{1,0,1,2,2,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
    			{0,0,1,1,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1},
    			{1,1,1,0,0,0,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,0,1,0,0,1},
    			{1,0,1,1,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,2,0,1},
    			{1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,0,1,1,0,1},
    			{1,0,1,2,0,1,0,1,0,1,2,1,0,1,0,0,0,0,0,0,0,0,1,1,0,1},
    			{1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1},
    			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},

    		};

return laberinto;
  }
  
  private void cargarImag() {
	  arbusto = new ImageIcon("src\\Imagenes\\Arbusto cuadrado.png").getImage(); 
  }
}
