package examenes.ExamenDianaDeDardos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;

import examenes.ExamenCaja_del_supermercado.Caja;
import tutorialJava.capitulo4_OO.ejercicios.ejercicioExtra02_La_Oca.version17.Jugador;





public class Principal implements metodoJugarInterface{
	private static Principal instancia= null;
	private static Properties propiedades = null;
	
	
	/**
	 * Getter Singleton
	 * @return
	 */
	public static Principal getInstancia () {
		if (instancia == null) {
			instancia = new Principal();
		}
		return instancia;
	}
	
	 public static List <Jugador> partida = new ArrayList<Jugador>();
	 public static List <NumTiradas> tiradas = new ArrayList<NumTiradas>();
	 private static List<centroDianaListener> centro = new ArrayList <centroDianaListener>();
	 
	public static void creaListas () {
		partida.add(new Jugador("Juanmi", 0));
		partida.add(new Jugador("Jesús", 0));
		partida.add(new Jugador("Jorgito",0));
		partida.add(new Jugador("Enrique",0));
		
		for (int i = 0 ; i<= 21 ; i++) {
			tiradas.add(new NumTiradas(i,"Numero " + (i+1) , i+1, Utils.obtenerNumeroAzar(10, 100)));
		}
	
		
		
	}
	
	/**
	 * 
	 * @param string 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {

				File file = new File("./src/examenes/ExamenDianaDeDardos/nombre.properties");

				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}
	
	public static void addCentroDianaListener (centroDianaListener newListener) {
		centro.add(newListener);
	}
	
	
	public static void removeCentroDianaListener (centroDianaListener listener) {
		for (int i = 0; i < centro.size(); i++) {
			if (centro.get(i).equals(listener)) {
				centro.remove(i);
			}
		}
	}
	
	
	public static void fireCentroDianaListeners (Jugador jugador) {
		for (int i = 0; i < centro.size(); i++) {
			centro.get(i).nuevoCentroDiana(new centroDianaEvent(jugador));
		}		
	}
	
	
	public void acierto (int i, int jugador) {
		partida.get(jugador).setPuntuacion(tiradas.get(i).probabilidad + partida.get(jugador).getPuntuacion());
		JOptionPane.showMessageDialog(null, "Has conseguido: " + tiradas.get(i).puntuacion + 1 + " \n Tu puntuación es: " + partida.get(jugador).getPuntuacion());
	}
	
	public void aciertoCentro (int i, int jugador, int turno) {
		fireCentroDianaListeners(partida.get(jugador));
		turno++;
		i=0;
	}
		
	public void fallado (int turno, int i) {
		turno++;
		i++;
	}
	
	public void tirada (int i, int turno, int jugador, int num) {
		System.out.println(num);
		if (num == 0) {
			if (tiradas.get(i).probabilidad > 50) {
			acierto(i,jugador);
				if(tiradas.get(i).id == 22) {
					aciertoCentro(i,jugador,turno);
				}
				else {
					turno++;
					i =0;
				}
			}
			else {
				fallado(turno, i);
				turno++;
				i=0;
			}

		}
	
	}


		
	@Override
	public void jugar() {
		for (int turnos = 0; turnos <= 10; turnos++) {
			JOptionPane.showMessageDialog(null, "Tirada: " + (turnos+1));
			for (int jugador = 0; jugador < partida.size(); jugador++) {
				for (int turno = 0; turno <= 2; turno++) {
					JOptionPane.showMessageDialog(null, "Turno " + (turno + 1) + " del jugador: " + (jugador + 1));
					for (int i = 0; i < tiradas.size(); i++) {
						int num = JOptionPane.showConfirmDialog(null,"¿Quiere tirar al " + tiradas.get(i).descripcion + "?");
						
						tirada(i,turno,jugador,num);
					}
				}
			}
		}
	
	
						
		}
	
	/**
	 * 
	 * @return
	 */
	public int getMaximoValorEnPodium (Jugador [] jugadores) {
		// Este m�todo obtiene el m�ximo valor de podium del conjunto de jugadores.
		// Si ning�n jugador ha llegado a la meta, todos los jugadores tendr�n en su
		// "podium" el valor "0".
		int maxValor = 0;
		
		// Comprobamos que el array tenga al menos un elemento
		if (jugadores.length > 0) {
			maxValor = jugadores[0].getPodium(); // Asignamos el m�ximo valor de podium al que tenga el primer jugador
			// Recorremos todos los jugadores, buscando un valor de podium m�s alto,
			// comenzando por el segundo jugador y llegando hasta el �ltimo.
			for (int i = 1; i < jugadores.length; i++) {
				if (jugadores[i].getPodium() > maxValor) {
					maxValor = jugadores[i].getPodium();
				}
			}
		}
		return maxValor;
	}
	
	public Jugador[] meteListaEnArray() {
		Jugador[] jugadores = new Jugador [partida.size()];
		for (int i = 0; i<=partida.size();i++) {
				jugadores[i] = partida.get(i);
			
		}
		return jugadores;
	}

	/**
	 * 
	 * @param jugadores
	 */
	public void ordenaArrayJugadoresPorPodium (Jugador[] jugadores) {
		// Ordenaci�n por el m�todo de la burbuja, para que los jugadores queden
		// ordenados por orden de llegada a la meta
		for (int i = jugadores.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (jugadores[j].getPodium() > jugadores[j+1].getPodium()) {
					Jugador aux = jugadores[j];
					jugadores[j] = jugadores[j+1];
					jugadores [j+1] = aux;
				}
			}
		}		
	}

	
	/**
	 * 
	 */
	public void imprimeJugadores (Jugador[] jugadores) {
		// Imprimo array de jugadores
		System.out.println("\n\nPodium de jugadores");
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i].toString());
		}
	}
	
	public void podium () {
		Jugador[] jugadores = meteListaEnArray();
		getMaximoValorEnPodium(jugadores);
		ordenaArrayJugadoresPorPodium(jugadores);
		imprimeJugadores(jugadores);
	}


		
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido a: " + Principal.getProperty("NOMBRE"));
		creaListas();
		Principal.getInstancia().jugar();
		Principal.getInstancia().podium();
		
		
		
	}

	

}
