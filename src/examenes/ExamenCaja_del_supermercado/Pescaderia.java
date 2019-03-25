package examenes.ExamenCaja_del_supermercado;

public class Pescaderia extends Articulo {
	float kilo; 
	
	public Pescaderia(String iD, String nombre, int cantArticulos, float precio, float kilo) {
		super(iD, nombre, cantArticulos, precio);
		// TODO Auto-generated constructor stub
		this.kilo = kilo;
	}

	@Override
	public String getDescripcion() {
		return " [ID=" + ID + ", Nombre=" + Nombre + ", CantArticulos=" + CantArticulos + ", Precio=" + precio
				+ "Kilos=" + kilo + "]";		
	}

}
