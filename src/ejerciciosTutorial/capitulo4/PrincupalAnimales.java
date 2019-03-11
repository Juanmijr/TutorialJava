package capítulo4;

public class PrincupalAnimales {

	public static void main(String[] args) {
		Animal perrito = new Animal ("Toby");
		perrito.alturaCm = (float) 12.5;
		perrito.longitudCm = (float) 32.2;
		perrito.color = "ROJO";
		perrito.edad = 5;
		perrito.imprimirCaracteristicas();

	}

}
