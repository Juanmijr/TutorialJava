package tutorialJava.capitulo4_OO.ejercicios.ejercicioExtra02_La_Oca.version05;

public class Jugador {
	private String nombre;
	private int posicion = 0;
	private Tablero tablero;
	
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
	public Jugador(String nombre, Tablero tablero) {
		super();
		this.nombre = nombre;
		this.tablero = tablero;
	}
	
	
	/**
	 * 
	 */
	public void tirarDado () {
		int dado = (int) Math.round(Math.random()*(6-1)+1);
		this.posicion += dado;
		if (this.posicion > tablero.getCasillas().length) {
			this.posicion = tablero.getCasillas().length - 
					(this.posicion - tablero.getCasillas().length);
		}
		
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
