package examenes.ExamenCaja_del_supermercado;

public class LimpiezaYHogar extends Articulo {
	String marca;
	public LimpiezaYHogar(String iD, String nombre, int cantArticulos, float precio, String marca) {
		super(iD, nombre, cantArticulos, precio);
		// TODO Auto-generated constructor stub
		this.marca = marca;
	}
	
	@Override
	public String getDescripcion() {
		return " [ID=" + ID + ", Nombre=" + Nombre + ", CantArticulos=" + CantArticulos + ", Precio=" + precio
				+ ", Marca: " + marca+ "]";		
	}

}
