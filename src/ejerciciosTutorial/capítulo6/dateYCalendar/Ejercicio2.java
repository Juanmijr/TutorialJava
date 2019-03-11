package ejerciciosTutorial.capítulo6.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio2 {

	private static void ZonasHorarias () {
		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getDefault());
		Calendar ahoraEnNewYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Hora romana: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en New York: " + ahoraEnNewYork.get(Calendar.HOUR_OF_DAY));

		System.out.println("<------------------------------------------------------>");
		 int dias=(int) ((ahoraEnRoma.getTime()-ahoraEnNewYork.getTime())/86400000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
