package joc.app;

import comu.Teclado;
import joc.interfaz.Jugable;
import joc.numeros.JocEsbrinaNumero;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugable JocEsbrinaNumero = new JocEsbrinaNumero(0, 0, null);
		
		JocEsbrinaNumero.juga();
		
		Teclado.pulsarTecla();
	}

}
