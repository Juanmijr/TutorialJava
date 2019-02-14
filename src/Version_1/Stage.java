/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */
package Version_1;

import java.awt.image.ImageObserver;



public interface Stage extends ImageObserver {
	public static final int WIDTH=640;
	public static final int HEIGHT=731;
	public static final int SPEED=6;
	public SpriteCache getSpriteCache();
	public SoundCache getSoundCache();

}
