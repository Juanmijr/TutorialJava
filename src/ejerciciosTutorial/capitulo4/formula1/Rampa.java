package capitulo4.formula1;

public class Rampa extends Obstaculo {

	@Override
	void inicializa() {
		valorObstaculo = (int) Math.round(Math.random() * ((50)-(100)) +(50));
		
		
	}
}
