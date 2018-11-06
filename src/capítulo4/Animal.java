package capítulo4;

public class Animal {

	
	public String nombre;
	public float alturaCm;
	public float longitudCm;
	public int edad;
	public String color;
	
	public Animal (String nombreVar) {
		this.nombre = nombreVar;
	}
	public Animal (String nombreVar, float alturaCmVar, float longitudCmVar, int edadVar, String colorVar) {
		nombre = nombreVar;
		alturaCm = alturaCmVar;
		longitudCm= longitudCmVar;
		edad=edadVar;
		color = colorVar;
	}
	void andar (){
		System.out.println("Mi nombre es " + nombre + " estoy ANDANDO");
	}
	void correr (){
		System.out.println("Mi nombre es " + nombre + " estoy CORRIENDO");
	}
	void imprimirCaracteristicas (){
		System.out.println("Mi nombre es " + nombre + ", mi altura es " + alturaCm + ", mi longitud es " 
							+ longitudCm +", mi edad es " + edad + ", mi color es " + color);
	}
}
