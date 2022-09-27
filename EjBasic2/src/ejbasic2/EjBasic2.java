package ejbasic2;

import java.util.Scanner;

public class EjBasic2 {
	

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Vamos a pedirle al usuario que indique su edad
		System.out.print("¿Cuál es tu edad?");
		
		//Declaramos la variable age, que será la edad introducida por el usuario 
		int age = read.nextInt();
		
		//Mostraremos al usuario la edad que tendrá el año que viene 
		System.out.print("El año que viene cumplirás: " + ++age + " años");
		

	}

}
