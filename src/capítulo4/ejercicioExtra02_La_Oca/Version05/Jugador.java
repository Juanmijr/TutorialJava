package capítulo4.ejercicioExtra02_La_Oca.Version05;

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
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public Jugador(String nombre, int posicion, Tablero tablero) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.tablero = tablero;
	}

	/**
	 * 
	 */
	public void tirarDado () {
		int dado =  (int) Math.round(Math.random()*(6-1)+1);
		System.out.println("Dado " + dado);
		this.posicion += dado;
		if(posicion> tablero.getTablero().length) {
			this.posicion =  tablero.getTablero().length - (this.posicion -  tablero.getTablero().length);
		}
	}
	
	
	public void imprimir() {
		System.out.println(this.nombre + " - pos: " + (this.posicion+1));
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
