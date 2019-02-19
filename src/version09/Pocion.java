package version09;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Pocion extends Actor {
protected static final int BULLET_SPEED=10;
public static final int ANCHO = 30;
public static final int ALTO = 20;
public static final int ESPACIO_ENTRE_LADRILLOS = 2;
int newImg=0;
	
	public Pocion(int x, int y, int num) {
	this.x = x;
	this.y = y;
	this.ancho = ANCHO;
	this.alto = ALTO;
		// Carga de los sprites de la explosi�n
				List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
				nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Catch.gif"));
				nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Duplicate.gif"));
				nuevosSprites.add(CacheRecursos.getInstancia().getImagen("Enlarge.gif"));

				
				
				// Sprite actual
				this.spriteActual = nuevosSprites.get(num);

					newImg = num;
	}
	
	public void act() {
		super.act();
		y-=BULLET_SPEED;
		if (y < 0)
		  eliminar();
	}
}
