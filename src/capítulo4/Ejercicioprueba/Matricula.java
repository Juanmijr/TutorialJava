package capítulo4.Ejercicioprueba;

public class Matricula {

	private String fecha;
	private String codigo;
	
	/**
	 * 
	 */
	public Matricula() {
		super();
	}

	
	/**
	 * 
	 * @param fecha
	 * @param codigo
	 */
	public Matricula(String fecha, String codigo) {
		super();
		this.fecha = fecha;
		this.codigo = codigo;
	}


/**
 * 
 * @return
 */
	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
