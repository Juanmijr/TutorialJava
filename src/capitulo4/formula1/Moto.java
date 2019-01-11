package capitulo4.formula1;

public class Moto extends Vehiculo {
	
	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Moto(String nombre, String color) {
		super(nombre, color);
	}

	/**
	 * Implementaci�n del m�todo abstracto que pinta la moto
	 */
	@Override
	public String paint() {
		return "Moto: " + this.nombre + " - " + this.x;
	}

}
