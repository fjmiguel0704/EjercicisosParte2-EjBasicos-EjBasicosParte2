package exercise1;

import java.util.Scanner;

public class Exercise1 {
	

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner keyboard = new Scanner(System.in);
		
		//Declaramos la variable YEAR, que será constante ya que nunca cambiará su valor. Esta será igual a 2022
		final int YEAR = 2022;
		
		//Creamos las variables age y bornIn, a las que más adelante declararemos
		int age, bornIn;
		
		//Le pedimos al usuario que introduzca su edad
		System.out.print("How old are you this year?");
		
		//Declaramos la variable age, que será el dato que el usuario introduzca
		age = keyboard.nextInt();
		
		//Declaramos la variable bornIn, que esta será la resta del valor de la variable YEAR (2022) menos el valor de la variable age
		bornIn = YEAR - age;
		
		//Le mostramos al usuario su año de nacimiento
		System.out.println("I think you were born in " + bornIn);
		keyboard.close();


	}

}
