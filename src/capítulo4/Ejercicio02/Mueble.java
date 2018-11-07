package capítulo4.Ejercicio02;

public class Mueble extends Antiguedad {

	private String epoca;

	public Mueble() {
		super();
		this.epoca="Sin especificar";
	}

	public Mueble(int anyoFabricacion, String origen, float precio) {
		super(anyoFabricacion, origen, precio);
		this.epoca = epoca;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}
	
	
}
