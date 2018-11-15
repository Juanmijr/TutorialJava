package capítulo4.ejercicioExtra02_La_Oca.version06;

import javax.swing.JOptionPane;

public class Jugador {  
	private String nombre;
	private int posicion = 0;
	private Casilla destino = null;
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
		int dado = 4;//(int) Math.round(Math.random()*(6-1)+1);
		//Sumo dado a la posición actual
		this.posicion += dado;
		//Cálculo de posible rebote
		if (this.posicion > Tablero.getTablero().getCasillas().length) {
			this.posicion = Tablero.getTablero().getCasillas().length - 
					(this.posicion - Tablero.getTablero().getCasillas().length);
			}
		//Comprobamos si estamos en una casilla actual
		//Puntero a la casilla correspondiente del array 
			Casilla casillaActual= Tablero.getTablero().getCasillas()[this.posicion];
		//Imprimo contenido de la casilla actual 
			System.out.println("Estamos en la casilla de índice " + this.posicion +
				" - Orden: " + casillaActual.getOrden() +
				" - Nombre: " + casillaActual.getNombre());
		//Busco un destino de la casilla actual
			if(casillaActual.getDestino()!= null) { //Hay un destino 
				Casilla casilladestino = casillaActual.getDestino();
		//Imprime casilla de destino 
				System.out.println("La casilla de destino es: " + 
						" - Orden: " + casilladestino.getOrden() +
						" - Nombre: " + casilladestino.getNombre());
		//Actualizar la posición del jugador, teniendo en cuenta que ha caido
		//en una casilla especial
				
				this.posicion = casilladestino.getOrden()-1;
			}
			
			JOptionPane.showMessageDialog(null, "alto");
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
