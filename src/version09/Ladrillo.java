package tutorialJava.Arkanoid.version09;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a cada ladrillo de los que pondremos sobre la pantalla
 * 
 * @author R
 *
 */
public class Ladrillo extends Actor {
	// Damos un ancho y un alto espec�fico al ladrillo. Suponemos que todos los
	// ladrillos ser�n iguales
	public static final int ANCHO = 30;
	public static final int ALTO = 20;
	public static final int ESPACIO_ENTRE_LADRILLOS = 2;
	int newImg=0;
	boolean listo = false; 

	// Propiedades espec�ficas de cada ladrillo
	private Color color = null;

	/**
	 * Constructor
	 */
	public Ladrillo() {
		super();
		spriteActual = null; // El ladrillo se pinta vectorialmente, as� que no utilizo ning�n sprite
		this.x = 10;
		this.y = 10;
		this.ancho = ANCHO;
		this.alto = ALTO;
		this.color = Color.WHITE; // Por defecto pongo el ladrillo en color blanco
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param x
	 * @param y
	 * @param color
	 */
	public Ladrillo(int x, int y, int imagen) {
		this.x = x;
		this.y = y;
		this.ancho = ANCHO;
		this.alto = ALTO;
		// Carga de los sprites de la explosi�n
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrillorosa.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloazul.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloverde.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloazul.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrillorosa.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloverde.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrillorosa.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ladrilloazul.png"));
		if (imagen == 6 ) {
			if () {
				listo = true;
			}
			
		}
		
		// Sprite actual
		this.spriteActual = nuevosSprites.get(imagen);

			newImg = imagen;
	

	}

	/**
	 * Colisi�n detectada
	 */
	@Override
	public void colisionProducidaConOtroActor(Actor actorColisionado) {
		super.colisionProducidaConOtroActor(actorColisionado);
		// Si un ladrillo detecta una colisi�n con un objeto de tipo "Bola", debe
		// desaparecer

		if (newImg != 5 ) {
			if (actorColisionado instanceof Bola && listo==true) {
				eliminar();
				// Creo un nuevo actor de tipo Explosion y lo centr� respecto a la posici�n del
				// ladrillo
				Explosion explosion = new Explosion(this.getX(), this.getY());
				explosion.setX(this.x + Ladrillo.ANCHO / 2 - explosion.getAncho() / 2);
				Arkanoid.getInstancia().agregarActor(explosion);
				// Reproduzco el sonido de la explisi�n
				CacheRecursos.getInstancia().playSonido("Arkanoid-SFX-01.wav");
				
			}	
		}
		
	}

	// M�todos getter y setter
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
