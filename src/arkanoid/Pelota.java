package arkanoid;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Pelota extends Objetos {
	protected int vx;
	protected int vy;
	protected boolean  jugar;
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenadas = null;
	float pixelFrame = 3; 
	
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"Bola.png"});
	}
	
	public void act() {
		if (trayectoria == null) {
		coordenadas = new PuntoAltaPrecision(x, y);
		trayectoria = new TrayectoriaRecta(-2.5f, coordenadas, false);
		}
		this.coordenadas= this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelFrame);
		if (pixelFrame < 3) {
			pixelFrame*=1.00035;
		}
		this.x = Math.round(this.coordenadas.x);
		this.y = Math.round(this.coordenadas.y);
		
		if (x < 0 || x > Stage.WIDTH-15)			
		  this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
		if (y<0 || y > Stage.HEIGHT-35)
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
	}

	public int getVx() { return vx; }
	public int getVy() { return vy; }
	public void setVx(int i) {vx = i;	}
	public void setVy(int i) {vy = i; }
	
	public void collision(Objetos a){
		
		if (a instanceof Nave) {
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
		}
	}

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
	case KeyEvent.VK_SPACE : jugar= true;
		}
		
		
	}

	public void mouseClicked(MouseEvent e) {
		switch (e.MOUSE_CLICKED) {
		case MouseEvent.MOUSE_CLICKED : jugar = true;
		}
		
	}
	
	
	
	
	
	

}
