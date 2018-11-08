package capítulo4.Ejercicioprueba;

public class PersonaND extends Personas {
	
	private String descripcion;
	/**
	 * 
	 */
	public PersonaND() {
		super();
		
	}
	/**
	 * 
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "PersonaND [descripcion=" + descripcion + ", getDescripcion()=" + getDescripcion() + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getFechaNac()=" + getFechaNac()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
