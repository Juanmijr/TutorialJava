package capitulo4.formula1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

//La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
//libremente.

public class Ventana extends Canvas {


		// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
		// de la ventana
		public static final int WIDTH = 640;
		public static final int HEIGHT = 700;
		public static Ventana ventana = null;
		public static final int Y_PISTA1 = 495;
		public static final int Y_PISTA2 = 335;
		public static final int Y_PISTA3 = 175;
		public static final int Y_PISTA4 = 15;
		public static final int LONGITUD_PISTA = 525;
		public static final int ANCHO_PISTA= 150;
		
		
		public Ventana () {
			// La clase JFrame nos permite mostrar una ventana en pantalla
			JFrame ventana = new JFrame("El juego del ahorcado");
			// Establecemos las dimensiones que queremos que tenga
			ventana.setBounds(0,0,WIDTH,HEIGHT);
			
			// Obtengo una referencia al panel principal de la ventana.
			// Todas las ventanas tienen un panel principal	
			JPanel panel = (JPanel)ventana.getContentPane();

			// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
			panel.add(this);

			// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
			this.setBounds(0,0,WIDTH,HEIGHT);
			
			// Provocamos que el programa se acabe cuando cerramos la ventana 
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Hacemos visible la ventana.
			ventana.setVisible(true);
			// Evitamos que la ventana pueda redimensionarse.
			ventana.setResizable(false);
			
			// Inicializo el doble buffer a partir del buffer del propio objeto Canvas
			createBufferStrategy(2);
			getBufferStrategy();
		}
		
		
		
		/**
		 * Sobrescribimos el m�todo "paint" que tienen todos los componentes gr�ficos en AWT-SWING
		 */
		@Override
		public void paint(Graphics g) {
			paintPistas(g);
			
			
			
		}
		public void paintPistas (Graphics g) {
			
			// Pintamos la imagen  sobre la pantalla
			g.setColor(Color.decode("#0B610B"));
			g.fillRect(0, 0, WIDTH, HEIGHT);
			
	
			//Primera pista
			g.setColor(Color.black);
			g.fillRect(60, Y_PISTA1, ANCHO_PISTA, LONGITUD_PISTA);
			//Segunda pista
			g.setColor(Color.black);
			g.fillRect(60, Y_PISTA2, ANCHO_PISTA, LONGITUD_PISTA);
			//Tercera pista
			g.setColor(Color.black);
			g.fillRect(60, Y_PISTA3, ANCHO_PISTA, LONGITUD_PISTA);
			//Tercera pista
			g.setColor(Color.black);
			g.fillRect(60, Y_PISTA4, ANCHO_PISTA, LONGITUD_PISTA);
		}
				
		//Singleton
		public static  Ventana getventana() {
			if(ventana==null) {
				ventana = new Ventana();
			}
			return ventana;
	
		}
}
