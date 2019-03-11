package capitulo4.formula1;

public abstract class Vehiculo {

	private int x; // Posici�n horizontal que ocupa el veh�culo
	protected String nombre; // Nombre del conductor o conductora del veh�culo
	protected static String color; // Color del veh�culo, codificado como 6 cifras hexadecimales
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
	 * M�todo que permite el avance al azar del veh�culo
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
	 * M�todo abstracto para que el veh�culo se pinte a s� mismo en la consola
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
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}

	
	
}
