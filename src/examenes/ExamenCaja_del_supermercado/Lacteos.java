package examenes.ExamenCaja_del_supermercado;

public class Lacteos extends Articulo {

	String tipoLacteo ;
	public Lacteos(String iD, String nombre, int cantArticulos, float precio, String tipoLacteo) {
		super(iD, nombre, cantArticulos, precio);
		// TODO Auto-generated constructor stub
		this.tipoLacteo = tipoLacteo;
	}

	@Override
	public String getDescripcion() {
		return " [ID=" + ID + ", Nombre=" + Nombre + ", CantArticulos=" + CantArticulos + ", Precio=" + precio
				+ ", Tipo de Lácteo= " + tipoLacteo + "]";		
	}
}
