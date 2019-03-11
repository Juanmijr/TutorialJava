package capituloXXX;


public class Jorge implements PalabraAvionetaIntroducidaListener {

public String id;
	
	
	public Jorge (String newId) {
		this.id = newId;
	}
	

	@Override
	public void nuevaPalabraAvionetaIntroducida(PalabraAvionetaIntroducidaEvent event) {
		System.out.println("Soy una mesa con identificador " + this.id + " y he recidibo un n�mero impar con valor: " + event.numeroIntroducido);
		
	}

}


