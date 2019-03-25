package ejerciciosTutorial.capítulo6.eventos;

public class Escuchador implements NumerosIntroducidosListener {

	int ID ;

	public Escuchador(int ID) {
		super();
		this.ID = ID;
	}

	@Override
	public void nuevosNumerosIntroducidos(NumerosIntroducidosEvent newEvent) {
		System.out.println("Su número es de 3 dígitos. Mi id es " + this.ID );		
	} 
	
	
	
	
}
