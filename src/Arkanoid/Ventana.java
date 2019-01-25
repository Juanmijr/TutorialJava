package Arkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends Canvas {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	public static final int SPEED = 10;
	
	public BufferStrategy strategy;
	public HashMap sprites;
	public int posX,posY,vX, vY;
	public long usedTime;
	
	public Ventana() {
		sprites = new HashMap();
		posX = WIDTH/2;
		posY = HEIGHT/2;
		vX = 2;
		vY = 2;
	
		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,WIDTH,HEIGHT);
		panel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
	}
	
	public BufferedImage loadImage(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource(nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getSprite(String nombre) {
		BufferedImage img = (BufferedImage)sprites.get(nombre);
		if (img == null) {
			img = loadImage("res/"+nombre);
			sprites.put(nombre,img);
		}
		return img;
	}
	
	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics g = strategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(getSprite("EnergyBall.png"), posX, posY,this);

		g.setColor(Color.white);
		if (usedTime > 0)
			g.drawString(String.valueOf(1000/usedTime)+" fps",0,HEIGHT-50);
		else
			g.drawString("--- fps",0,HEIGHT-50);
		strategy.show();
	}
	

	
	public void updateWorld() {
		posX += vX;
		posY += vY;
		if (posX < 0 || posX > WIDTH) vX = -vX;
		if (posY<0 || posY>HEIGHT-30) vY = -vY;
	}
	
	public void game() {
		usedTime=1000;
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Ventana ark = new Ventana();
		ark.game();
	}
}