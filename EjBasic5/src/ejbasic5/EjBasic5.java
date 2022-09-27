package ejbasic5;

import java.util.Scanner;

public class EjBasic5 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el radio de la circunferencia 
		System.out.print("Introduce el radio: ");
		
		//Declaramos la variable radius, que será el dato introducido por el usuario 
		double radius = read.nextDouble();
		
		//Declaramos la variable area, que esta será el cálculo de PI por el radio al cuadrado. Para calcular el area de la circunferencia
		double area = Math.PI * (Math.pow(radius,2 ));
		
		//Declaramos la variable longitud, que será el cálculo de Pi por 2 por el radio. Para calcular la longitud de la circunferencia
		double longitud = Math.PI * (2 * radius);
		
		//Le mostramos al usuario el resultado de la variable area, el cual muestra el area de la circunferencia
		System.out.println("El área de la circunferencia es: " + area);
		
		//Le mostramos al usuario el resultado de la variable longitud, el cual muestra la longitud de la circunferencia
		System.out.print("La longitud de la circunferencia es: " + longitud);

	}

}
