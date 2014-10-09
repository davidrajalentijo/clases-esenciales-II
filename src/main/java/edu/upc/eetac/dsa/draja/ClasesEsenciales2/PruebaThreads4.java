package edu.upc.eetac.dsa.draja.ClasesEsenciales2;

public class PruebaThreads4 {
	public static void main(String args[])
	{
	CuentaAtras4 contador1 = new CuentaAtras4("ID1", 4);
	CuentaAtras4 contador2 = new CuentaAtras4("ID2", 7);
	CuentaAtras4 contador3 = new CuentaAtras4("ID3", 8);
	
	contador1.start();
	contador2.start();
	contador3.start();
	}
	

}