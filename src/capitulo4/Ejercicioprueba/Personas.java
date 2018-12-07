package capítulo4.Ejercicioprueba;

public class Personas {

	private String nombre;
	private String apellidos;
	private String fechaNac;
	/**
	 * 
	 */
	public Personas() {
		super();
	}

	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 */
	public Personas(String nombre, String apellidos, String fechaNac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
	}

/**
 * 
 * @return
 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
}
