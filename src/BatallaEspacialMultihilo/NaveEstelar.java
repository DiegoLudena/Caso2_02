package BatallaEspacialMultihilo;

public class NaveEstelar implements Runnable{
	
	//Cada nave necesita tener un bando y una posición. Creo un constructor para la nave, con sus getters y setters
	private String bando;
	private int posicion;
	
	
	public NaveEstelar(String bando, int posicion) {
		this.bando = bando;
		this.posicion = posicion;
	}
	
	

	/*Creo el método Avanzar para que las naves avancen su posición una distancia aleatoria. Voy a hacer que sea entre 1 y 100 metros. 
	 Para que los hilos no se superpongan entre sí, es necesario un monitor, así que hago el método synchronized*/
	
	public String getBando() {
		return bando;
	}



	public void setBando(String bando) {
		this.bando = bando;
	}



	public int getPosicion() {
		return posicion;
	}



	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}



	public synchronized void Avanzar(int distancia) {
		posicion += distancia;
		System.out.println("¡La nave " + bando +" ha avanzado " +distancia +" parsecs!");
	}
	

	//Como implementa Runnable, hay que hacer override del método run
	@Override
	public void run() {
		//Run genera un número aleatorio y llama al método avanzar, usando ese número como argumento
		int distancia = (int) (Math.random()*100)+1;
		//Duermo el hilo para "dar tiempo a que avance"
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Avanzar(distancia);			
		
		
	}
	
	

}
