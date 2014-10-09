package edu.upc.eetac.dsa.draja.ClasesEsenciales2;

public class CuentaAtras extends Thread {
	public String ID;
	public int s;
	

	public CuentaAtras(String id, int seg) {
		ID = id;
		s = seg;
	}
	public static String id=null;

	public void run() {

		while (s >= 0) {
			System.out.println(id);

			System.out.println("Contador: " + ID + " quedan " + s
					+ " segundos");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}
			id=ID;
			s--;
		}
		int cuenta = Thread.activeCount()-2;
		System.out.println(+ cuenta + " Threads activos" );
	}
	}