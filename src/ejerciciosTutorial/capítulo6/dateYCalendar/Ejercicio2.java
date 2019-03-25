package ejerciciosTutorial.capítulo6.dateYCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ejercicio2 {

	private static void ZonasHorarias () {
		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Roma"));
		Calendar ahoraEnNewYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

		System.out.println("Hora romana: " + ahoraEnRoma.get(Calendar.HOUR)+":" + ahoraEnRoma.get(Calendar.MINUTE));
		System.out.println("Hora en New York: " + ahoraEnNewYork.get(Calendar.HOUR)+":" + ahoraEnNewYork.get(Calendar.MINUTE));

		System.out.println("<------------------------------------------------------>");
		 float dias=(float) ((ahoraEnRoma.get(Calendar.HOUR)-ahoraEnNewYork.get(Calendar.HOUR)));
		 System.out.println("Diferencia entre Roma y New York: " + dias );
	}
	
	public static void main(String[] args) {
ZonasHorarias();

	}

}
