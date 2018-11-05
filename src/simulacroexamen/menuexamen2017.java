package simulacroexamen;

import javax.swing.JOptionPane;

public class menuexamen2017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje="";		
		int opcion;
		do {
		String menu = "MENU\n"
				+ "1.- Area Triangulo\n"
				+ "2.- Perimetro Circunferencia\n"
				+ "3.- Numeros aleatorios hasta 47\n"
				+ "0.- Salir\n";
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
		// Resolución de la operación según el tipo de operación pedido por el usuario
		
		switch (opcion) {
		case 1: // Area triangulo
			// Petición de los dos valores, en todos los casos se piden DOS valores
			float base = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la base"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura"));
			mensaje = "Resultado: " + ((base*altura)/2);
			break;
		case 2: // Perimetro circunferencia
			float radio= Float.parseFloat(JOptionPane.showInputDialog("Introduzca un radio")); 
			mensaje =  "Resultado: " + (2* Math.PI *radio);
			break;
		case 3: // Numero aleatorio hasta 47
			int num = 0;
			do {
				num=(int)Math.round(Math.random()*100);
				System.out.print(num);
				System.out.print(" ");
				mensaje= "Numeros generados correctamente";
			} 
			while (num != 47);
			break;
			
		case 0: // Cï¿½lculo del ï¿½rea de un rectï¿½ngulo
			System.exit(0);
			break;
	
		default:
			mensaje = "Opción incorrecta, elija bien";
			}  
		
		// Saca la informaciï¿½n al usuario
		JOptionPane.showMessageDialog(null, mensaje);
		
		}
		while (opcion!=0);
	}

}
