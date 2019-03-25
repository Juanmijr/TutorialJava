package examenes.ExamenCaja_del_supermercado;

import java.awt.Graphics;

public abstract class Articulo {

	public String ID;
	public String Nombre;
	public int CantArticulos;
	public float precio;
	
	public Articulo(String iD, String nombre, int cantArticulos, float precio) {
		super();
		this.ID = iD;
		this.Nombre = nombre;
		this.CantArticulos = cantArticulos;
		this.precio = precio;
		
	}

	public abstract String getDescripcion();

	
	
	
}
