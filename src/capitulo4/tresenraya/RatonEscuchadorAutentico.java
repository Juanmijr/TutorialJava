package capitulo4.tresenraya;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RatonEscuchadorAutentico extends MouseAdapter {

	
	public void mousedCliked(MouseEvent e) {
		System.out.println("Sou un ratón escuchador auténtico y me han hecho click");
	}
}
