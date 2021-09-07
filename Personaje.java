import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Personaje  {
  Image Ronnie;
  Image Disparo;
  Laberinto lab = new Laberinto();
  public int x=750;
  public int y = 270;
  private final int ancho = 36;
  private final int alto = 30;
  private final int anchoRect = 30;
  private final int movimiento=30;
  static int aux=0; 
  static int estr = 0;
  static int estr1 = 0;
  static int estr2 = 0;
  static int estr3 = 0;
  static int estr4 = 0;
  static int estr5 = 0;
  static int estr6 = 0;
  char direccion='r';
  Disparo disparo;
  public int coordX;
  public int coordY;
  Estrella estrella = new Estrella();
}

public void paint(Graphics graf){
	cargarImag();
    graf.drawImage(Ronnie, x, y, ancho, alto, null);
  }

public void teclaPresionada(KeyEvent evento){
	    int [][]laberinto=lab.obtieneLaberinto();
	  
		Rectangle r = new Rectangle(x,y,anchoRect,alto);
	    Rectangle r1 = new Rectangle(araña.x1,araña.y1,anchoRect,alto);
	    Rectangle r3= new Rectangle(araña.x2, araña.y2, anchoRect, alto);
		Rectangle r4 = new Rectangle(araña.x3, araña.y3, anchoRect, alto);
		
		Rectangle r5 = new Rectangle(mosquito.x1, mosquito.y1, anchoRect, alto);
		Rectangle r6 = new Rectangle(mosquito.x2, mosquito.y2, anchoRect, alto);
		Rectangle r7 = new Rectangle(mosquito.x3, mosquito.y3, anchoRect, alto);
		
		Rectangle r8 = new Rectangle(caracol.x1, caracol.y1, anchoRect, alto);
		Rectangle r9 = new Rectangle(caracol.x2, caracol.y2, anchoRect, alto);
		
		Rectangle r10 = new Rectangle(bat.x1, bat.y1, anchoRect, alto);
		Rectangle r11 = new Rectangle(bat.x2, bat.y2, anchoRect, alto);
		
	  agregarDisparo(direccion);
		Rectangle r2 = disparo.getLimites();

	    if(evento.getKeyCode()==37){ 
	      if(laberinto[y/30][(x/30)-1]!=1 && laberinto[y/30][(x/30)-1]!=2){
	        x=x-movimiento;
	        vida = vida-1;
	        direccion = 'r';
	        cargarImag(direccion);
	      } 
	    }
	    if(evento.getKeyCode()==39){ 
	      if(laberinto[y/30][(x/30)+1]!=1 && laberinto[y/30][(x/30)+1]!=2 ){
	        x=x+movimiento;
	        vida = vida-1;
	        direccion = 'l';
	       cargarImag(direccion);
	      } 
	    }
	    if(evento.getKeyCode()==40){ 
	      if(laberinto[(y/30)+1][x/30]!=1 && laberinto[(y/30)+1][x/30]!=2 ){
	        y=y+movimiento;
	        vida = vida-1;
	        direccion = 'd';
	        cargarImag(direccion);
	      } 
	    }
	    
	    if(evento.getKeyCode()==38){ 
	      if(laberinto[(y/30)-1][x/30]!=1 && laberinto[(y/30)-1][x/30]!=2){
	        y=y-movimiento;
	        vida = vida-1;
	        direccion = 'u';
	        cargarImag(direccion);
	      } 
	    }


	    if ((evento.getKeyCode()==83) && ((x==690) && (y==180)|| (x==720)&& (y==180))) {
	    	if (vida>=80) {
	    		vida = 100;
	    	}else
	    	vida = vida+20;
	    }
	    //ataque
	    if ((evento.getKeyCode()==83) && ((x==90) && (y==300)|| (x==120)&& (y==300))) {
	    	if (vida>=80) {
	    		vida = 100;
	    	}else
	    	vida = vida+20;
	    }
	    //cazar
	    if ((evento.getKeyCode()==83) && ((x==360) && (y==150)|| (x==390)&& (y==150))) {
	    	if (vida>=80) {
	    		vida = 100;
	    	}else
	    	vida = vida+20;
	    }
	    //arboles
	    
	    if ((evento.getKeyCode()==65) && ((x==690) && (y==60)|| (x==720)&& (y==30))) {
	    	new Nota1();
	    }
	    if ((evento.getKeyCode()==65) && ((x==720) && (y==420)|| (x==690)&& (y==390))) {
	    	new Nota2();
	    }
	    if ((evento.getKeyCode()==65) && ((x==300) && (y==450))) {
	    	new Nota3();
	    }
	    
	    
	    //arañas
	    if ((evento.getKeyCode()==87) && (r2.intersects(r1))) {
	    	
	    	if (vida>=88) {
	    		vida = 100;
	    	}else
	    	vida = vida+12;
	    }
	    if ((evento.getKeyCode()==87) && (r2.intersects(r3))) {
	    	
	    	if (vida>=88) {
	    		vida = 100;
	    	}else
	    	vida = vida+12;
	    }
	    if ((evento.getKeyCode()==87) && (r2.intersects(r4))) {
	    	
	    	if (vida>=88) {
	    		vida = 100;
	    	}else
	    	vida = vida+12;
	    }
	    
	    //mosquitos
	    if ((evento.getKeyCode()==87) && (r2.intersects(r5))) {
	    	
	    	if (vida>=91) {
	    		vida = 100;
	    	}else
	    	vida = vida+9;
	    }
	    
	    if ((evento.getKeyCode()==87) && (r2.intersects(r6))) {
	    	
	    	if (vida>=91) {
	    		vida = 100;
	    	}else
	    	vida = vida+9;
	    }
	    
	    if ((evento.getKeyCode()==87) && (r2.intersects(r7))) {
	    	
	    	if (vida>=91) {
	    		vida = 100;
	    	}else
	    	vida = vida+9;
	    }
	    
	    //caracoles
	    if ((evento.getKeyCode()==87) && (r2.intersects(r8))) {
	    	
	    	if (vida>=94) {
	    		vida = 100;
	    	}else
	    	vida = vida+6;
	    }
	    
	    if ((evento.getKeyCode()==87) && (r2.intersects(r9))) {
	    	
	    	if (vida>=94) {
	    		vida = 100;
	    	}else
	    	vida = vida+6;
	    }
	    
	    //bats
	    if ((evento.getKeyCode()==87) && (r2.intersects(r10))) {
	    	
	    	if (vida>=97) {
	    		vida = 100;
	    	}else
	    	vida = vida+3;
	    }
	    
	    if ((evento.getKeyCode()==87) && (r2.intersects(r11))) {
	    	
	    	if (vida>=97) {
	    		vida = 100;
	    	}else
	    	vida = vida+3;
	    }
	    }

