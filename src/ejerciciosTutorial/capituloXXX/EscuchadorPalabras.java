package ejerciciosTutorial.capituloXXX;


public class EscuchadorPalabras implements PalabraAvionetaIntroducidaListener {

public int identificador;
	
	
	public EscuchadorPalabras (int newIdentificador) {
		this.identificador = newIdentificador;
	}


	@Override
	public void nuevaPalabraAvionetaIntroducida(PalabraAvionetaIntroducidaEvent event) {
		System.out.println("Escuchador. Mi id es " + this.identificador + 
				" y he recidibo evento por el n�mero " + event.palabraIntroducida);
		
	}
}
