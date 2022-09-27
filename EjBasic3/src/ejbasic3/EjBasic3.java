package ejbasic3;

import java.util.Scanner;

public class EjBasic3 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca el año actual
		System.out.print("Introduce el año actual: ");
		
		//Declaramos la variable yeara, que será el año actual introducido por el usuario
		int yeara = read.nextInt();
		
		//Le pedimos en este caso al usuaro que introduzca su año de nacimiento 
		System.out.print("Introduce el año de tu nacimiento: ");
		
		//Declaramos la variable yearn, que será el año de nacimiento introducido por el usuario
		int yearn = read.nextInt();
		
		//Le mostramos al usuario la edad que tiene actualmente tras hacer la resta del año actual menos la el año de nacimiento
		System.out.print(yeara - yearn + " años");
		

	}

}
