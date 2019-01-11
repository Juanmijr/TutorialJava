package version1;

public abstract class Vehiculo {

	protected int x; // Posición horizontal que ocupa el vehículo
	protected String nombre; // Nombre del conductor o conductora del vehículo
	protected static String color; // Color del vehículo, codificado como 6 cifras hexadecimales
	int avance;
	int podium;
	
	

	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Vehiculo(String nombre, String color) {
		super();
		this.x = 0;
		this.nombre = nombre;
		this.color = color;
	}


	/**
	 * Método que permite el avance al azar del vehículo
	 */
	public void avanza () {
		avance = (int) Math.round(Math.random() * (50-3) + 3);
		this.x += avance;
	}
	
	

	
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", color=" + color + "]";
	}


	/**
	 * Método abstracto para que el vehículo se pinte a sí mismo en la consola
	 */
	public abstract String paint();
	
	public int getPodium() {
		return podium;
	}


	public void setPodium(int podium) {
		this.podium = podium;
	}


	public static String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
	
}
