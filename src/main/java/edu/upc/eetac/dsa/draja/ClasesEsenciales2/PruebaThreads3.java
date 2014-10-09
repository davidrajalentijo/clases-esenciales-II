package edu.upc.eetac.dsa.draja.ClasesEsenciales2;

public class PruebaThreads3 {
	public static void main(String args[])
	{
	CuentaAtras3 contador1 = new CuentaAtras3("ID1", 4);
	CuentaAtras3 contador2 = new CuentaAtras3("ID2", 7);
	CuentaAtras3 contador3 = new CuentaAtras3("ID3", 8);
	
	contador1.start();
	contador2.start();
	contador3.start();
	}
	

}