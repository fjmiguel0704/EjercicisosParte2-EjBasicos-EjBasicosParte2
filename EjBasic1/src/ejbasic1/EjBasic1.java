package ejbasic1;

import java.util.Scanner;

public class EjBasic1 {

	public static void main(String[] args) {
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner(System.in);
		
		//Vamos a pedirle al usuario que introduzca un número
		System.out.print("Escribe un número: ");
				
		//Declaramos la variable number, la cual será el número introducido por el usuario
		int number = read.nextInt();
		
		
		//Vamos a mostrarle al usuario el número que introdujo
		System.out.print(number);

	}

}
