package ejbasic10;

import java.util.Scanner;
import  java.util.Locale;

public class EjBasic10 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Con esto damos la posibilidad al usuario de poder separar la parte decimal de la parte entera mediante puntos en vez de comas
		read.useLocale(Locale.US);
		
		//Le pedimos al usuario que introduzca el precio al que le quiere aplicar el IVA
		System.out.print("Introduce el precio al que quieres aplicar el IVA: ");
		
		//Declaramos la variable price, que guardará el dato el introducido por el usuario
		double price = read.nextDouble();
		
		//Declaramos al IVA una variable constante (iva) ya que el valo simepre será el mismo. Y esta será igual a la variable price dividido por 100 y multiplicado por 21.
		final double iva = (double) ((price /100) * 21);
		
		//Declramos la variable priceFinal, que será el resultado de la suma de la variable price mas la variable iva
		double	priceFinal = price + iva;
		
		//Le mostramos al usuario la cantidad de IVA que se le va a aplicar
		System.out.println("La cantidad de IVA es: " + iva);
		
		//Le mostramos también cuál será el precio final con el IVA ya aplicado al pecio
		System.out.print("El precio con IVA aplicado es de: " + priceFinal);
		

	}

}
