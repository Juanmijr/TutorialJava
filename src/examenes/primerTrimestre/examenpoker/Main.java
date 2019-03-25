package examenpoker;

public class Main {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.empiezaBaraja();
		System.out.println(baraja.toString());
		baraja.bajaCarta();
		System.out.println(baraja.toString());
		baraja.arribaCarta();
		System.out.println("\n" + baraja.toString());
		baraja.mezclar();
		System.out.println("\n" + baraja.toString());
		baraja.ordenar();
		System.out.println("\n" + baraja.toString());
		

	}

}
