import arkanoid.Objetos;
import tutorialJava.SpaceInvaders.version28.Actor;
import tutorialJava.SpaceInvaders.version28.Stage;

public class Pocimas extends Objetos {
	protected static final int BULLET_SPEED=10;
	public Pocimas(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"misil.gif"});
			
			public void act() {
				super.act();
				y-=BULLET_SPEED;
				if (y < 0)
				  remove();
			}
			private void remove() {
				// TODO Auto-generated method stub
				
			}
		}
	}

}
