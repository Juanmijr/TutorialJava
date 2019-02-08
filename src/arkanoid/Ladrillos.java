package arkanoid;

import java.awt.Rectangle;

public class Ladrillos extends Objetos{

	

	public Ladrillos(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	}

	public void collision(Objetos a) {
		if(a instanceof Pelota) {
			isTouched = true;
			toqueLadrillo();
			System.out.println("Estoy aqui");
		}
	}
	public void toqueLadrillo() {
		Rectangle ladoArriba = new Rectangle (x,y+1,width, 1);
		Rectangle ladoDerecha = new Rectangle (x+width-1,y,1, height);
		Rectangle ladoIzquierdo = new Rectangle (x,y,1, height);
		Rectangle ladoAbajo = new Rectangle (x,y+height-1,width, 1);
		
		boolean arriba = false, abajo = false, derecha = false, izquierda=false;
		
		if (Arkanoid.getInstancia().pelotaBounds.intersects(ladoArriba))	{
			arriba = true;
		}
		if (Arkanoid.getInstancia().pelotaBounds.intersects(ladoAbajo))	{
			abajo = true;
		}
		if (Arkanoid.getInstancia().pelotaBounds.intersects(ladoDerecha))	{
			derecha = true;
		}
		if (Arkanoid.getInstancia().pelotaBounds.intersects(ladoIzquierdo))	{
			izquierda = true;
		}
		
		
	}

}
