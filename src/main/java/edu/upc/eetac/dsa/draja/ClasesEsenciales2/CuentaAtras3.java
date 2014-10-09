package edu.upc.eetac.dsa.draja.ClasesEsenciales2;

public class CuentaAtras3 extends Thread {
	public String ID;
	public int s;
	public int ultimaescritura;
	

	public CuentaAtras3(String id, int seg) {
		ID = id;
		s = seg;
	}
	public static String id;
	public String id2;

	public void run() {

		while (s >= 0) {
			if (id!=null){
				System.out.println("" + ID + " - " + s+" - Ultima Escritura "
						+id+ " ");
				}
				else{
					System.out.println("" + ID + " - " + s+" - Ultima Escritura "
							 );
				}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}
			id=ID;
			id2=ID;
			s--;
		}
		int cuenta = Thread.activeCount()-2;
		System.out.println(+ cuenta + " Threads activos" );
		
	}

}