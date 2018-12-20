package capitulo4.tresenraya;

import java.awt.Color;
import java.awt.Graphics;

public class Celda {
	private static final int LADO=3;
	private int x,y;
	private static final Color[] colors = new Color[] {Color.GREEN, Color.BLUE, Color.yellow, Color.black, Color.PINK, Color.RED, Color.WHITE, Color.ORANGE};
	
	public Celda(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void paint(Graphics g) {
		g.setColor(colors[(int) Math.random()*(colors.length-1)]);
		g.fillRect(this.x, this.y, LADO, LADO);
	}
	
	public boolean isEnCoordenadas (int xPunto, int yPunto) {
		if (xPunto > this.x && xPunto < (this.x + LADO)&& yPunto > this.y && yPunto < (this.y + LADO)) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 */
	public void mouseClicked() {
		Matriz.getInstance().matriz()[this.x/LADO][this.y/LADO]=1;
		Matriz.getInstance().print();
		System.out.println();
	}
	
/**
 * 
 * @return
 */
	public int getX() {
		return x;
	}
/**
 * 
 * @return
 */
	public int getY() {
		return y;
	}



	
	
}
