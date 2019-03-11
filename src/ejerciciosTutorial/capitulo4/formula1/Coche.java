package capitulo4.formula1;

public class Coche extends Vehiculo {

	/**
	 * 
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Coche(String nombre, String color) {
		super(nombre, color);
	}

	/**
	 * Implementaci�n del m�todo abstracto que pinta el coche
	 */
	@Override
	public String paint() {
		return "Coche: " + this.nombre + " - " + this.x;
	}

}
