package capítulo4.Ejercicioprueba;

public class Matricula {

	private String fecha;
	private String codigo;
	private String modalidad;
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
	 * @param modalidad
	 */
	public Matricula(String fecha, String codigo, String modalidad) {
		super();
		this.fecha = fecha;
		this.codigo = codigo;
		this.modalidad = modalidad;
	}
	/**
	 * 
	 * @return
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * 
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * 
	 * @return
	 */
	public String getModalidad() {
		return modalidad;
	}
	/**
	 * 
	 * @param modalidad
	 */
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	
 
	
	
}
