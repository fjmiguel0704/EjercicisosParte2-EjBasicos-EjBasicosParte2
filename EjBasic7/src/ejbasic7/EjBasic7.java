package ejbasic7;

import java.util.Scanner;

public class EjBasic7 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca su nombre
		System.out.print("Introduce tu nombre: ");
		
		//Declaramos la variable name, que esta guardará el nombre introducido por el usuario
		String name = read.nextLine();
		
		//Le pedimos al usuario que introduzca su dirección
		System.out.print("Introduce tu dirección: ");
		
		//Declaramos la variable direction, que esta guardará la dirección introducida por el usuario
		String direction = read.nextLine();
		
		//Le pedimos al usuario que introduzca su número de teléfono
		System.out.print("Introduce tu teléfono: ");
		
		//Declaramos la variable telephone, que guardará el número introducido por el usuario
		int telephone = read.nextInt();
		
		//Le mostramos al usuario el resultado de la variable name. Este será su nombre
		System.out.println("Nombre: " + name);
		
		//Le mostramos al usuario el resultado de la variable direction. Este será su dirección
		System.out.println("Dirección: " + direction);
		
		//Le mostramos al usuario el resultado de la variable telephone. Este será su número de teléfono
		System.out.println("Teléfono: " + telephone);
		

	}

}
