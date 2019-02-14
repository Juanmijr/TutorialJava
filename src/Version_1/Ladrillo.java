package Version_1;

import java.awt.Rectangle;

public class Ladrillo extends Objetos {
	protected int contLadrillos=2;
	protected String nombre [] = new String [] {"azull.png", "moradoo.png", 
			"verdee.png","amarilloo.png", "azull.png", "moradoo.png", "verdee.png"};
	
	public Ladrillo(Stage stage, int i) {
		super(stage);
	
		setSpriteNames(new String[] {nombre[i]} );
		
	}

	public void collision(Objetos a) {
		if (a instanceof Pelota) {
			remove();
			
			
		}

	
	
	}
}
	
	

