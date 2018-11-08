package capítulo4.Ejercicio02;

public class Mueble extends Antiguedad {

	private String epoca;

	public Mueble() {
		super();
		this.epoca="Sin especificar";
	}
	
	public Mueble(int anyoFabricacion, String origen, float precio) {
		super(anyoFabricacion, origen, precio);
		epoca = epoca;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	@Override
	public String toString() {
		return "Mueble [epoca=" + epoca + ", getEpoca()=" + getEpoca() + ", getAnyoFabricacion()="
				+ getAnyoFabricacion() + ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
