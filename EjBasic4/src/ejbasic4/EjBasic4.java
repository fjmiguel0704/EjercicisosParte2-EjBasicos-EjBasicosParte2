package ejbasic4;

import java.util.Scanner;

public class EjBasic4 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca un primer número 
		System.out.print("Escribe el primer número: ");
		
		//Declaramos la variable number1, que será el primer dato introducido por el usuario
		int number1 = read.nextInt();
		
		//Le pedimos ahora al usuario que introduzca un segundo número
		System.out.print("Escribe el segundo número: ");
		
		//Declaramos la variable number2, que será el segundo dato introducido por el usuario
		int number2 = read.nextInt();
		
		//Declaramos la variable resultado, la cual será la suma de los dos datos introducido dividido por 2. Este resultado contendrá decimales
		double resultado = (number1 + number2) /2;
		
		//Le mostramos al usuario el resultado de la variable "resultado". Esta es la media aritmética de los dos números introducidos por el usuario
		System.out.print("la media aritmética es: " + resultado);

	}

}
