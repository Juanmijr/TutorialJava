import javax.swing.JOptionPane;

public class EjercicioCB21 {

	public static void main(String[] args) {
		String texto = "Introduce un n�mero";
		int acumuladorNegativos =0; //Acumulador para n�meros negativos
		int acumuladorBajos =0; //Acumulador para n�meros negativos
		int acumuladorMedios =0; //Acumulador para n�meros negativos
		int acumuladorAltos =0; //Acumulador para n�meros negativos
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			if (num1<0) {
				acumuladorNegativos = acumuladorNegativos + num1;
			}
			else {
				if (num1<=25) {
					acumuladorBajos = acumuladorBajos + num1;}
					}
					else (num1<=250) {
						acumuladorMedios = acumuladorMedios + num1;
					}
				else {
					acumuladorAltos = acumuladorAltos + num1;
				}
			}
			}
			
		
