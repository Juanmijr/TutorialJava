package version1;

public class ManchaAceite extends Obstaculo {

	
	@Override
	void inicializa() {
		valorObstaculo = (int) Math.round(Math.random() * ((-10)-(-50)) +(-50));
		
		
	}

}
