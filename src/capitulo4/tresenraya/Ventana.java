package capitulo4.tresenraya;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public  class Ventana extends Canvas{

	// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
	// de la ventana
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;
	private static Ventana instance = null;
	private Celda celdas[] = new Celda[8];
	
	// Variables que determinan el aspecto de la escena
	public static String imgBackground = "";
	public static final Color COLOR_PERSONAJE_NORMAL = Color.green;
	public static final Color COLOR_PERSONAJE_FALLO = Color.red;
	
	
	
	public Ventana () {
		
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("3 en raya");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
		this.setBounds(0,0,WIDTH+10,HEIGHT+35);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);
		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);	// TODO Auto-generated method stublse);
	
		this.addMouseListener(new MouseAdapter() {
						
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Celda celda : celdas) {
					if(celda.isEnCoordenadas(e.getX(), e.getY())) {
						celda.mouseClicked();
					}
				}
			
				
			}
		});
		this.addMouseListener(new MouseAdapter() {
		});
		initCeldas();
		
	}
	@Override
	public void paint (Graphics g) {
		for (Celda celda: celdas) {
			celda.paint(g);
		}
	}
	/**
	 * 
	 */
	private void initCeldas() {
		celdas[0] = new Celda(0,0, this);
		celdas[1] = new Celda(200,0,this);
		celdas[2] = new Celda(400,0, this);
		celdas[3] = new Celda(0,200, this);
		celdas[4] = new Celda(200,200, this);
		celdas[5] = new Celda(400,200, this);
		celdas[6] = new Celda(0,400, this);
		celdas[7] = new Celda(200,400, this);
		celdas[8] = new Celda(400,400, this);
	}
	// SINGLETON
		public static Ventana getInstance() {
			if (instance == null) {
				instance = new Ventana();
			}
			return instance;
		}
}