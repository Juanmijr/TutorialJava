package version09;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Pocion extends Actor {
	// Damos un ancho y un alto espec�fico al ladrillo. Suponemos que todos los
		// ladrillos ser�n iguales
		public static final int ANCHO = 30;
		public static final int ALTO = 20;
		int newImg=0;
		
		/**
		 * Constructor
		 */
		public Pocion() {
			super();
			spriteActual = null; // El ladrillo se pinta vectorialmente, as� que no utilizo ning�n sprite
			this.x = 10;
			this.y = 10;
			this.ancho = ANCHO;
			this.alto = ALTO;
			
		}
		
		/**
		 * Constructor parametrizado
		 * 
		 * @param x
		 * @param y
		 * @param color
		 */
		public Pocion(int x, int y, int imagen) {
			this.x = x;
			this.y = y;
			this.ancho = ANCHO;
			this.alto = ALTO;
			// Carga de los sprites de la explosi�n
			List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
			nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrillorosa.png"));
			nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloazul.png"));
			nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloverde.png"));
			
			
			// Sprite actual
			this.spriteActual = nuevosSprites.get(imagen);
		}
		public void act () {
			this.setY(this.getY()+1);
			if (this.getY()>=600||colisionado) {
				
			}
		}
		
		/**
		 * Colisi�n detectada
		 */
		@Override
		public void colisionProducidaConOtroActor(Actor actorColisionado) {
			super.colisionProducidaConOtroActor(actorColisionado);
			// Si un ladrillo detecta una colisi�n con un objeto de tipo "Bola", debe
			// desaparecer

			
		}
}
