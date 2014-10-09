package edu.upc.eetac.dsa.draja.ClasesEsenciales2;

public class PruebaThreads2 {
	public static void main(String args[])
	{
	CuentaAtras2 c1 = new CuentaAtras2("ID1", 4);
	CuentaAtras2 c2 = new CuentaAtras2("ID2", 7);
	CuentaAtras2 c3 = new CuentaAtras2("ID3", 8);
	
	Thread t1 = new Thread(c1);
	Thread t2 = new Thread(c2);
	Thread t3 = new Thread(c3);

	t1.start();
	t2.start();
	t3.start();
	}
	
}