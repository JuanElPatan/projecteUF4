package comu;

import java.util.*;

public abstract class Teclado {
	
	public static Scanner scn = new Scanner(System.in);
	
	public static char llegeixCharacter() {
		char character;
		
		character = scn.next().charAt(0);
		
		return character;
	}
	
	public static String llegeixCadena() {
		String cadena;
		
		cadena = scn.nextLine();
		
		return cadena;
	}
	
	public static int llegeixEnter() {
		int enter;
		
		enter = scn.nextInt();
		
		return enter;
	}
	
	public static String pulsarTecla() {
		String espai = "";
		
		System.out.println("Prémer enter per continuar.");
		
		espai = scn.nextLine();
		
		return espai;
	}
}
