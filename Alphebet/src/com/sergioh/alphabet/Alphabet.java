/*http://ocw.upm.es/lenguajes-y-sistemas-informaticos/programacion-en-java-i/Contenidos/Ejercicios/
  ejerciciosresueltosdelcapitulodesentenciasrepetitivasobucles.pdf*/


package com.sergioh.alphabet;

public class Alphabet {

	public static void main(String[] args) {
		/* Ejercicio resuelto de la pagina que esta en el encabezado del programa.		  
		  3) Construir un programa que visualice por pantalla todos los caracteres correspondientes a letras
             minúsculas		 
		 */

		int letra = 97;

		while (letra <= 122) {
			 char num=(char)letra;//cast
			System.out.println(num);
			letra++;
		}
		
		
	}

}
