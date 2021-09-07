import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;


public class Juego extends JPanel {
 public static void main(String[] args) {   
    JFrame miventana = new JFrame("El laberinto");
    Juego game = new Juego();
    miventana.add(game);
    miventana.setSize(900,640);
    miventana.setLocation(300,200);
    miventana.setVisible(true);
    miventana.setBackground(new Color(181, 138, 113 ));
    miventana.setResizable(false);
    miventana.setLocationRelativeTo(null);
    miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     while(true){
      try {
        Thread.sleep(10);
        } catch (InterruptedException ex) {
				}
    	  
      miventana.repaint();
   		
   	}
  }
    
  }
