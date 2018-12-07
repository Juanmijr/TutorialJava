package capitulo4.EjercicioAhorcado.Version1;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class CacheImagenes {
	// Patrón Singleton
	private static CacheImagenes cache= null;
	
	
	/**
	 * Getter del patrón Singleton
	 * @return
	 */
	public static CacheImagenes getCache() {
		if (cache == null) {
			cache = new CacheImagenes();
		}
		return cache;
	}
	
	
	/**
	 * Método que permite obtener una imagen del sistema de ficheros. No es necesario que 
	 * en este momento de tu aprendizaje entiendas el 100% del siguiente método. Es 
	 * demasiado complejo. Sólo tienes que entender que esté método te devuelve un objeto
	 * de tipo BufferedImage, que podrás utilizar para poder pintar un archivo de imagen
	 * sobre tu ventana.
	 * @param nombre
	 * @return
	 */
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/capitulo4/EjercicioAhorcado/Version1/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
}
