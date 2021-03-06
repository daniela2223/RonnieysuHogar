import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;


public class Juego extends JPanel {
	
  Laberinto laberinto=new Laberinto();
  Personaje personaje = new Personaje();
  Araña araña= new Araña();
  Mosquito mosquito= new Mosquito();
  Caracol caracol = new Caracol();
  Bat bat = new Bat();
  Objetos reloj = new Objetos();
  Barras barra = new Barras();
  Arbol arbol = new Arbol();
  Lago lago = new Lago();
  Estrella estrella = new Estrella();

static int prueba = 4;
static int p = 0;
static int tiempo=200;
static int contadoraraña = 10;
static int contadormosquito = 16;
static int contadorbat = 15;
static int contadorcaracol = 30;
	
public Juego(){
	
    addKeyListener(new KeyListener(){
      @Override
      public void keyTyped(KeyEvent e){
      }
      @Override 
      public void keyPressed(KeyEvent e){
        personaje.teclaPresionada(e);
      }
      @Override
      public void keyReleased(KeyEvent e){
      }
    });
    setFocusable(true);
  }
	
public void paint(Graphics grafico){
    laberinto.paint(grafico);
    personaje.paint(grafico);
    araña.paint(grafico);
    mosquito.paint(grafico);
    caracol.paint(grafico);
    bat.paint(grafico);
    arbol.paint(grafico);
    lago.paint(grafico);
    barra.dibujarbarraderesistencia(grafico);
    reloj.paint(grafico);
    estrella.paint(grafico);
  }
	
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
    if (prueba ==4) {
    	new Nota();
    }
    prueba =3;
	if (prueba == 3) {
		new Ventana3();
	}
	
	if (prueba ==2) {
		new Ventana2();
	}
	prueba =0;
    if (prueba==0) {
    	new Ventanas();
    }
	 
     while(true){
      try {
        Thread.sleep(10);
	if ((tiempo!=0)&&(p==1)) {
        	tiempo-=1;
        }else {
        	tiempo = 200;
	}
	if (contadoraraña!=0) {
        	contadoraraña-=1;
        }else {
        	contadoraraña = 10;
        }
        if (contadormosquito!=0) {
        	contadormosquito-=1;
        }else {
        	contadormosquito = 16;
        }
        if (contadorbat!=0) {
        	contadorbat-=1;
        }else {
        	contadorbat = 15;
        }
        if (contadorcaracol!=0) {
        	contadorcaracol-=1;
        }else {
        	contadorcaracol = 30;
        }
        } catch (InterruptedException ex) {
				}
    	  
      miventana.repaint();
   		
   	}
  }
    
  }
