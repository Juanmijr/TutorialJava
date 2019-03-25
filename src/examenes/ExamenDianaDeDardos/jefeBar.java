package examenes.ExamenDianaDeDardos;

import javax.swing.JOptionPane;

public class jefeBar implements centroDianaListener {

	public jefeBar() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nuevoCentroDiana(centroDianaEvent event) {
		JOptionPane.showMessageDialog(null, "Soy el jefe del bar, han dado en el centro de la diana");
		
	}
	

}
