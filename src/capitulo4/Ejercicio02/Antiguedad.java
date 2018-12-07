package capítulo4.Ejercicio02;

public class Antiguedad {

	private int anyoFabricacion;
	private String origen;
	private float precio;
	
	public Antiguedad() {
		super();
		System.out.println("Contructor de antiguedad");
		
	}
	

	public Antiguedad(int anyoFabricacion, String origen, float precio) {
		super();
		this.anyoFabricacion = anyoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}


	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}





}
