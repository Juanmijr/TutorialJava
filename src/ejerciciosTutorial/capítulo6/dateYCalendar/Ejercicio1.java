package ejerciciosTutorial.capítulo6.dateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	
	public static void main(String[] args) {
	pedirFecha();	
	}

	private static void pedirFecha() {
		
				String fecha1 =  JOptionPane.showInputDialog("Introduzca una fecha");
				SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
				 formateoFecha(fecha1, sdf2);
	}

	private static void formateoFecha(String fecha1, SimpleDateFormat sdf2) {
		Date fecha = null;
		try {
			fecha = (sdf2.parse(fecha1));
			System.out.println(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		setCalendar(fecha);
	}
	
	private static void setCalendar (Date fecha) {
		Calendar calendario = Calendar.getInstance();

		calendario.setTime(fecha);
		
		System.out.println("Año: " + calendario.get(Calendar.YEAR)
		+"\n Mes: " + calendario.get(Calendar.MONTH) 
		+"\n Día: " + calendario.get(Calendar.DAY_OF_MONTH)
		+"\n Hora: " + calendario.get(Calendar.HOUR_OF_DAY)
		+"\n Minutos: " + calendario.get(Calendar.MINUTE)
		+"\n Segundos: " + calendario.get(Calendar.SECOND));
		
		
		calendario.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendario.getTime());
		calendario.setTime(fecha);
		calendario.add(Calendar.WEEK_OF_YEAR, -2);
		System.out.println(calendario.getTime());
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_YEAR, 300);
		System.out.println(calendario.getTime());
		calendario.setTime(fecha);
		calendario.add(Calendar.YEAR, 4);
		System.out.println(calendario.getTime());
		
	}
	
	}


