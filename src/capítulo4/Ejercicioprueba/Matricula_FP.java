package capítulo4.Ejercicioprueba;

public class Matricula_FP extends Matricula {

	private boolean dual;
/**
 * 
 */
	public Matricula_FP() {
		super();
		
	}
/**
 * 
 * @return
 */
	public boolean isDual() {
		return dual;
	}
/**
 * 
 * @param dual
 */
	public void setDual(boolean dual) {
		this.dual = dual;
	}
/**
 * 
 */
	@Override
	public String toString() {
		return "Matricula_FP [dual=" + dual + ", isDual()=" + isDual() + ", getFecha()=" + getFecha() + ", getCodigo()="
				+ getCodigo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
