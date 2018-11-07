package capítulo4.Ejercicio02;

public class Joya extends Antiguedad {

	private String material;

	public Joya() {
		super();
	}

	public Joya(int anyoFabricacion, String origen, float precio, String material) {
		super(anyoFabricacion, origen, precio);
		this.material=material;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + ", getAnyoFabricacion()=" + getAnyoFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
