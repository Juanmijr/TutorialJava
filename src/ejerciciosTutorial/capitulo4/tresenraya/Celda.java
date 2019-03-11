package capitulo4.tresenraya;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Celda {
	public static final int LADO=3;
	private int x,y;
	private Ventana ventana; 
	private boolean moving = false;
	private Jugador jugador=null;
	private static final Color[] colors = new Color[] {Color.GREEN, Color.BLUE, Color.yellow, Color.black, Color.PINK, Color.RED, Color.WHITE, Color.ORANGE};
	public static final int PADDING=10;
	
	public Celda(int x, int y, Ventana ventana) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void paint(Graphics g) {
		g.setColor((this.moving)? Color.YELLOW : Color.WHITE);
		g.fillRect(this.x, this.y, LADO, LADO);
		if (this.jugador!=null) {
			this.jugador.paint(g, this.x, this.y);
		}
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
		if (this.jugador!=null && !this.jugador.equals(Principal.getJugadorTurnoActivo())) {
			JOptionPane.showMessageDialog(null, "Esta casilla no te pertenece");
			return;
		}
		if (this.jugador!= null) {
			this.moving =! moving;
		}
		this.jugador=Principal.getJugadorTurnoActivo();
		
		Matriz.getInstance().getMatriz()[this.x/LADO][this.y/LADO]= this.jugador.getCodigo();
		Matriz.getInstance().print();
		System.out.println();
		
		Principal.avanzaTurno();
		ventana.revalidate();
		ventana.repaint();
		
		if(Matriz.getInstance().isJuegoTerminado()) {
			JOptionPane.showMessageDialog(null, "JUEGO TERMINADO");
		}
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
