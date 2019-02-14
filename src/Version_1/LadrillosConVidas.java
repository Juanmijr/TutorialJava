package Version_1;

public class LadrillosConVidas extends Ladrillo {
	protected String nombre [] = new String [] {"amarilloo.png"};
	protected int contVidasLadrillo=2;

	public LadrillosConVidas(Stage stage, int i) {
		super(stage, i);
		setSpriteNames(new String[] {nombre[i]} );

	}
		public void collision(Objetos a) {
		if (a instanceof Pelota) {
			contVidasLadrillo--;
			if(contVidasLadrillo == 0) {
				remove();
			}
			
		}
	
	}
}
