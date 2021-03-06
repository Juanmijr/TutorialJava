package capitulo4.formula1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaEmergente {

	/**
	 * El m�todo simplemente muestra en pantalla un mensaje con la posibilidad
	 * de personalizar los botones.
	 * @param mensaje
	 */
	public static void muestraVentanaEmergente (String mensaje) {
		// Array con las opciones a mostrar en la ventana emergente
		String[] opciones = {"Continuar", "Abandonar el juego"};
		
		// La ventana emergente devuelve un valor entero, correspondiente
		// con la opci�n elegida por el usuario
		int opcionElegida = JOptionPane.showOptionDialog(null, // Componente "padre" de la ventana emergente, de momento utiliza siempre "null"
				mensaje, // Mensaje a mostrar en la ventana
				"Fórmula 1", // T�tulo de la ventana
				JOptionPane.YES_NO_CANCEL_OPTION, // Tipo de ventana emergente 
				JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje a mostrar
				null, opciones, // Array de elementos a mostrar en forma de bot�n 
				0); // Bot�n "por defecto"
		
		// Comprobaci�n de la opci�n elegida por el usuario
		if (opcionElegida == 1) { // Si la opci�n elegida es la de �ndice "1", salimos
			System.exit(0);
		}
	}
}
