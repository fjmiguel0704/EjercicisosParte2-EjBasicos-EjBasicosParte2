package ejbasic9;

import java.util.Scanner;
import java.util.Locale;

public class EjBasic9 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Con esto damos la posibilidad al usuario de poder separar la parte decimal de la parte entera mediante puntos en vez de comas
		read.useLocale(Locale.US);
		
		//Le pedimos al usuario que introduzca la cantidad en pesetas
		System.out.print("Indica la cantidad en pesetas: ");
		
		//Declaramos la variable pesetas, que esta recogerá el dato introducido por el usuario
		double pesetas = read.nextDouble();
		
		//Declaramos la variable euros, a la cual le indicamos que será el resultado de la variable pesetas (cantidad introducida por el usuario) dividido por 166.386 (valor de un euro)
		double euros = pesetas / 166.386;
		
		//Mostramos al usuario el resultado de la variable euros, el cual es la cantidad en pesetas introducida por el usuario convertida a euros
		System.out.print(pesetas + " pesetas" + " equivale a: " + euros + "€");

	}

}
