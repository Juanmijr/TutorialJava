package ejerciciosTutorial.capituloXXX;

import java.awt.List;
import java.util.ArrayList;

import tutorialJava.Utils;
import tutorialJava.capituloXXX.creacionEventoPropio.EscuchadorNumeros;
import tutorialJava.capituloXXX.creacionEventoPropio.Mesa;
import tutorialJava.capituloXXX.creacionEventoPropio.NumeroImparIntroducidoEvent;
import tutorialJava.capituloXXX.creacionEventoPropio.NumeroImparIntroducidoListener;


public class IntroduccionPalabraUsuario {
	
private static List<PalabraAvionetaIntroducidaListener> numeroImparIntroducidolisteners = new ArrayList<PalabraAvionetaIntroducidaListener> ();
	
	
	
	public static void addPalabraAvionetaIntroducidaListener (PalabraAvionetaIntroducidaListener newListener) {
		numeroImparIntroducidolisteners.add(newListener);
	}
	
	
	public static void removePalabraAvionetaIntroducidaListener (PalabraAvionetaIntroducidaListener listener) {
		for (int i = 0; i < numeroImparIntroducidolisteners.size(); i++) {
			if (numeroImparIntroducidolisteners.get(i).equals(listener)) {
				numeroImparIntroducidolisteners.remove(i);
			}
		}
	}
	
	
	public static void firePalabraAvionetaIntroducidaListeners (int numero) {
		for (int i = 0; i < numeroImparIntroducidolisteners.size(); i++) {
			numeroImparIntroducidolisteners.get(i).nuevoNumeroImparIntroducido(new NumeroImparIntroducidoEvent(numero));
		}		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int numUsuario;
				
		Jorge jorge1 = new Jorge("Jorge");
		addPalabraAvionetaIntroducidaListener(jorge1);
		
		
		do {
			System.out.print("Por favor, introduzca un n�mero: ");
			numUsuario = Utils.obtenerEntero();
			
			if (numUsuario % 2 == 1) { // Es impar
				fireNumeroImparIntroducidoListeners(numUsuario);
			}
			
		} while (numUsuario != 0);

	}

}