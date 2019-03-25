package ejerciciosTutorial.capítulo6.eventos;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Main {

	private static List <NumerosIntroducidosListener> listenersNumeros = new ArrayList <NumerosIntroducidosListener>();
	
	public static void addNumeroIntroducidoListener (NumerosIntroducidosListener listener) {
		listenersNumeros.add(listener);
	}
	
	public static void removeNumerosIntroducidoListener (NumerosIntroducidosListener listener) {
		for (int i = 0; i < listenersNumeros.size(); i++) {
			if (listenersNumeros.get(i).equals(listener)) {
				listenersNumeros.remove(i);
			}
		}
	}
	
	
	private static void fireNumeroImparIntroducidoListeners (NumerosIntroducidosEvent event) {
		for (int i = 0; i < listenersNumeros.size(); i++) {
			listenersNumeros.get(i).nuevosNumerosIntroducidos(event);
			
		}		
	}
	
	
	
	
	
	public static void main(String[] args) {
	String numUsuario;
		Escuchador escuchador1 = new Escuchador(1);
		addNumeroIntroducidoListener(escuchador1);
		
		do {
			numUsuario = JOptionPane.showInputDialog("Introduzca un número");
			int contDigitos=0;

			for (int i = 0 ; i< numUsuario.length(); i++) {
				if(Character.isDigit(numUsuario.charAt(i))) {
					contDigitos++;
				}
			}
			
			if (contDigitos == 3) {
				 NumerosIntroducidosEvent event = new NumerosIntroducidosEvent("3");
				fireNumeroImparIntroducidoListeners(event);
			}
			
		} while (!numUsuario.trim().equals("") );
	}

}
