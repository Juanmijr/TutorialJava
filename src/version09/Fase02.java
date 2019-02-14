package tutorialJava.Arkanoid.version09;

import java.util.ArrayList;
import java.util.List;


public class Fase02 extends Fase {
	// Propiedades est�ticas de la fase
		public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;
		
		@Override
		public void inicializaFase() {
			 // Inicializamos los ladrillos
		    int numLadrillosPosibles = Arkanoid.ANCHO / (Ladrillo.ANCHO + Ladrillo.ESPACIO_ENTRE_LADRILLOS);
		    int margenIzquierdo = (Arkanoid.ANCHO % (Ladrillo.ANCHO + Ladrillo.ESPACIO_ENTRE_LADRILLOS)) +100 / 2;
			int [][] matriz = {{0,0,7,6,6,6,7,0},
								{0,0,6,5,5,5,6,0},
								{0,0,7,6,6,6,7,0}};
			for (int x=0; x < matriz.length; x++) {
				  for (int y=0; y < matriz[x].length; y++) {
					  this.actores.add(new Ladrillo(margenIzquierdo + y * (Ladrillo.ANCHO + Ladrillo.ESPACIO_ENTRE_LADRILLOS), 
				    			ESPACIO_SUPERIOR_SOBRE_LADRILLOS + x * (Ladrillo.ALTO + Ladrillo.ESPACIO_ENTRE_LADRILLOS), matriz[x][y]));

				  }
			}
		}


	}
