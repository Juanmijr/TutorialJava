package version1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
// libremente.
public class Ventana extends Canvas {

	// Declaración de variables que nos permitirán introducir el ancho y el alto
	// de la ventana
	public static final int ANCHO = 654;
	public static final int ALTO = 673;
	public static final int LADO_CUADRADO_FICHA_JUGADOR = 10;
	public static final int ESPACIO_ENTRE_FICHAS_JUGADORES = 3;

	// Incorporación de un patrón Singleton a esta clase
	public static Ventana ventana = null;
	
	// Utilización del doble buffer
	private BufferStrategy dobleBuffer;

	
	/**
	 * 
	 */
	public Ventana () {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("Juego de Fórmula 1");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,ANCHO,ALTO);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le añadimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tamaño del canvas (this) para que ocupe todo el tamaño de la ventana
		this.setBounds(0,0,ANCHO,ALTO);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);

		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);

		// Inicializo el doble buffer a partir del buffer del propio objeto Canvas
		createBufferStrategy(2);
		dobleBuffer = getBufferStrategy();
		
	}
	
	
	/**
	 * Repinta la ventana con una estructura de doble búffer
	 */
	public void repintarVentana () {
		// Obtengo el objeto de tipo gráfico asociado al doble búffer, me permitirá pintar
		Graphics g = dobleBuffer.getDrawGraphics();
		
		// Pintamos la imagen del tablero sobre la pantalla
		g.setColor(Color.decode("#317f43"));
		g.fillRect(0, 0, WIDTH, HEIGHT);

		// Ahora pintamos los jugadores sobre el tablero, tendremos que recorrer
		// a todos los jugadores, independientemente de si han acabado o no
		
		// Primero utilizo una referencia, un puntero, al array de jugadores.
		// Esto sólo lo hago por tener un código más limpio dentro del bucle
		Vehiculo vehiculos[] = Carrera.getCarrera().getVehiculos();
		// Recorro a todos los jugadores
		for (Vehiculo vehiculo : vehiculos) {
			// Finalmente se pinta el rectángulo con el color del jugador
			g.setColor(Color.decode("#" + Vehiculo.getColor()));
			g.fillRect(xFichaJugador, yPista, LADO_CUADRADO_FICHA_JUGADOR, LADO_CUADRADO_FICHA_JUGADOR);
		}
		
		// Muestro la nueva escena creada
		dobleBuffer.show();
	}
	
	
	
	
	/**
	 * Patrón Singleton
	 * @return
	 */
	public static Ventana getVentana() {
		if (ventana == null) {
			ventana = new Ventana();
		}
		return ventana;
	}	
	
	
	
	/**
	 * Necesitamos poder saber cuantos jugadores ya se encuentran en una casilla,
	 * de esa manera podemos dibujar los jugadores apilados cuando coincidan en la
	 * misma casilla
	 * @param casillaBuscada
	 * @return
	 */
	private int getContadorJugadoresAnterioresEnMismaCasilla (Jugador jugador) {
		int contador = 0;
		// Utilizo una referencia, un puntero, al array de jugadores, sólo por comodidad
		// y por claridad en el código.
		Jugador jugadores[] = Juego.getJuego().getJugadores();
		// Recorrido de todos los jugadores
		for (int i = 0; i < jugadores.length; i++) {
			// Como quiero encontrar los jugadores anteriores al jugador que nos interesa,
			// en el momento en que encontremos a nuestro jugador, el bucle debe acabar
			if (jugadores[i].equals(jugador)) {
				break;
			}
			// Si la casilla ocupada por un jugador es la misma que la casilla buscada,
			// significa que el jugador ya se encuentra en esa casilla.
			if (jugadores[i].getCasilla().equals(jugador.getCasilla())) {
				contador++;
			}
		}
		// Devolvemos el contador actualizado.
		return contador;
	}
}
		