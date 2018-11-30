package joc.app;

import comu.Teclado;
import joc.interfaz.Jugable;
import joc.numeros.JocEsbrinaImpar;
import joc.numeros.JocEsbrinaNumero;
import joc.numeros.JocEsbrinaPar;
import joc.numeros.Generador;

public class ApplicationSencera {

	public static void main(String[] args) {
		String continuar = "NO";
		do {
			Jugable joc = triaJoc();
			joc.mostraNombre();
			joc.mostraInfo();
			joc.juga();
			System.out.print("Desitja continuar (SI/NO)? ");
			continuar = Teclado.llegeixCadena();
		} while (continuar.equalsIgnoreCase("SI"));
	}

	public static Jugable triaJoc() {
		Generador gen = new Generador();
		Jugable jocs[] = new Jugable[3];
		
		System.out.println("Introduce las vidas:");
		int vida = Teclado.llegeixEnter();
		
		jocs[0] = new JocEsbrinaNumero(vida, (int) (Math.random() * 10 + 1), "Esbrina");
		jocs[1] = new JocEsbrinaPar(vida, gen.GenerarPar(), "Esbrina Par");
		jocs[2] = new JocEsbrinaImpar(vida, gen.GenerarInpar(), "Esbrina Impar");
		int opcio = 3;
		
		do {
			System.out.println("======== MENÚ PRINCIPAL ========");
			System.out.println("0. Juego adivinar número");
			System.out.println("1. Juego adivinar par");
			System.out.println("2. Juego Adivinar número");
			System.out.print("Introduzca número: ");
			opcio = Teclado.llegeixEnter();
			
			if (!((opcio == 0) || (opcio == 1) || (opcio == 2))) {
				System.out.println("Esa opción no existe.");
			}
		} while(!((opcio == 0) || (opcio == 1) || (opcio == 2)));
		
		return jocs[opcio]; 
	}
}