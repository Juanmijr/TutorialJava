package capítulo4.Ejercicioprueba;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	

			// Gesti�n de creaci�n de la persona
			int opcion = menuPersona();
			if (opcion >= 1 && opcion <= 2) {
				Personas persona = construyePersona(opcion);
				System.out.println("Persona " + persona.toString());
			}

			// Gesti�n de creaci�n de la matr�cula
			opcion = menuMatricula();
			if (opcion >= 1 && opcion <= 3) {
				Matricula mat = construyeMatricula(opcion);
				System.out.println("Matr�cula " + mat.toString());
			}
		
		}

		
		/**
		 * 
		 */
		public static int menuPersona () {
			String menuPersona = "Introduzca el tipo de persona"
					+ "\n\n1.- No documentada"
					+ "\n2.- Documentada por DNI";
			
			int opcionPersona = Integer.parseInt(JOptionPane.showInputDialog(
					menuPersona));
			return opcionPersona;
		}
		
		
		/**
		 * 
		 * @param tipoPersona
		 * @return
		 */
		public static Personas construyePersona (int tipoPersona) {
			Personas persona = null;
			
			switch (tipoPersona) {
			case 1: // No documentada
				persona = new PersonaND();
				((PersonaND) persona).setDescripcion(JOptionPane.showInputDialog("Introduzca descripci�n:"));
				break;
			case 2: // Documentada por DNI
				persona = new PersonaD();
				PersonaD perSiDoc = (PersonaD) persona;
				perSiDoc.setNombre(JOptionPane.showInputDialog("Introduzca dni:"));
				break;
			}
			
			persona.setNombre(JOptionPane.showInputDialog("Introduzca nombre:"));
			persona.setApellidos(JOptionPane.showInputDialog("Introduzca apellidos:"));
			persona.setFechaNac(JOptionPane.showInputDialog("Introduzca fecha de nacimiento:"));
			
			return persona;
		}
		
		
		
		/**
		 * 
		 */
		public static int menuMatricula () {
			String menu = "Introduzca el tipo de matr�cula"
					+ "\n\n1.- Matr�cula en ESO"
					+ "\n2.- Matr�cula en Bach"
					+ "\n3.- Matr�cula en FP";
			
			int opcion = Integer.parseInt(JOptionPane.showInputDialog(
					menu));
			return opcion;
		}
		
		
		/**
		 * 
		 * @param tipoPersona
		 * @return
		 */
		public static Matricula construyeMatricula (int tipo) {
			Matricula matricula = null;
			
			switch (tipo) {
			case 1: // en ESO
				matricula = new Matricula_ESO();
				((Matricula_ESO) matricula).setPmar(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca descripci�n:")));
				break;
			case 2: // en Bach
				matricula = new Matricula_Bach();
				((Matricula_Bach) matricula).setModalidad(JOptionPane.showInputDialog("Introduzca descripci�n:"));
				break;
			case 3: // en FP
				matricula = new Matricula_FP();
				((Matricula_FP) matricula).setDual(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca descripci�n:")));
				break;
			}
			
			matricula.setCodigo(JOptionPane.showInputDialog("Introduzca c�digo:"));
			matricula.setFecha(JOptionPane.showInputDialog("Introduzca fecha:"));
			
			return matricula;
		}

	
}
