package cap�tulo2;
import javax.swing.JOptionPane;

public class EjercicioCB21 {

	public static void main(String[] args) {
		String texto = "Introduce un n�mero";
		int acumuladorNegativos =0; //Acumulador para n�meros negativos
		int acumuladorBajos =0; //Acumulador para n�meros negativos
		int acumuladorMedios =0; //Acumulador para n�meros negativos
		int acumuladorAltos =0; //Acumulador para n�meros negativos
			
//Primer n�mero
		int num = Integer.parseInt(JOptionPane.showInputDialog(texto));
		
		if (num < 0) {
			acumuladorNegativos = acumuladorNegativos + num;
		}
		else {
			if (num <= 25) {
				acumuladorBajos = acumuladorBajos + num;
			}
			else {
				if (num <= 250) {
					acumuladorMedios = acumuladorMedios + num;
				}
				else {
					acumuladorAltos = acumuladorAltos + num;
				}
			}
		}
		
		// segundo n�mero
		num = Integer.parseInt(JOptionPane.showInputDialog(texto));
		
		if (num < 0) 
			acumuladorNegativos = acumuladorNegativos + num;
		else 
			if (num <= 25)
				acumuladorBajos = acumuladorBajos + num;
			else 
				if (num <= 250)
					acumuladorMedios = acumuladorMedios + num;
				else
					acumuladorAltos = acumuladorAltos + num;
			
		// tercer n�mero
		num = Integer.parseInt(JOptionPane.showInputDialog(texto));
		
		if (num < 0) 
			acumuladorNegativos += num;
		else 
			if (num <= 25)
				acumuladorBajos += num;
			else 
				if (num <= 250)
					acumuladorMedios += num;
				else
					acumuladorAltos += num;
			
		// cuarto n�mero
		num = Integer.parseInt(JOptionPane.showInputDialog(texto));
		
		if (num < 0) 
			acumuladorNegativos += num;
		else 
			if (num <= 25)
				acumuladorBajos += num;
			else 
				if (num <= 250)
					acumuladorMedios += num;
				else
					acumuladorAltos += num;
			
		// quinto n�mero
		num = Integer.parseInt(JOptionPane.showInputDialog(texto));
		
		if (num < 0) 
			acumuladorNegativos += num;
		else 
			if (num <= 25)
				acumuladorBajos += num;
			else 
				if (num <= 250)
					acumuladorMedios += num;
				else
					acumuladorAltos += num;

		
		// Resultados de las acumulaciones
		
		System.out.println("Acumulador negativos " + acumuladorNegativos);
		System.out.println("Acumulador bajos " + acumuladorBajos);
		System.out.println("Acumulador medios " + acumuladorMedios);
		System.out.println("Acumulador altos " + acumuladorAltos);
	}

}