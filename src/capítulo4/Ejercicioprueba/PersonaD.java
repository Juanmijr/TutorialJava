package capítulo4.Ejercicioprueba;

import capítulo4.Ejercicioprueba.Personas;

public class PersonaD extends Personas {

	private String DNI;
/**
 * 
 */
	public PersonaD() {
		super();
		
	}
/**
 * 
 * @return
 */
	public String getDNI() {
		return DNI;
	}
/**
 * 
 * @param dNI
 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
/**
 * 
 */
	@Override
	public String toString() {
		return "PersonaD [DNI=" + DNI + ", getDNI()=" + getDNI() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getFechaNac()=" + getFechaNac() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
