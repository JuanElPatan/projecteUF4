package joc.app;

import joc.interfaz.Jugable;
import joc.numeros.JocEsbrinaNumero;

public class Application {

	public static void main(String[] args) {
		Jugable esbrina = new JocEsbrinaNumero(5, (int) (Math.random() * 10 + 1), "Esbrina");
		esbrina.mostraInfo();
		esbrina.juga();
	}
}