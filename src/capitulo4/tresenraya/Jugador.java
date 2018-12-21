package capitulo4.tresenraya;

import java.awt.Graphics;

public abstract class Jugador {
	private String nombre;
	private int codigo;
/**
 */
	public Jugador(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
/**
 * 
 * @return
 */
	public String getNombre() {
		return nombre;
	}
	
	
	public int getCodigo() {
	return codigo;
}
	public abstract void paint(Graphics g, int offsetX , int offsetY);
	
	
}
