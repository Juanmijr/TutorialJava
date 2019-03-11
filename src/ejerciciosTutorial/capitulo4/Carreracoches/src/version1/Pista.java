package version1;

public class Pista {
	Obstaculo[] obstaculos = new Obstaculo [4];
	int contadorarray = 0;
	
	Vehiculo vehiculos; 
	public Pista(Vehiculo vehiculos) {
		super();
		vehiculos = this.vehiculos;
		getObstaculos();
	}
	@Override
	public String toString() {
		return "Pista [vehiculos=" + vehiculos + "]";
	}
	
	void getObstaculos() {
		do{		
			int o = (int) Math.round(Math.random());
				 if (o==0){
					 obstaculos[contadorarray]= new Rampa();
				 }
				 else {
					 obstaculos[contadorarray]=new ManchaAceite();
				 }
				 
				 contadorarray++;
				
		}while(obstaculos[contadorarray]==null && contadorarray<=4);
	}

	
}
