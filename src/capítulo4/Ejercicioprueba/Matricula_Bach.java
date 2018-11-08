package capítulo4.Ejercicioprueba;

public class Matricula_Bach extends Matricula {

	private String modalidad;
/**
 * 
 * @param modalidad
 */
	public Matricula_Bach(String modalidad) {
		super();
		this.modalidad = modalidad;
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

	@Override
	public String toString() {
		return "Matricula_Bach [modalidad=" + modalidad + ", getModalidad()=" + getModalidad() + ", getFecha()="
				+ getFecha() + ", getCodigo()=" + getCodigo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
