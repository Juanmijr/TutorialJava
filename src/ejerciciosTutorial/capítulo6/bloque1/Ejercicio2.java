package capítulo6.bloque1;

public class Ejercicio2 {

	public static void main(String[] args) {
		float x = (float) 0;
		
		puntoCorte (x);

	}
	
	public static void puntoCorte (float x) {
		float y1;
		float y2;
		
		do {
			x += 0.0001;
			y1 = (float) Math.sqrt(x);
			System.out.println("x: " + x + ", y1: " + y1);
			y2 = (float) (0 - Math.log(x));
			System.out.println("x: " + x + ", y2: " + y2);

		}while (Math.abs(y2-y1)>0.0001);
	}

}
