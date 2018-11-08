package capítulo4.Ejercicioprueba;

public class Matricula_ESO extends Matricula {

	private boolean pmar;
/**
 * 
 */
	public Matricula_ESO() {
		super();
		
	}
/**
 * 
 * @return
 */
	public boolean isPmar() {
		return pmar;
	}
/**
 * 
 * @param pmar
 */
	public void setPmar(boolean pmar) {
		this.pmar = pmar;
	}
/**
 * 
 */
	@Override
	public String toString() {
		return "Matricula_ESO [pmar=" + pmar + ", isPmar()=" + isPmar() + ", getFecha()=" + getFecha()
				+ ", getCodigo()=" + getCodigo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
