package ejerciciosTutorial.capítulo6.Exception;

import javax.swing.JOptionPane;


public class ComparadorException {

	private static String getException (String palabra) throws PalabrasException {
		StringBuffer sr = new StringBuffer();
		
		if (!palabra.contains("bombilla")) {
			throw new PalabrasException("La frase introducida no contiene la palabra bombilla");
		}
		else {
			sr.append("La frase introducida contiene bombilla");
			String[] palabras = palabra.split(" ");
			if (palabras.length<3) {
				throw new PalabrasException("La frase introducida tiene un tamaño inferior a 3 palabras");
			}
			else {
				sr.append("La frase introducida tiene más de 3 palabras");

				if (palabra.contains("tonto")|| palabra.contains("tonta") || palabra.contains("idiota")) {
					throw new PalabrasException("La frase introducida tiene alguna palabra inapropiada");
				}
			}
		}
		return sr.toString();
	}
	public static void main(String[] args) {
		try {
			String palabra = JOptionPane.showInputDialog("Introduce una frase: ");
			System.out.println(getException(palabra));
		} catch (PalabrasException e) {
			System.out.println("Existen excepciones en la frase: \n" + e.getMessage());
		}

	}
}


