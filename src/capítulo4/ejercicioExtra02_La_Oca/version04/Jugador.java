package capítulo4.ejercicioExtra02_La_Oca.version04;

public class Jugador {
	private String nombre;
	private int posicion = 0;
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param posicion
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	/**
	 * 
	 */
	public void tirarDado () {
		this.posicion += (int) Math.round(Math.random()*(6-1)+1);
	}
	
	
	public void imprimir() {
		System.out.println(this.nombre + " - pos: " + this.posicion);
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
}
