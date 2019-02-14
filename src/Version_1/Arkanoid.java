package Version_1;
/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders

 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

import java.awt.Canvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Arkanoid extends Canvas implements Stage, KeyListener {
	JFrame ventana = null;
	private BufferStrategy strategy;
	private long usedTime;
	private SoundCache soundCache;
	private Nave player = null;
	private BufferedImage imgFondo;
	private BufferedImage imgGameOver;
	private int t;
	private SpriteCache spriteCache = new SpriteCache();
	Raton raton = new Raton();
	public int contClick = 0;
	Pelota pelota = new Pelota(this);
	private List<Objetos> objetos = new ArrayList<Objetos>();
	private List<Objetos> explosiones = new ArrayList<Objetos>();

	public static int ladrilloBorrado;
	protected long millis = System.currentTimeMillis();
	protected long milisegundosActuales;
	protected long segundos;

	public Arkanoid() {
		spriteCache = new SpriteCache();
		soundCache = new SoundCache();
		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel) ventana.getContentPane();
		setBounds(0, 0, Stage.WIDTH, Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH, Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0, 0, Stage.WIDTH, Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		addKeyListener(this);
		player = new Nave(this);
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {

				player.Mousemoved(e);
				if (pelota.contclick < 1) {
					pelota.Mousemoved(e);
					pelota.setX(player.getX() + 20);
					pelota.setY(player.getY() - 20);

				}
			}
		});

		addMouseListener(raton);

	}

	public void cerrarAplicacion() {
		String[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Desea cerrar la aplicacion?", "Salir de la aplicacion",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");

		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public void initWorld() {

		pelota.setX(Stage.WIDTH - 333);
		pelota.setY(Stage.HEIGHT - 103);

		objetos.add(pelota);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				Ladrillo ladrillo = new Ladrillo(this, i);
				ladrillo.setX(-8 + j * 50 + 30);
				ladrillo.setY(i * 16 + 20);

				objetos.add(ladrillo);
			}
		}
		
		
		
		
		

		player.setX(Stage.WIDTH - 350);
		player.setY(Stage.HEIGHT - 84);
		soundCache.playSound("../res/musica.wav");

	}

	public void initWorld2() {

		pelota.setX(Stage.WIDTH - 333);
		pelota.setY(Stage.HEIGHT - 103);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 30; j++) {
				Ladrillo ladrillo = new Ladrillo(this, i);
				ladrillo.setX(5 + j * 19 + 30);
				ladrillo.setY(i * 16 + 20);
				objetos.add(ladrillo);
			}
		}

		player.setX(Stage.WIDTH - 350);
		player.setY(Stage.HEIGHT - 84);
		soundCache.playSound("../res/musica.wav");

	}

	public void updateWorld() {

		int i=0;
		

		for (i = 0; i < objetos.size(); i++) {
			Objetos m = (Objetos) objetos.get(i);
			m.act();

			
			if (m.isMarkedForRemoval()) {
				Explosion e = new Explosion(this);
				e.setX(m.getX()+15);
				e.setY(m.getY());
				explosiones.add(e);
				objetos.remove(i);
				
			}
			
		}
		
		
		
		for (i=0;i<explosiones.size();) {
			Objetos m = (Objetos) explosiones.get(i);
			if (m.isMarkedForRemoval()) {
				explosiones.remove(i);
			}
			else
			{
				i++;
			}
		}
		for (i=0;i<explosiones.size();i++) {
			Objetos m = (Objetos) explosiones.get(i);
			m.act();
		}
		player.act();

		if ((player.left == true || player.right == true) && (pelota.espacio == false && pelota.contclick < 1)
				&& (pelota.segundos < 5000)) {
			pelota.setX(player.getX() + 20);
			pelota.setY(player.getY() - 20);
		}

	}

	public void checkCollisions() {

		Rectangle playerBounds = player.getBounds();
		for (int i = 0; i < objetos.size(); i++) {
			Objetos a1 = (Objetos) objetos.get(i);
			Rectangle r1 = a1.getBounds();
			if (r1.intersects(playerBounds)) {
				player.collision(a1);
				a1.collision(player);
			}
			for (int j = i + 1; j < objetos.size(); j++) {
				Objetos a2 = (Objetos) objetos.get(j);
				Rectangle r2 = a2.getBounds();
				if (r1.intersects(r2)) {
					a1.collision(a2);
					a2.collision(a1);
					// objetos.remove(a2);
				}

			}
		}
	}

	public class Raton implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent event) {
			if (pelota.contclick == 0 && event.getButton() == MouseEvent.BUTTON1) {
				pelota.Mouseclicked(event);

			}

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		imgFondo = spriteCache.getSprite("fondo4.jpg");
		imgGameOver = spriteCache.getSprite("gameover.png");
		g.setPaint(new TexturePaint(imgFondo, new Rectangle(0, t, imgFondo.getWidth(), imgFondo.getHeight())));
		if (pelota.contVidas == 0) {
			g.setPaint(new TexturePaint(imgGameOver,
					new Rectangle(0, t, imgGameOver.getWidth(), imgGameOver.getHeight())));
			milisegundosActuales = System.currentTimeMillis();
			segundos = milisegundosActuales - millis;
			if (segundos > 13000) {
				JOptionPane.showMessageDialog(null, "El Juego Ha Terminado");
				System.exit(0);
			}
		}
		g.fillRect(0, 0, getWidth(), getHeight());

		for (int i=0; i<explosiones.size();i++) {
			Objetos m = (Objetos) explosiones.get(i);
			m.paint(g);
		}

		player.paint(g);
		g.setColor(Color.white);

		for (int i = 0; i < objetos.size(); i++) {
			Objetos ladrillo = (Objetos) objetos.get(i);
			ladrillo.paint(g);
		}

		g.drawString("Vidas: " + pelota.contVidas, 560, 675);

		if (usedTime > 0)
			g.drawString(String.valueOf(1000 / usedTime) + " fps", 0, Stage.HEIGHT - 50);
		else
			g.drawString("--- fps", 0, Stage.HEIGHT - 50);
		strategy.show();

	}

	public SpriteCache getSpriteCache() {
		return spriteCache;
	}

	public void keyPressed(KeyEvent e) {
		player.keyPressed(e);
		pelota.keyPressed(e);

	}

	public void keyReleased(KeyEvent e) {
		player.keyReleased(e);
	}

	public void keyTyped(KeyEvent e) {
	}

	public void game() {
		usedTime = 1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			paintWorld();
			checkCollisions();

			usedTime = System.currentTimeMillis() - startTime;
			try {
				Thread.sleep(SPEED);
			} catch (InterruptedException e) {
			}
			if (objetos.size() == 1) {
				initWorld2();
				pelota.resetea();
				// game2();
			}

		}

	}

	public static void sleep(int segundos) {
		try {
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Arkanoid inv = new Arkanoid();
		inv.game();

	}

	@Override
	public SoundCache getSoundCache() {

		return soundCache;
	}

}
