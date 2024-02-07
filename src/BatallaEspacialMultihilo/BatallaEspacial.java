package BatallaEspacialMultihilo;

public class BatallaEspacial {

	public static void main(String[] args) {
		//Necesito dos naves para la batalla
		
		NaveEstelar Zorg = new NaveEstelar("Zorg", 0);
		NaveEstelar Blip = new NaveEstelar("Blip", 0);

		//Como NaveEstelar implementa Runnable, tengo que crear un hilo para cada nave
		
		Thread hiloZorg; //= new Thread(Zorg);
		Thread hiloBlip; //= new Thread(Blip);
		
		//Como quiero que la batalla dure 200 avances, creo un bucle para llamar 200 veces a los hilos
		int rondas = 200; //Lo hago con una variable para que sea más fácil de cambiar. Se podría preguntar cuánto dura la batalla en lugar de usar el número que pone el ejercicio como ejemplo.
		int cuentarondas=0;
		while (cuentarondas<rondas) {
			
			//En cada ronda hay que crear un nuevo hilo y llamar a su start. De no hacerlo así da una excepción IllegalThreadStateException.
            System.out.println("Ronda " + (cuentarondas+1) ); //Para evitar que empiece en 0 y acabe en 199
			hiloZorg = new Thread(Zorg);
            hiloBlip = new Thread(Blip);
			hiloZorg.start();
			hiloBlip.start();
			//Hago que los hilos se esperen para que estén siempre en la misma ronda
			try {
				hiloZorg.join();
				hiloBlip.join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			cuentarondas++;
		}
		System.out.println("La nave Zorg ha recorrido " + Zorg.getPosicion() +" parsecs");
		System.out.println("La nave Blip ha recorrido " + Blip.getPosicion() + " parsecs");
		if( Zorg.getPosicion()>Blip.getPosicion()) {
			System.out.println("¡Los Zorg han ganado la batalla!");
		} else if (Zorg.getPosicion()<Blip.getPosicion()) {
			System.out.println("¡Los Blip han ganado la batalla!");
		} else {
			System.out.println("¡Ha habido un empate!");
		}
		

	}

}
