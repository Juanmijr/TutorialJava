/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */
package Version_1;

import java.awt.Rectangle;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;





public class Pelota extends Objetos {
	protected int vx;
	protected int vy;
	public int contclick = 0;
	public boolean espacio = false;
	private SoundCache soundCache;
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenadas = null;
	public float pixelFrame = 3;
	protected long millis = System.currentTimeMillis();
	protected long milisegundosActuales;
	protected long segundos;
	protected boolean pelotaAbajo;
	protected int contVidas=3;
	public boolean ladrillotocado=false;

	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames(new String[] { "../res/pelotaBuenaa.png" });
		setFrameSpeed(35);
		soundCache = new SoundCache();

	}

	public void collision(Objetos a) {
		if (a instanceof Ladrillo) {
			RectanculosLadrillo((Ladrillo) a);
			soundCache.playSound("../res/goteo.wav");
			ladrillotocado=true;
			
		}

		if (a instanceof Nave) {
			colisionConNave((Nave) a );
			soundCache.playSound("../res/tonoNave.wav");
		}

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_SPACE:
			espacio = true;

		}

	}

	public void act() {
		super.act();
		milisegundosActuales = System.currentTimeMillis();
		segundos = milisegundosActuales - millis;
		System.out.println("contclick: " + contclick + " espacio: " + espacio + " segundos: " + segundos);
		if (contclick == 1 || espacio == true || segundos > 5000) {

			if (this.trayectoria == null) {
				this.coordenadas = new PuntoAltaPrecision(x, y);
				this.trayectoria = new TrayectoriaRecta(-2.5f, coordenadas, true);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelFrame);
			
			 	if (pixelFrame < 9) { pixelFrame *= 1.00035; }
			 

			this.x = Math.round(this.coordenadas.x);
			this.y = Math.round(this.coordenadas.y);

			if (x < 0 || x > Stage.WIDTH - 18) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);

			}

			if (y < 0 ) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			}
			if(y > Stage.HEIGHT - 48) {
				resetea();
				contVidas--;
				
			}
			
		

		
		}

	}
	
	
	public void resetea () {
		this.pelotaAbajo = false;
		this.pixelFrame = 3;
		this.trayectoria = null;
		this.espacio = false;
		this.millis = System.currentTimeMillis();
		contclick=0;
				
	}
	
	public Rectangle getRectanguloParaColisiones () {
		return new Rectangle(this.x + this.width / 2 - 4, this.y + this.height / 2 - 4, 8, 8);
	}

	public void RectanculosLadrillo(Ladrillo ladrillo) {
		Rectangle rectAbajo = new Rectangle(ladrillo.x, ladrillo.y + ladrillo.height - 1, ladrillo.width, 1);
		Rectangle rectArriba = new Rectangle(ladrillo.x, ladrillo.y + 1, ladrillo.width, 1);
		Rectangle rectIzquierda = new Rectangle(ladrillo.x, ladrillo.y, 1, ladrillo.height);
		Rectangle rectDerecha = new Rectangle(ladrillo.x + ladrillo.width - 1, ladrillo.y, 1, ladrillo.height);

		boolean arriba = false, abajo = false, derecha = false, izquierda = false;
		
		if (this.getBounds().intersects(rectIzquierda) && this.getBounds().intersects(rectAbajo)) {
			this.x = ladrillo.x;
			this.y = ladrillo.y + ladrillo.height;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
			System.out.println("esquina izquierda abajo");
			return;
			//this.trayectoria.setPendiente(this.trayectoria.m, coordenadas, !this.trayectoria.direccionCreciente);
			

		} else {
			if (this.getBounds().intersects(rectDerecha) && this.getBounds().intersects(rectAbajo)) {
				this.x = ladrillo.x + ladrillo.width;
				this.y = ladrillo.y + ladrillo.height;
				this.coordenadas.x = this.x; this.coordenadas.y = this.y;
				this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
				System.out.println("esquina derecha abajo");
				return;
				//this.trayectoria.setPendiente(this.trayectoria.m, coordenadas, !this.trayectoria.direccionCreciente);
				
				
			} else {
				if (this.getBounds().intersects(rectDerecha) && this.getBounds().intersects(rectArriba)) {
					this.x = ladrillo.x + ladrillo.width;
					this.y = ladrillo.y;
					this.coordenadas.x = this.x; this.coordenadas.y = this.y;
					this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
					System.out.println("esquina izquierda arriba");
					return;
					//this.trayectoria.modificarPendiente(this.trayectoria.m, coordenadas, !this.trayectoria.direccionCreciente);
					
				} else {
					if (this.getBounds().intersects(rectIzquierda) && this.getBounds().intersects(rectArriba)) {
						this.x = ladrillo.x;
						this.y = ladrillo.y;
						this.coordenadas.x = this.x; this.coordenadas.y = this.y;
						// Recalculo la pendiente
						this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
						System.out.println("esquina izquierda arriba");
						return;
						//this.trayectoria.modificarPendiente(this.trayectoria.m, coordenadas, !this.trayectoria.direccionCreciente);
						
					} else {
						if (this.getBounds().intersects(rectIzquierda)) {
							this.x = ladrillo.x;
							this.coordenadas.x = this.x;
							this.trayectoria.reflejarHaciaIzquierda(this.coordenadas);
							System.out.println("izquierda");
							return;
							//this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
							
						} else {
							if (this.getBounds().intersects(rectDerecha)) {
								this.x = ladrillo.x + ladrillo.width;
								this.coordenadas.x = this.x;
								this.trayectoria.reflejarHaciaDerecha(this.coordenadas);
								System.out.println("derecha");
								return;
								//this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
								
							} else {
								if (this.getBounds().intersects(rectAbajo)) {
									this.y = ladrillo.y + ladrillo.height;
									this.coordenadas.y = this.y;
									this.trayectoria.reflejarHaciaAbajo(this.coordenadas);
									System.out.println("abajo");
									return;
									//this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
								} else {
									if (this.getBounds().intersects(rectArriba)) {
										this.y = ladrillo.y;
										this.coordenadas.y = this.y;
										this.trayectoria.reflejarHaciaArriba(this.coordenadas);
										System.out.println("arriba");

										return;
										//this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public void Mouseclicked(MouseEvent event) {

		contclick++;
	}

	public int getVx() {
		return vx;
	}

	public void setVx(int i) {
		vx = i;
	}

	public void Mousemoved(MouseEvent e) {
		if (espacio == false && contclick < 1 && segundos > 5000) {

			this.x = e.getX() - getWidth() / 2;
			
		}

	}
	
	
	private void colisionConNave (Nave nave) {
		// Creo rect�ngulos para determinar la zona de la nave con la que choca la bola
		int anchoZonaEspecial = 7; // p�xeles que delimitan la zona de rebote especial de la nave
		Rectangle rectIzqNave = new Rectangle(nave.getX(), nave.getY(), anchoZonaEspecial, nave.height);
		Rectangle rectDerNave = new Rectangle(nave.getX() + nave.width - anchoZonaEspecial, nave.getY(), anchoZonaEspecial, nave.height);
		Rectangle rectBola = this.getRectanguloParaColisiones();
		
		// Colisi�n con el lado derecho de la nave
		if (rectBola.intersects(rectDerNave)) {
			this.y = nave.getY() - nave.getHeight();
			this.coordenadas.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene on una pendiente mayor a 1
				this.trayectoria.setPendiente(-(float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenadas, true);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente(-(float) (Math.random() * (10 - 2) + 2), this.coordenadas, true);
			}
			return;
		}
		// Colisi�n con el lado izquierdo de la nave
		if (rectBola.intersects(rectIzqNave)) {
			this.y = nave.getY() - nave.getHeight();
			this.coordenadas.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene con una pendiente mayor a 1
				this.trayectoria.setPendiente((float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenadas, false);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente((float) (Math.random() * (10 - 2) + 2), this.coordenadas, false);
			}
			return;
		}
		else { // La bola intersecta la parte central de la nave
			this.trayectoria.reflejarHaciaArriba(this.coordenadas);
			return;
		}			
	}

}
