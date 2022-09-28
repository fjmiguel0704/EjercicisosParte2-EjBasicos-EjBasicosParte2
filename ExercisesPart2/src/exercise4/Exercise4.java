package exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Creamos las variables
		int x;
		int y;
		int intermediario = 0;
		
		//Le pedimos al usuario que introduzca el valor de x
		System.out.print("Valor de x: ");
		
		//Declaramos la variable x, que será el dato introducido por el usuario
		x = read.nextInt();
		
		//Le pedimos al usuario que introduzca el valor de x
		System.out.print("Valor de y: ");
		
		//Declaramos la variable x, que será el dato introducido por el usuario
		y = read.nextInt();
		
		//Declaramos las variable para hacer intercambiar los datos entre ellas
		intermediario = x;
		x = y;
		y = intermediario;
		
		//Le mostramos al usuario el resultado de los intercambios
		System.out.println("x vale: " + x);
		System.out.println("y vale: " + y);
		


	}

}
