package capítulo6.BloqueHashMap;

public class Articulo {

	String CodBarras;
	String Estante;
	String Descripcion;
	
	public Articulo(String codBarras, String estante, String descripcion) {
		super();
		CodBarras = codBarras;
		Estante = estante;
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Articulo [CodBarras=" + CodBarras + ", Estante=" + Estante + ", Descripcion=" + Descripcion + "]\n";
	}
	
	
	
	
}
