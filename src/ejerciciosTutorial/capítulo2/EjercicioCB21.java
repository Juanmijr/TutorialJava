package capítulo2;
import javax.swing.JOptionPane;

public class EjercicioCB21 {

	public static void main(String[] args) {
		String texto = "Introduce un número";
		int acumuladorNegativos =0; //Acumulador para números negativos
		int acumuladorBajos =0; //Acumulador para números negativos
		int acumuladorMedios =0; //Acumulador para números negativos
		int acumuladorAltos =0; //Acumulador para números negativos
			
//Primer número
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
		
		// segundo número
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
			
		// tercer número
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
			
		// cuarto número
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
			
		// quinto número
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