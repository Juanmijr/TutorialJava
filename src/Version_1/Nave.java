/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */
package Version_1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;



public class Nave extends Objetos {
	protected static final int PLAYER_SPEED = 6;
	protected int vx;
	protected int vy;
	public boolean left, right;

	public Nave(Stage stage) {
		super(stage);
		setSpriteNames(new String[] {"../res/nave2.png"} );
	}

	public void act() {
		super.act();
		x += vx;
		
		if (x < 0 ) 
			  x = 0;
			if (x > Stage.WIDTH - 60)
			  x = Stage.WIDTH - 60;
		
	}

	public int getVx() {
		return vx;
	}

	public void setVx(int i) {
		vx = i;
	}

	

	protected void updateSpeed() {
		vx = 0;
		
		
		if (left)
			vx = -PLAYER_SPEED;
		if (right)
			vx = PLAYER_SPEED;
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		}
		updateSpeed();
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		
		}
		updateSpeed();
	}

	public void Mousemoved(MouseEvent e) {
		this.x=e.getX()-getWidth()/2;
		
	}
	
}