public void colision() {
	araña.movimientoarañas();
	mosquito.movimientomosquito();
	caracol.movimientocaracol();
	bat.movimientobat();
	
	Rectangle r = new Rectangle(x,y,anchoRect,alto);
	Rectangle r1 = new Rectangle(araña.x1,araña.y1,anchoRect,alto);
	Rectangle r3= new Rectangle(araña.x2, araña.y2, anchoRect, alto);
	Rectangle r4 = new Rectangle(araña.x3, araña.y3, anchoRect, alto);
	
	Rectangle r5 = new Rectangle(mosquito.x1, mosquito.y1, anchoRect, alto);
	Rectangle r6 = new Rectangle(mosquito.x2, mosquito.y2, anchoRect, alto);
	Rectangle r7 = new Rectangle(mosquito.x3, mosquito.y3, anchoRect, alto);
	
	Rectangle r8 = new Rectangle(caracol.x1, caracol.y1, anchoRect, alto);
	Rectangle r9 = new Rectangle(caracol.x2, caracol.y2, anchoRect, alto);
	
	Rectangle r10 = new Rectangle(bat.x1, bat.y1, anchoRect, alto);
	Rectangle r11 = new Rectangle(bat.x2, bat.y2, anchoRect, alto);
	
	Rectangle r12 = new Rectangle(estrella.x1, estrella.y1, anchoRect, alto);
	Rectangle r13 = new Rectangle(estrella.x2, estrella.y2, anchoRect, alto);
	Rectangle r14 = new Rectangle(estrella.x3, estrella.y3, anchoRect, alto);
	Rectangle r15 = new Rectangle(estrella.x4, estrella.y4, anchoRect, alto);
	Rectangle r16 = new Rectangle(estrella.x5, estrella.y5, anchoRect, alto);
	Rectangle r17 = new Rectangle(estrella.x6, estrella.y6, anchoRect, alto);
	
	Rectangle r18 = new Rectangle(objeto.x3, objeto.y3, anchoRect, alto);
	
	if(r.intersects(r18) && estr == 6) {
		if(aux ==0) {
			aux ++;
			new Felicitaciones();
		}
	}
	if (r.intersects(r18) && estr != 6) {
		x=750;
		y = 270;
	    direccion='r';
		cargarImag(direccion);
	}
		
	
	//
	
	if (r.intersects(r1) || r.intersects(r3) ||  r.intersects(r4)) {
		if (vida<=16) {
			vida=0;
		}else
			vida-=16;
	}
	
	if(r.intersects(r5) || r.intersects(r6) || r.intersects(r7)) {
		if(vida<=12) {
			vida=0;
		}else
			vida-=12;
	}
	
	if(r.intersects(r8) || r.intersects(r9)) {
		if(vida<=4) {
			vida=0;
		}else
			vida-=4;
	}
	
	if(r.intersects(r10) || r.intersects(r11)) {
		if(vida<=8) {
			vida=0;
		}else
			vida-=8;
	}
	
	// estrellas
	
	if(r.intersects(r12)) {
		if(estr1==0){
	          estr1=estr1+1;
	        }
	}
	
	if(r.intersects(r13)) {
		if(estr2==0){
	          estr2=estr2+1;
	        }
	}
	
	if(r.intersects(r14)) {
		if(estr3==0){
	          estr3=estr3+1;
	        }
	}
	
	if(r.intersects(r15)) {
		if(estr4==0){
	          estr4=estr4+1;
	        }
	}
	
	if(r.intersects(r16)) {
		if(estr5==0){
	          estr5=estr5+1;
	        }
	}
	if(r.intersects(r17)) {
		if(estr6==0){
	          estr6=estr6+1;
	        }
	}
	}

public Disparo agregarDisparo(char direccionr) {
	
	switch(direccion) {
	case 'r':
		coordX=x-ancho;
		coordY=y;
		disparo=new Disparo(coordX, coordY);
		break;
	case 'l':
		coordX=x+ancho;
		coordY=y;
		disparo=new Disparo(coordX, coordY);
		break;
	case 'd':
		coordX=x;
		coordY=y+alto;
		disparo=new Disparo(coordX, coordY);
		break;
	case 'u':
		coordX=x;
		coordY=y-alto;
		disparo=new Disparo(coordX, coordY);
		break;
	}
	return disparo;

}

private Image cargarImag() {

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeqder.png").getImage();

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeq.png").getImage();

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeqab.png").getImage();

	  Ronnie = new ImageIcon("src\\Imagenes\\Ronniepeqar.png").getImage();
	}
}
