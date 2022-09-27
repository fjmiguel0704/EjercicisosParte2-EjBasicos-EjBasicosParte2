package ejbasic6;

import java.util.Scanner;

public class EjBasic6 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Escribe el primer número: ");
		
		//Declaramos la variable number1, que será el primer número introducido por el usuaro
		int number1 = read.nextInt();
		
		//Le pedimos ahora al usuario que introduzca el segundo número 
		System.out.print("Escribe el segundo número: ");
		
		//Declaramos la varibale number2, que será el segundo número introducido por el usuario
		int number2 = read.nextInt();
		
		//Declaramos la variable suma, que esta contendrá el resultado de la suma de los dos números introducidos por el usuario
		int suma = (number1 + number2);
		
		//Declaramos la variable resta, que esta contendrá el resultado de la resta de los dos números introducidos por el usuario
		int resta = (number1 - number2);
		
		//Declaramos la variable multiplicación, que esta contendrá el resultado de la multiplicación de los dos números introducidos por el usuario
		double multiplicación = (number1 * number2);
		
		//Declaramos la variable división, que esta contendrá el resultado de la división de los dos números introducidos por el usuario
		double división = (number1 / number2);
		
		//Mostramos el resultado de la variable suma
		System.out.println("La Suma es: " + suma);
		
		//Mostramos el resultado de la variable resta
		System.out.println("La Resta es: " + resta);
		
		//Mostramos el resultado de la variable multiplicación
		System.out.println("La Multiplicación es: " + multiplicación);
		
		//Mostramos el resultado de la variable división
		System.out.println("La División es: " + división);

	}

}
